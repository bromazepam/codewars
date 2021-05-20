SELECT f.name AS name,SUM(f.won) AS won,SUM(f.lost) AS lost
FROM fighters f, winning_moves wm
WHERE f.move_id=wm.id AND wm.move NOT IN('Hadoken', 'Shouoken','Kikoken')
GROUP BY f.name
ORDER BY won DESC
LIMIT 6;