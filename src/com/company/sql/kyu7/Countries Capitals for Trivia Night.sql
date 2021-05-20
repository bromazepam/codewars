SELECT capital
FROM countries
WHERE country LIKE 'E%' AND continent IN ('Africa', 'Afrika') AND capital NOT LIKE 'Lobamba'
ORDER BY capital ASC
LIMIT 3

--sh*tty kata
--in table 'countries' lobamba is actually a capital of one of the african countries