SELECT RANK() OVER (ORDER BY SUM(points) DESC), clan,SUM(points) AS total_points, COUNT(name) AS total_people,
CASE
  WHEN clan = '' THEN '[no clan specified]'
END AS clan
FROM people
GROUP BY clan

--rank() - function to assign a rank for every row of a result set.