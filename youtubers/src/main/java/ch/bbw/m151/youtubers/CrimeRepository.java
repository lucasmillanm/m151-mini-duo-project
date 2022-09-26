package ch.bbw.m151.youtubers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.EntityManager;
import java.util.List;

public interface CrimeRepository extends JpaRepository<CrimeEntity, Long> {
    //List<YoutuberEntity> findAllByAudienceCountryIs(String country);
 //   List<CrimeEntity> findAllBySubscribersGreaterThanEqual(Long subscribers);
   // List<YoutuberEntity> findAllByCategoryOrderByUsername(Long category, Pageable pageable);
 //  @Query("SELECT  DISTINCT audienceCountry FROM youtubers where audienceCountry is not null")
   // List<String> distinctAudienceCountries();


    List<CrimeEntity> findAllByOffenseCodeGroupAndAndCrimeDayOfWeek(String offenseCodeGroup, String crimeDayOfWeek);


    Page<CrimeEntity> findAllByCrimeDayOfWeek(String dayOfWeek, Pageable pageable);


    @Query("SELECT c FROM crimes c WHERE c.reportingArea = ?1")
    List<CrimeEntity> findAllByReportingArea(String reportingArea);


    List<CrimeEntity> deleteCrimeEntitiesByIncidentNumber(String incidentNumber);


}