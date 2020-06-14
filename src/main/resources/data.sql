-- inicjalizacja bazy danych: przykładowe dane

insert into user(username, email, password) values
('admin', 'admin@localhost', hash('SHA256', stringtoutf8('kaszanka'), 1)),
('student', 'student@wizut', hash('SHA256', stringtoutf8('pandatrzy'), 1)),
('user', 'user@localhost', hash('SHA256', stringtoutf8('user'), 1));

insert into item_manufacturer(id,name,origin) values (1,'Supreme','USA');
insert into item_manufacturer(id,name,origin) values (2,'Nike','USA');
insert into item_manufacturer(id,name,origin) values (3,'Adidas','Niemcy');
insert into item_manufacturer(id,name,origin) values (4,'Puma','Niemcy');
insert into item_manufacturer(id,name,origin) values (5,'Gucci','Włochy');
insert into item_manufacturer(id,name,origin) values (6,'Hilfiger','USA');
insert into item_manufacturer(id,name,origin) values (7,'Prosto','Polska');
insert into item_manufacturer(id,name,origin) values (8,'Timberland','USA');
insert into item_manufacturer(id,name,origin) values (9,'Ellesse','Włochy');

insert into sizing_type(id,size) values (1,'XS');
insert into sizing_type(id,size) values (2,'S');
insert into sizing_type(id,size) values (3,'M');
insert into sizing_type(id,size) values (4,'L');
insert into sizing_type(id,size) values (5,'XL');

insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (1,5,3,35,22.3,33,22);
insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (2,5.5,3.5,36,22.8,34,23);
insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (3,6,4,37,23.5,35,23.5);
insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (4,7,5,38,24.3,36,24);
insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (5,7.5,5.5,39,24.7,37,24.5);
insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (6,8.5,6.5,40,25.6,38,25.5);
insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (7,9.5,7.5,41,26.4,39,26.5);
insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (8,10,8,42,26.8,40,27);
insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (9,10,9,43,27.7,41,27.5);
insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (10,10.5,9.5,44,28.1,42,28);
insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (11,11.5,10.5,45,28.9,43,29);
insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (12,12.5,11.5,46,29.7,44,29.5);
insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (13,13.5,12.5,47,30.2,45,30);
insert into sizing_type_shoe(id,size_us,size_uk,size_eu,size_cm,size_br,size_jp) values (14,14,13,48,31,46,31);

insert into item_model(id,name,is_shoe) values (1, 'Kalosze', true);
insert into item_model(id,name,is_shoe) values (2, 'Kapcie', true);
insert into item_model(id,name,is_shoe) values (3, 'Mokasyny', true);
insert into item_model(id,name,is_shoe) values (4, 'Trampki/Tenisówki', true);
insert into item_model(id,name,is_shoe) values (5, 'Sportowe/Sneakersy', true);
insert into item_model(id,name,is_shoe) values (6, 'Baleriny', true);
insert into item_model(id,name,is_shoe) values (7, 'Oksfordki', true);
insert into item_model(id,name,is_shoe) values (8, 'Bielizna', false);
insert into item_model(id,name,is_shoe) values (9, 'Bluzki', false);
insert into item_model(id,name,is_shoe) values (10, 'Płaszcze', false);
insert into item_model(id,name,is_shoe) values (11, 'Kurtki', false);
insert into item_model(id,name,is_shoe) values (12, 'Spodnie', false);
insert into item_model(id,name,is_shoe) values (13, 'Swetry', false);
insert into item_model(id,name,is_shoe) values (14, 'Odzież kąpielowa', false);
insert into item_model(id,name,is_shoe) values (15, 'Koszule', false);
insert into item_model(id,name,is_shoe) values (16, 'Marynarki/Garnitury', false);
insert into item_model(id,name,is_shoe) values (17, 'Legginsy', false);
insert into item_model(id,name,is_shoe) values (18, 'Spódnice', false);
insert into item_model(id,name,is_shoe) values (19, 'Sukienki', false);
insert into item_model(id,name,is_shoe) values (20, 'Shorty', false);

insert into offer(id, title, date, year, condition, description, price, retail_price, colour, cut, gender, manufacturer_id, sizing_id, shoe_sizing_id, item_model_id, user_id) values (1, 'płaszcz na zimę damski', '2017-07-25', 2014, 'dobry', 'swietny plaszczyk na zime', 100, 100, 'zielony', 'slim', 'Damski' , 1, 1, 1, 1, 1)