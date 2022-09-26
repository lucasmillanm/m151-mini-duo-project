package ch.bbw.m151.youtubers;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrimeApplicationTests implements WithAssertions {

	@Autowired
	CrimeRepository crimeRepository;

	@Test
	void TestFindByCrimeAndWeek() {
		var n = crimeRepository.findAllByCrimeYearAndAndCrimeMonth(2017, 2);
		assertThat(n).anyMatch(crimeEntity -> crimeEntity.getId() == 7578);
	}

	@Test
	void TestDeleteEntity(){
		var n = crimeRepository.deleteAllByIncidentNumber("I182070945");
		//assertThat(n).doesNotHaveAnyElementsOfTypes()
	}

}
