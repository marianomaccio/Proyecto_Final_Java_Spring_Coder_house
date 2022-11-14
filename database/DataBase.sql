CREATE DATABASE coder_sale_final;

USE coder_sale_final;

CREATE TABLE persons(
	id_person 			INT PRIMARY KEY AUTO_INCREMENT,
	name 				VARCHAR(32) NOT NULL,
	surname 			VARCHAR(32) NOT NULL,
	identity_document 	VARCHAR(30) NOT NULL UNIQUE,
	adress 				VARCHAR(64),
	date_birth 			DATE,
	state 				ENUM ('VALIDATED','NOT VALIDATED') DEFAULT 'NOT VALIDATED'
);

CREATE TABLE item(
	id_item 	INT PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(32)
);

CREATE TABLE products(
	id_product  INT PRIMARY KEY AUTO_INCREMENT,
	name        VARCHAR(32) NOT NULL UNIQUE,
	description VARCHAR(32) NOT NULL,
    sku         INT NOT NULL UNIQUE,
    stock       INT NOT NULL,
    price       double NOT NULL,
    id_item     INT NOT NULL,

    CONSTRAINT fk_item FOREIGN KEY (id_item) REFERENCES item(id_item)
);

CREATE TABLE sales(
	id_sale INT PRIMARY KEY AUTO_INCREMENT,
    date 	DATE,
    price   DOUBLE DEFAULT 0,
    state 	ENUM ('VALIDATED','NOT VALIDATED', 'CANCELLED') DEFAULT 'NOT VALIDATED'
);

CREATE TABLE detail_sale(
	id_detail_sale INT PRIMARY KEY AUTO_INCREMENT,
    quantity       INT NOT NULL,
    price 		   DOUBLE NOT NULL,
    id_product 	   INT NOT NULL,
    id_sale 	   INT NOT NULL,
    id_person 	   INT NOT NULL,

    CONSTRAINT fk_product FOREIGN KEY (id_product) REFERENCES products(id_product),
    CONSTRAINT fk_sale FOREIGN KEY (id_sale) REFERENCES sales(id_sale),
    CONSTRAINT fk_person FOREIGN KEY (id_person) REFERENCES persons(id_person)
);
