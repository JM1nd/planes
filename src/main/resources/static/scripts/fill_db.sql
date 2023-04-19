INSERT INTO city (display_name) VALUES('Berlin');
INSERT INTO city (display_name) VALUES('Tokio');
INSERT INTO city (display_name) VALUES('Denver');
INSERT INTO city (display_name) VALUES('Moscow');
INSERT INTO city (display_name) VALUES('Rio');
INSERT INTO city (display_name) VALUES('Oslo');
INSERT INTO city (display_name) VALUES('Helsinki');
INSERT INTO city (display_name) VALUES('Nairobi');

INSERT INTO user_profile (first_name, last_name, username, password, created_at)
VALUES('Andrii','Kasaiani','Mind','nono','2023-04-16 10:00:13+02');
INSERT INTO user_profile (first_name, last_name, username, password, created_at)
VALUES('Artem','Ponomarenko','Giik','yeye','2023-04-16 10:00:13+02');

INSERT INTO flight (departure_city_id, arrival_city_id, departure_time, arrival_time, flight_number, price, created_at)
VALUES(1,2,'2023-06-13 20:00:00+02','2023-06-14 10:00:00+02',1235,55.23,'2023-04-22 12:22:31+02');
INSERT INTO flight (departure_city_id, arrival_city_id, departure_time, arrival_time, flight_number, price, created_at)
VALUES(2,5,'2023-06-13 13:30:00+02','22023-06-14 03:30:00+02',1337,250.53,'2023-04-16 10:00:13+02');

INSERT INTO ticket (flight_id, user_profile_id, pnr, created_at)
VALUES(1,2,'ССB12','2023-04-22 12:22:31+02');
INSERT INTO ticket (flight_id, user_profile_id, pnr, created_at)
VALUES(2,1,'AA312','2023-04-16 10:00:13+02');