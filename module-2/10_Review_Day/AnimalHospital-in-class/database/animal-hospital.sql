drop  table if  exists  invoice_pet;
drop  table if  exists invoice;
drop  table if  exists customer_pet;
drop  table if  exists pet;
drop  table if  exists customer;

CREATE TABLE invoice
(
	invoice_id serial,
	invoice_date timestamp not null,
	customer_id int,

	primary key (invoice_id)
);

CREATE TABLE invoice_pet
(
	invoice_id int,
	pet_id int,
	pet_procedure varchar(200) not null,
	amount money not null,

	primary key (invoice_id, pet_id)
);

CREATE TABLE pet
(
	pet_id serial,
	pet_name varchar(200) not null,

	primary key (pet_id)
);

CREATE TABLE customer
(
	customer_id serial,
	customer_name varchar(200) not null,
	customer_street varchar(200) not null,
	customer_city varchar(200) not null,
	customer_postalcode char(10) not null,
	email varchar(200) NOT NULL,
	primary key (customer_id)
);


CREATE TABLE customer_pet
(  customer_id int,
	pet_id int,

	primary key( customer_id, pet_id)
);


ALTER TABLE invoice
ADD FOREIGN KEY (customer_id) REFERENCES customer (customer_id);

ALTER TABLE invoice_pet
ADD FOREIGN KEY (invoice_id) REFERENCES invoice(invoice_id);

ALTER TABLE invoice_pet
ADD FOREIGN KEY (pet_id) REFERENCES pet(pet_id);

ALTER TABLE customer_pet
Add FOREIGN KEY (customer_id) REFERENCES Customer(customer_id);

ALTER TABLE customer_pet
Add FOREIGN KEY (pet_id) REFERENCES Pet(pet_id);

CREATE UNIQUE INDEX customer_email_idx ON customer(email);

INSERT INTO customer( customer_name, customer_street, customer_city, customer_postalcode, email)
VALUES ('Billy Bob', '1 Main street', 'AnyTown', '11111', 'billybob@test.com'),
('Billy Joe', '2 Main street', 'AnyTown', '11111', 'billyjoe@test.com'),
('Billy Ray', '3 Main street', 'AnyTown', '11111', 'billyray@test.com'),
('Billy Joe Ray', '4 Main street', 'AnyTown', '11111', 'billyjoeray@test.com'),
('Billy Bob Joe Ray', '5 Main street', 'AnyTown', '11111', 'billybobjoeray@test.com')
