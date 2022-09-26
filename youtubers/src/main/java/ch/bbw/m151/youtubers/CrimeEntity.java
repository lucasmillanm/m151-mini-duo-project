package ch.bbw.m151.youtubers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "crimes")
@Getter
@Setter
public class CrimeEntity {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIncidentNumber() {
        return incidentNumber;
    }

    public void setIncidentNumber(String incidentNumber) {
        this.incidentNumber = incidentNumber;
    }

    public String getOffenseCode() {
        return offenseCode;
    }

    public void setOffenseCode(String offenseCode) {
        this.offenseCode = offenseCode;
    }

    public String getOffenseCodeGroup() {
        return offenseCodeGroup;
    }

    public void setOffenseCodeGroup(String offenseCodeGroup) {
        this.offenseCodeGroup = offenseCodeGroup;
    }

    public String getOffenseDescription() {
        return offenseDescription;
    }

    public void setOffenseDescription(String offenseDescription) {
        this.offenseDescription = offenseDescription;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getReportingArea() {
        return reportingArea;
    }

    public void setReportingArea(Integer reportingArea) {
        this.reportingArea = reportingArea;
    }

    public String getOccurredOnDate() {
        return occurredOnDate;
    }

    public void setOccurredOnDate(String occurredOnDate) {
        this.occurredOnDate = occurredOnDate;
    }

    public Integer getCrimeYear() {
        return crimeYear;
    }

    public void setCrimeYear(Integer crimeYear) {
        this.crimeYear = crimeYear;
    }

    public String getCrimeMonth() {
        return crimeMonth;
    }

    public void setCrimeMonth(String crimeMonth) {
        this.crimeMonth = crimeMonth;
    }

    public String getCrimeDayOfWeek() {
        return crimeDayOfWeek;
    }

    public void setCrimeDayOfWeek(String crimeDayOfWeek) {
        this.crimeDayOfWeek = crimeDayOfWeek;
    }

    public Integer getCrimeHour() {
        return crimeHour;
    }

    public void setCrimeHour(Integer crimeHour) {
        this.crimeHour = crimeHour;
    }

    public String getUcrPart() {
        return ucrPart;
    }

    public void setUcrPart(String ucrPart) {
        this.ucrPart = ucrPart;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

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
