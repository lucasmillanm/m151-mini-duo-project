package ch.bbw.m151.youtubers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface YoutubeRepository extends JpaRepository<YoutuberEntity, Long> {
    //List<YoutuberEntity> findAllByAudienceCountryIs(String country);
    List<YoutuberEntity> findAllBySubscribersGreaterThanEqual(Long subscribers);
   // List<YoutuberEntity> findAllByCategoryOrderByUsername(Long category, Pageable pageable);
 //   @Query("SELECT  DISTINCT audienceCountry FROM youtubers where audienceCountry is not null")
   // List<String> distinctAudienceCountries();
}
