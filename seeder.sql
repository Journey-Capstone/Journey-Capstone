CREATE DATABASE IF NOT EXISTS journey_db;


CREATE USER journey_user@localhost IDENTIFIED BY 'journey1';
GRANT ALL ON journey_db.* TO journey_user@localhost;

USE journey_db;

INSERT INTO users (city, state, email, favorite_genre, first_name, is_subscribed, last_name, password, username)
VALUES ("San Antonio", "Texas", "testuser@email.com", "fantasy", "Test", TRUE, "User", "test", "testUser");

INSERT INTO books (description, google_url, image, isbn, language, page_count, published_date, title, book_id)
VALUES ("When Ashlar learns that another Taltos has been seen, he is suddenly propelled into the haunting world of the Mayfair family, the New Orleans dynasty of witches forever besieged by ghosts, spirits, and their own dizzying powers. For Ashlar knows this powerful clan is intimately linked to the heritage of the Taltos.","https://books.google.com/books?id=0YLSIgQsIUAC&dq=Lasher&source=gbs_similarbooks", "./content.png", 0307575926, 9780307575920, "English", 576, 2010, "Taltos");

