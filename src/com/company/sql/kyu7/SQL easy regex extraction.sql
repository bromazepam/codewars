SELECT name, greeting, SUBSTRING(greeting, '#([0-9]+)') AS user_id
FROM greetings