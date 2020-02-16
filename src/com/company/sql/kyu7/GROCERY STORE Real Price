SELECT name, weight, price, CAST(ROUND(CAST((price*1000 / weight) AS numeric),2) AS double precision) AS price_per_kg
FROM products
ORDER BY price_per_kg ASC, name ASC