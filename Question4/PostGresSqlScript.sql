create table Address (
		addressId SERIAL PRIMARY KEY,
		zip  VARCHAR(50) NOT NULL,
		street VARCHAR(50) NOT NULL,
		complement VARCHAR(100),
		neighborhood VARCHAR(50) NOT NULL,
		city VARCHAR(50) NOT NULL,
		state VARCHAR(50) NOT NULL,
		country VARCHAR(50) NOT NULL
);

create table Person (
	person_id  SERIAL PRIMARY KEY,
	name VARCHAR(200) NOT NULL ,
	age INT NOT NULL,
	phone VARCHAR(20) NOT NULL,
	height FLOAT NOT NULL,
	email VARCHAR(200) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	birthday DATE NOT NULL,	
	address_id SERIAL,
	FOREIGN KEY (address_id) REFERENCES Address (addressId)
); 

INSERT INTO Address (zip, street, complement, neighborhood, city, state, country)
VALUES
    ('12345-678', 'Rua Principal', 'Apt 101', 'Centro', 'Cidade A', 'Estado A', 'País A'),
    ('54321-876', 'Avenida Secundária', 'Casa 42', 'Bairro B', 'Cidade B', 'Estado B', 'País B'),
    ('98765-432', 'Rua dos Fundos', NULL, 'Subúrbio', 'Cidade C', 'Estado C', 'País C');


INSERT INTO Person (name, age, phone, height, email, cpf, birthday, address_id)
VALUES
    ('João', 30, '(11) 1234-5678', 1.75, 'joao@example.com', '12345678901', '1992-05-15', 1),
    ('Maria', 25, '(22) 9876-5432', 1.60, 'maria@example.com', '98765432109', '1997-03-20', 2),
    ('Carlos', 35, '(33) 4444-3333', 1.80, 'carlos@example.com', '55555555505', '1987-11-10', 3);


SELECT p.person_id, p.name, p.email, p.cpf, p.birthday, a.city, a.state, a.country
FROM
    Person p
INNER JOIN
    Address a ON p.address_id = a.addressId;
