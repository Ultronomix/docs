CREATE TABLE user_roles (
  id uuid DEFAULT gen_random_uuid(),
  name varchar UNIQUE NOT NULL,
  
  CONSTRAINT user_roles_pk
  PRIMARY KEY (id)
);

CREATE TABLE app_users (
  id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
  given_name varchar NOT NULL,
  surname varchar NOT NULL,
  email varchar(255) NOT NULL UNIQUE,
  username varchar(25) NOT NULL UNIQUE CHECK (length(username) >= 4),
  password varchar NOT NULL CHECK (length(password) >= 8)
);

-- Drops the table and all of its data (DDL)
-- DROP TABLE app_users;

ALTER TABLE app_users 
ADD COLUMN role_id uuid;

ALTER TABLE app_users
ADD FOREIGN KEY (role_id) REFERENCES user_roles (id);

ALTER TABLE app_users
ALTER COLUMN role_id SET NOT NULL;

INSERT INTO app_users (given_name, surname, email, username, "password", role_id)
VALUES ('Bob', 'Bailey', 'bob456@revature.com', 'bbailey', 'p4$$W0RD', '285659fd-f6a7-48b4-863a-6b6831dab995');

INSERT INTO user_roles ("name")
VALUES ('MANAGER'), ('LEAD'), ('SENIOR'), ('JUNIOR'), ('TESTER');

SELECT * 
FROM user_roles;

SELECT * 
FROM app_users;

UPDATE app_users 
SET role_id = '8d58f3ce-fb9c-4acd-a18c-9efc952007d7'
WHERE id = '4435f215-d753-4336-a0e5-d020bd3d1df9';

UPDATE app_users 
SET role_id = '1410b9ab-6128-4ffc-a94f-f780747d2ec8'
WHERE username = 'aanderson';

DELETE FROM app_users 
WHERE username = 'bbailey';


