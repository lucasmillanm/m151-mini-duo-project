package ch.bbw.m151.youtubers;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrimeApplicationTests implements WithAssertions {

	@Autowired
	CrimeRepository crimeRepository;

//	@Test
//	void contextLoads() {
//		assertThat(crimeRepository.findAllBySubscribersGreaterThanEqual(100000000L));
//		//assertThat(youtubeRepository.distinctAudienceCountries());
//	}



}
