SELECT sa.senshi_name AS sailor_senshi, sa.real_name_jpn AS real_name, c.name AS cat, s.school AS school
FROM sailorsenshi sa
LEFT JOIN cats c
ON sa.cat_id = c.id
LEFT JOIN schools s
ON sa.school_id = s.id