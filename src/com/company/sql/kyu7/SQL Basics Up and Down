SELECT
  CASE WHEN SUM(number1)%2=1 THEN MIN(number1) ELSE MAX(number1) END AS number1,
  CASE WHEN SUM(number2)%2=1 THEN MIN(number2) ELSE MAX(number2) END AS number2
FROM numbers


SELECT
  CASE
    WHEN (SUM(numbers.number1))%2!=0
      THEN (SELECT MIN(number1)
            FROM numbers)
      ELSE (SELECT MAX(number1)
            FROM numbers)
  END AS number1 ,
  CASE
     WHEN (SUM(numbers.number2))%2!=0
       THEN (SELECT MIN(number2)
            FROM numbers)
      ELSE (SELECT MAX(number2)
            FROM numbers)
  END AS number2
FROM numbers
GROUP BY number1,number2
limit 1