insert into product (name, unit_price, quantity) values ('Pork - Backs - Boneless', 23.24, 1);
insert into product (name, unit_price, quantity) values ('Cinnamon - Stick', 19.25, 56);
insert into product (name, unit_price, quantity) values ('Cookies - Englishbay Chochip', 47.8, 35);
insert into product (name, unit_price, quantity) values ('Paste - Black Olive', 49.94, 1);
insert into product (name, unit_price, quantity) values ('Soup - Tomato Mush. Florentine', 18.16, 50);
insert into product (name, unit_price, quantity) values ('Snapple Raspberry Tea', 25.9, 11);
insert into product (name, unit_price, quantity) values ('Wine - Beringer Founders Estate', 16.6, 97);
insert into product (name, unit_price, quantity) values ('Cheese - Camembert', 12.97, 84);
insert into product (name, unit_price, quantity) values ('Lid - 16 Oz And 32 Oz', 29.21, 73);
insert into product (name, unit_price, quantity) values ('Bar - Sweet And Salty Chocolate', 10.06, 96);
insert into product (name, unit_price, quantity) values ('Mushroom Morel Fresh', 24.25, 65);
insert into product (name, unit_price, quantity) values ('Seedlings - Clamshell', 33.02, 34);
insert into product (name, unit_price, quantity) values ('Lamb Rack Frenched Australian', 44.73, 32);
insert into product (name, unit_price, quantity) values ('Lemonade - Pineapple Passion', 46.57, 3);
insert into product (name, unit_price, quantity) values ('Squid - U - 10 Thailand', 36.19, 52);
insert into product (name, unit_price, quantity) values ('Guinea Fowl', 49.57, 22);
insert into product (name, unit_price, quantity) values ('V8 - Vegetable Cocktail', 2.05, 38);
insert into product (name, unit_price, quantity) values ('Ice Cream Bar - Rolo Cone', 12.77, 20);
insert into product (name, unit_price, quantity) values ('Chocolate Bar - Oh Henry', 3.82, 27);
insert into product (name, unit_price, quantity) values ('Beef - Prime Rib Aaa', 42.09, 61);

insert into warehouse (name, capacity) values ('warehouse_east', 100);
insert into warehouse (name, capacity) values ('warehouse_west', 150);

ALTER TABLE warehouse
ADD COLUMN product_id INT,
ADD COLUMN quantity INT;


UPDATE warehouse
SET product_id = 4, quantity = 50
WHERE id = 1;

UPDATE warehouse
SET product_id = 2, quantity = 75
WHERE id = 2;
