WITH recursive Factorial (n, fact) AS (
    SELECT 0, CAST(1 AS BIGINT)
    UNION ALL
    SELECT n + 1, (n + 1) * fact
    FROM Factorial WHERE n<16)
SELECT n, fact FROM Factorial

//isti djavo, mala je razlika u resenjima
--with recursive f(n, fact) as (
--  select 0, 1::bigint
--  union all
--  select n + 1, fact * (n + 1)
--  from f
--)
--select n, fact
--from f
--limit 17