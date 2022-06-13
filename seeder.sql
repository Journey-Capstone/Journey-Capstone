DROP DATABASE journey_db;

CREATE DATABASE IF NOT EXISTS journey_db;


CREATE USER journey_user@localhost IDENTIFIED BY 'journey1';
GRANT ALL ON journey_db.* TO journey_user@localhost;

USE journey_db;

# INSERT INTO users (city, state, email, favorite_genre, first_name, is_subscribed, last_name, password, username)
# VALUES ('San Antonio', 'TX', 'testuser@email.com', 'fantasy', 'Test', TRUE, 'User', 'test', 'testUser');            ('Phoenix', 'AZ', 'Mark@email.com', 'humor', 'Mark', FALSE, 'Hauser', 'Password1', 'Marky Mark'),
#        ('Tulsa', 'OK', 'diane@email.com', 'Science Fiction', 'Diane', TRUE, 'Crowell', 'Password1', 'DeeDee'),
#        ('Austin', 'TX', 'misty@email.com', 'Romance', 'Misty', TRUE, 'Winkler', 'Password1', 'Misty'),
#        ('Destin', 'FL', 'jamol@email.com', 'Humor', 'Jamol', FALSE, 'Edwards', 'Password1', 'Jamol'),
#        ('Baltimore', 'MD', 'prince@email.com' 'History', 'Percy', TRUE, 'Prince', 'Password1', 'Prince'),
#        ('New York City', 'NY', 'susan@email.com', 'Fantasy', 'Susan', TRUE, 'Normand', 'Password1', 'Suzy'),
#        ('Houston', 'TX', 'brian@email.com', 'Fantasy', 'Brian', TRUE, 'Constantine', 'Password1', 'Constantine'),
#        ('Mesa', 'AZ', 'lillian@email.com', 'Arts & Photography', 'Lillian', TRUE, 'Brown', 'Password1', 'Lilly'),
#        ('Eureka', 'CA', 'monty@email.com', 'Young Adult', 'Monty', FALSE, 'Pellington', 'Password1', 'Monty'),
#        ('Paris', 'TX', 'chris@email.com', 'Self Help', 'Christopher', TRUE, 'Gutierrez', 'Password1', 'Chris'),
#        ('Las Vegas', 'NV', 'mary@email.com', 'Thriller', 'Mary', TRUE, 'Harper', 'Password1', 'Mary'),
#        ('Salt Lake City', 'UT', 'jason@email.com', 'Thriller', 'Jason', TRUE, 'Thompson', 'Password1', 'Jason'),
#        ('Salem', 'OR', 'diddy@email.com', 'Thriller', 'Sean', TRUE, 'Combs', 'Password1', 'Diddy'),
#        ('Los Angeles', 'CA', 'john@email.com', 'Fantasy', 'John', TRUE, 'Voight', 'Password1', 'Johnny'),
#        ('Abilene', 'TX', 'mathew@email.com', 'Science Fiction', 'Mathew', TRUE, 'Martingale', 'Password1', 'Matt'),
#        ('Indianapolis', 'IN', 'justin@email.com', 'Young Adult', 'Justin', TRUE, 'Arriaga', 'Password1', 'Justin'),
#        ('Daton', 'OH', 'miller@email.com', 'Self Help', 'Christopher', TRUE, 'Miller', 'Password1', 'Mr. Miller'),
#        ('Columbus', 'OH', 'mallory@email.com', 'Humor', 'Mallory', TRUE, 'London', 'Password1', 'Mallory Madness'),
#        ('Carlsbad', 'NM', 'momma@email.com', 'Romance', 'Gertrude', TRUE, 'Williamson', 'Password1', 'Momma G'),
#        ('Laredo', 'TX', 'jorge@email.com', 'Thriller', 'Jorge', FALSE, 'Martinez', 'Password1', 'Georgie'),
#        ('Baton Rouge', 'LA', 'gunther@email.com', 'Fantasy', 'Gunther', TRUE, 'Adelstein', 'Password1', 'Gunther'),
#        ('Spokane', 'WA', 'jaquelyn@email.com', 'Romance', 'Jaquelyn', TRUE, 'Jones', 'Password1', 'J-Quelyn'),
#        ('New Orleans', 'LA', 'victor@email.com', 'Thriller', 'Victor', TRUE, 'Gonzalez', 'Password1', 'Vic'),
#        ('San Antonio', 'TX', 'bobby@email.com', 'History', 'Bobby', TRUE, 'Lee', 'Password1', 'BobbyLee');


