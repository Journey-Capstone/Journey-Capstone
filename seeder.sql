DROP DATABASE journey_db;

CREATE DATABASE IF NOT EXISTS journey_db;


CREATE USER journey_user@localhost IDENTIFIED BY 'journey1';
GRANT ALL ON journey_db.* TO journey_user@localhost;

USE journey_db;

INSERT INTO users (city, state, email, favorite_genre, first_name, is_subscribed, last_name, password, username)
VALUES ('San Antonio', 'Texas', 'testuser@email.com', 'fantasy', 'Test', TRUE, 'User', 'test', 'testUser');


