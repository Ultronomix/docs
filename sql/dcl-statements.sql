-- creates a new user with the username 'wezley' and password 
-- 'revature'; this user can use the credentials to create a conection
-- to the database
CREATE USER wezley WITH PASSWORD 'revature';

-- use this command to drop (remove) a created user 
DROP USER wezley;

-- grants the specified user the ability to connect/access the
-- the specified schema as well as the ability to create objects
-- (tables, views, etc.) within that schema 
GRANT ALL PRIVILEGES
ON SCHEMA taskmaster
TO wezley;

-- more granular grant statement
GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA taskmaster 
TO wezley;

-- grant privileges  can be revoked as well 
REVOKE DELETE 
ON ALL TABLES IN SCHEMA taskmaster 
FROM wezley;




