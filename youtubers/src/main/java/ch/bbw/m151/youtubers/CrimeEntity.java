package ch.bbw.m151.youtubers;

import javax.persistence.*;

@Entity(name = "crimes")
public class CrimeEntity {
    @Id
    private Long incidentNumber;

    private String offenseCode;

    private String offenseCodeGroup;

    private String offenseDescription;

    private String district;

    private Integer reporting_area;

    private String occurredOnDate;

    private Integer year;

    private String month;

    private String dayOfWeek;

    private Integer hour;

    private String ucrPart;

    private String street;

    private String location;
}
