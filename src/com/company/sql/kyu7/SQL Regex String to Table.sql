SELECT regexp_split_to_table(text, E'aeiou') AS results
FROM random_string