INSERT INTO YOUTUBERS (RANK, USERNAME, URL, NAME, CATEGORY, SUBSCRIBERS, AUDIENCE_COUNTRY, AVG_VIEWERS, AVG_LIKES, AVG_COMMENTS)
SELECT *
FROM CSVREAD('classpath:top_1000_youtubers.csv');