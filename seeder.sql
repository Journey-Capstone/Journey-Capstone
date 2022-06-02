CREATE DATABASE IF NOT EXISTS journey_db;

CREATE USER journey_user@localhost IDENTIFIED BY 'journey1';
GRANT ALL ON journey_db.* TO journey_user@localhost;