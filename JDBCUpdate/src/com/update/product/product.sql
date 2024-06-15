CREATE TABLE products ( 
product_id NUMBER PRIMARY KEY, 
product_name VARCHAR2(100) NOT NULL, 
price NUMBER(10, 2) NOT NULL 
); 

INSERT INTO products (product_id, product_name, price) VALUES (101, 
'Laptop', 800.00); 
INSERT INTO products (product_id, product_name, price) VALUES (102, 
'Smartphone', 500.00); 
INSERT INTO products (product_id, product_name, price) VALUES (103, 
'Tablet', 300.00); 
