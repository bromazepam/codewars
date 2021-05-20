SELECT p.id,p.name, COUNT(t.people_id) AS toy_count
FROM people p, toys t
WHERE p.id=t.people_id
GROUP BY p.id