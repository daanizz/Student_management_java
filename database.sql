CREATE DATABASE student_db;

USE student_db;

CREATE TABLE Students(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20),
    age INT,
    course VARCHAR(20)
)