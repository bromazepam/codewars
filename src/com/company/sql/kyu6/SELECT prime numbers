SELECT regexp_split_to_table('2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97',E',')::int AS prime
ORDER BY prime ASC

-- SELECT t1.a AS prime
-- FROM generate_series(2, 100) AS t1(a)
-- WHERE NOT EXISTS (
--   SELECT t2.a
--   FROM generate_series(2, t1.a-1) AS t2(a)
--   WHERE t1.a % t2.a = 0
--   );
-- better solution