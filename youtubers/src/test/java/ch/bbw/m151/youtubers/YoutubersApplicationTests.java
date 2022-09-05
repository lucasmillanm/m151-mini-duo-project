package ch.bbw.m151.youtubers;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YoutubersApplicationTests implements WithAssertions {

	@Autowired
	YoutubeRepository youtubeRepository;

	@Test
	void contextLoads() {
		assertThat(youtubeRepository.findAllBySubscribersGreaterThanEqual(100000000L));
		assertThat(youtubeRepository.distinctAudienceCountries());
	}

}
