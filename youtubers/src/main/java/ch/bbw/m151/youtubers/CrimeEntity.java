package ch.bbw.m151.youtubers;

import javax.persistence.*;

@Entity(name = "crimes")
public class CrimeEntity {
    @Id
    private Long id;

    private String incidentNumber;

    private String offenseCode;

    private String offenseCodeGroup;

    private String offenseDescription;

    private String district;

    private Integer reportingArea;

    private String occurredOnDate;

    private Integer crimeYear;

    private String crimeMonth;

    private String crimeDayOfWeek;

    private Integer crimeHour;

    private String ucrPart;

    private String street;

    private String location;
}
