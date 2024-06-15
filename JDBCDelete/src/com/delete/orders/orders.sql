USE mydatabase; 
CREATE TABLE orders ( 
order_id INT PRIMARY KEY, 
customer_id INT, 
order_date DATE, 
total_amount DOUBLE 
); 
INSERT INTO orders (order_id, customer_id, order_date, total_amount) 
VALUES 
(1, 101, '2023-06-01', 100.0), 
(2, 102, '2023-06-02', 150.0), 
(3, 103, '2023-06-03', 200.0);
