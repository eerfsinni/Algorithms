-- 코드를 입력하세요
SELECT COUNT(*) AS "USERS"
FROM USER_INFO
WHERE YEAR(JOINED) = '2021'
AND AGE >= 20
AND AGE <= 29;