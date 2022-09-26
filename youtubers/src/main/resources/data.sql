INSERT INTO CRIMES
(id,incident_number,offense_code,offense_code_group,offense_description,
 district,reporting_area,occurred_on_date,crime_year,crime_month,
 crime_day_of_week,crime_hour,ucr_part,street,location)
SELECT id,incident_number,offense_code,offense_code_group,offense_description,
       district,reporting_area,occurred_on_date,crime_year,crime_month,
       crime_day_of_week,crime_hour,ucr_part,street,location
FROM CSVREAD('classpath:crime.csv', null, 'fieldSeparator=;');

