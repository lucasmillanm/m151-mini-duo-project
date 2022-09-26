package ch.bbw.m151.youtubers;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "crimes")
@Getter
@Setter
public class CrimeEntity {

    @Id
    private Long id;

    private String incidentNumber;

    private Integer offenseCode;

    private String offenseCodeGroup;

    private String offenseDescription;

    private String district;

    private Integer reportingArea;

    private String occurredOnDate;

    private Integer crimeYear;

    private Integer crimeMonth;

    private String crimeDayOfWeek;

    private Integer crimeHour;

    private String ucrPart;

    private String street;

    private String location;
}
