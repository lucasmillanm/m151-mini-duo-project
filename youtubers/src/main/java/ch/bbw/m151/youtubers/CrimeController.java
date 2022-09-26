package ch.bbw.m151.youtubers;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crimes")
public class CrimeController {
    private final CrimeRepository crimeRepository;

    public CrimeController(CrimeRepository crimeRepository) {
        this.crimeRepository = crimeRepository;
    }

    @GetMapping("/all")
    public List<CrimeEntity> getAllCrimes() {
        return crimeRepository.findAll();
    }

    @GetMapping("/get-by-year-and-month/{year}/{month}")
    public List<CrimeEntity> findAllByYearAndAndMonth(
            @PathVariable("year") Integer year,
            @PathVariable("month") Integer month
    ) {
        return crimeRepository.findAllByCrimeYearAndAndCrimeMonth(year, month);
    }

    @GetMapping("/week-day/{day-of-week}")
    public List<CrimeEntity> getByDayOfWeek(
            @PathVariable("day-of-week") String dayOfWeek,
            Pageable pageable
    ) {
        return crimeRepository.findAllByCrimeDayOfWeek(dayOfWeek, pageable).toList();
    }

    @GetMapping("/get-by-reporting-area/{reportingArea}")
    public List<CrimeEntity> findAllByReportingArea(
            @PathVariable("reportingArea") String reportingArea
    ) {
        return crimeRepository.findAllByReportingArea(reportingArea);
    }

    @DeleteMapping("/delete-by-incident-number/{incident-number}")
    public List<CrimeEntity> deleteByIncidentNumber(
            @PathVariable("incident-number") String incidentNumber
    ) {
        return crimeRepository.deleteAllByIncidentNumber(incidentNumber);
    }

}
