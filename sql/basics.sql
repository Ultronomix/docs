CREATE TABLE app_users (
  id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
  given_name varchar NOT NULL,
  surname varchar NOT NULL,
  email varchar(255) NOT NULL UNIQUE,
  username varchar(25) NOT NULL UNIQUE CHECK (length(username) >= 4),
  password varchar NOT NULL CHECK (length(password) >= 8)
);

INSERT INTO app_users (given_name, surname, email, username, password)
VALUES ('Tester', 'McTesterson', 'tester@revature.com', 'tester', 'p4$$W0RD');


SELECT * 
FROM app_users;


