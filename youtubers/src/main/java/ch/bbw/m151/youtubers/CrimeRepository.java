package ch.bbw.m151.youtubers;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CrimeRepository extends JpaRepository<CrimeEntity, Long> {
    //List<YoutuberEntity> findAllByAudienceCountryIs(String country);
 //   List<CrimeEntity> findAllBySubscribersGreaterThanEqual(Long subscribers);
   // List<YoutuberEntity> findAllByCategoryOrderByUsername(Long category, Pageable pageable);
 //   @Query("SELECT  DISTINCT audienceCountry FROM youtubers where audienceCountry is not null")
   // List<String> distinctAudienceCountries();
}
