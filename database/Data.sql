USE coder_sale_final;

INSERT INTO persons
(	name,
	surname,
	indentity_document,
	adress,
	date_birth,
	state) values
(	'Björn',
	'Ragnarsson',
    '123456',
    'Norway',
    '1993-10-29',
    'VALIDATED');

INSERT INTO persons
(	name,
	surname,
	indentity_document,
	adress,
	date_birth,
	state) values
(	'Thomas',
	'Shelby',
    '1234567',
    'Birmingham',
    '1993-10-29',
    'VALIDATED');

INSERT INTO persons
(	name,
	surname,
	indentity_document,
	adress,
	date_birth,
	state) values
(	'Walter',
	'White',
    '12345678',
    'Albuquerque',
    '1993-10-29',
    'VALIDATED');

INSERT INTO persons
(	name,
	surname,
	indentity_document,
	adress,
	date_birth,
	state) values
(	'Rhaenyra',
	'Targaryen',
    '12345689',
    'Dragonstone',
    '1993-10-29',
    'VALIDATED');

    INSERT INTO persons
(	name,
	surname,
	indentity_document,
	adress,
	date_birth,
	state) values
(	'Galadriel ',
	'Artanis',
    '123456890',
    'Tirion',
    '1993-10-29',
    'VALIDATED');


INSERT INTO item
(description) VALUES ('Jewelry');

INSERT INTO item
(description) VALUES ('Pharmacy');

INSERT INTO item
(description) VALUES ('Armory');

INSERT INTO item
(description) VALUES ('Foods');

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Meat',
     '1 kilo of animal meat',
     912365489,
     100,
     50.5,
     4
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Poultry',
     '1 kilo of chicken',
     98958444,
     100,
     25.5,
     4
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Fish',
     '1 kilo of fish',
     98154654,
     100,
     60.5,
     4
    );
INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Cheese',
     '1 kilo of cheese',
     98563247,
     100,
     25,
     4
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Bread',
     '1 kilo of bread',
     94498458,
     100,
     10,
     4
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Sword',
     'Weapon of war',
     98365789,
     100,
     10000,
     3
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Bow',
     'Hunting or war weapon',
     98765555,
     5000,
     5000,
     3
    );

    INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Arrow',
     'Ammunition',
     987365444,
     100000,
     10,
     3
    );

    INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Bullets',
     'Ammunition',
     9854123,
     1000000,
     1,
     3
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Glock 40',
     'Firearm',
     9875333,
     500,
     40000,
     3
    );
INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('M60 machine gun',
     'Firearm',
     987565222,
     10,
     100000,
     3
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Axe',
     'Weapon of war',
     9875111,
     2000,
     4000,
     3
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Leche de amapola',
     'Medicament',
     987375479,
     100,
     100,
     2
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Semilla del ermitaño',
     'Medicament',
     9874545,
     10,
     1000,
     2
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Ricina',
     'Poison',
     9853512,
     15,
     10,
     2
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Tobacco',
     'Vice',
     9811231,
     1500,
     20,
     2
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Whiskey',
     'Vice',
     987551231,
     1000,
     1500,
     2
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Iron Throne',
     'Throne of the seven kingdoms',
     999999999,
     1,
     99999999,
     1
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Gold necklace',
     'Jewelry',
     987556,
     15,
     10000,
     1
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Damn Ruby',
     'Jewelry',
     987556454,
     0,
     100000,
     1
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Crown',
     'Kings crown',
	 9899956,
     7,
     100000,
     1
    );

INSERT INTO products
(	name,
	description,
    sku,
    stock,
    price,
    id_item) VALUES
    ('Rings of Power',
     'Rings of Power',
     98755645,
     20,
     99990,
     1
    );


INSERT INTO sales(
    date,
    price,
    state
	)VALUES
(	'1011-10-10',
	114121,
    'VALIDATED'
);

INSERT INTO sales(
    date,
    price,
    state
	)VALUES
(	'1960-10-10',
	43170.5,
    'VALIDATED'
);

INSERT INTO sales(
    date,
    price,
    state
	)VALUES
(	'2020-10-10',
	102700,
    'VALIDATED'
);

INSERT INTO sales(
    date,
    price,
    state
	)VALUES
(	'150-10-10',
	130100,
    'VALIDATED'
);

INSERT INTO sales(
    date,
    price,
    state
	)VALUES
(	'150-10-10',
	99999999,
    'CANCELLED'
);

INSERT INTO sales(
    date,
    price,
    state
	)VALUES
(	'100-10-10',
	315490,
    'VALIDATED'
);
INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    10000,
    20,
    1,
    1
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    50.5,
    1,
    2,
    2
    );
INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    40000,
    10,
    2,
    2
    );
INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    100,
    1,
    9,
    2,
    2
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    20,
    16,
    2,
    2
    );
INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    2,
    1500,
    17,
    2,
    2
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    2,
    60.5,
    3,
    1,
    1
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    4000,
    12,
    1,
    1
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    100000,
    21,
    1,
    1
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    10000,
    6,
    1,
    1
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    100000,
    11,
    3,
    3
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    1000,
    15,
    3,
    3
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    200,
    200,
    9,
    3,
    3
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    1500,
    17,
    3,
    3
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    100,
    13,
    4,
    4
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    2,
    10000,
    19,
    4,
    4
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    10000,
    6,
    4,
    4
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    100000,
    21,
    4,
    4
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    99999999,
    18,
    5,
    4
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    2,
    10,
    5,
    6,
    5
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    10000,
    6,
    6,
    5
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    3,
    99990,
    22,
    6,
    5
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    50,
    10,
    8,
    6,
    5
    );

INSERT INTO detail_sale(
    quantity,
    price,
    id_product,
    id_sale,
    id_person ) VALUES
    (
    1,
    5000,
    7,
    6,
    5
    );

