SELECT 
  p.id,
  p.name,
  au.email AS owner_email
FROM projects p
JOIN app_users au
ON p.owner_id = au.id;

SELECT 
  p.name AS project_name,
  s.id AS sprint_id,
  s.name AS sprint_name,
  s.start_date,
  s.end_date,
  au.email AS project_owner_email
FROM sprints s
JOIN projects p 
ON s.project_id = p.id 
JOIN app_users au 
ON p.owner_id = au.id;

SELECT
  p.name AS project_name,
  au.given_name || ' ' || au.surname AS member_name,
  au.email AS member_email
FROM project_members pm 
JOIN projects p 
ON pm.project_id = p.id 
JOIN app_users au 
ON pm.user_id = au.id;

SELECT 
  t.id AS task_id,
  t.title AS task_title,
  t.due_date AS task_due_date,
  t.point_value AS task_point_value,
  t.priority AS task_priority,
  au.given_name || ' ' || au.surname AS member_name,
  au.email AS member_email
FROM task_assignees ta
JOIN tasks t
ON ta.task_id = t.id 
JOIN app_users au 
ON ta.user_id = au.id;

SELECT state, COUNT(*) AS count
FROM tasks
GROUP BY state
ORDER BY count;

SELECT state, priority, COUNT(*)
FROM tasks
GROUP BY state, priority
HAVING priority = 'P1';

