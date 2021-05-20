SELECT products.*, companies.name as company_name
FROM products
INNER JOIN companies ON products.company_id=companies.id