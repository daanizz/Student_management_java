# Student Management System

A simple Java console-based Student Management System built using:

- Java
- JDBC
- MySQL
- DAO Pattern
- Layered Architecture

This project is designed for beginners who want to understand how backend systems communicate with databases without using frameworks like Spring Boot.

---

## Features

- Add Student
- View Students
- Update Student Course
- Delete Student
- MySQL Database Integration
- External Configuration using `.properties`

---

## Technologies Used

| Technology | Purpose |
|---|---|
| Java | Core Programming |
| JDBC | Database Connectivity |
| MySQL | Database |
| MySQL Connector/J | JDBC Driver |

---

## Project Structure

```text
StudentManagementSystem/
│
├── config/
│     db.properties
│
├── lib/
│     mysql-connector-j-9.7.0.jar
│
├── src/
│
│   ├── db/
│   │     DBConnection.java
│   │
│   ├── model/
│   │     Student.java
│   │
│   ├── dao/
│   │     StudentDAO.java
│   │
│   ├── service/
│   │     StudentService.java
│   │
│   ├── util/
│   │     MenuUtil.java
│   │
│   └── Main.java
│
└── README.md
```

---

## Database Setup

### Create Database

```sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    course VARCHAR(100)
);
```

---

## Configuration Setup

Create:

```text
config/db.properties
```

Add:

```properties
url=jdbc:mysql://localhost:3306/student_db
user=root
password=YOUR_PASSWORD
```

---

## JDBC Driver Setup

Place the MySQL JDBC Driver inside:

```text
lib/
```

Example:

```text
lib/mysql-connector-j-9.7.0.jar
```

---

## Compile Project

Run from the project root directory:

```bash
javac -cp ".:lib/mysql-connector-j-9.7.0.jar" -d out $(find src -name "*.java")
```

---

## Run Project

```bash
java -cp ".:out:lib/mysql-connector-j-9.7.0.jar" Main
```

---

## Concepts Learned

This project demonstrates:

- JDBC Connection Handling
- DAO Pattern
- PreparedStatement
- CRUD Operations
- External Configuration
- Service Layer
- Model Classes
- Layered Architecture
- MySQL Integration

---

## Important Notes

- Do not hardcode database passwords in source code.
- Add `config/db.properties` to `.gitignore`.
- Always use `PreparedStatement` instead of `Statement`.

---

## Future Improvements

- Authentication System
- Search Feature
- Validation
- Attendance Management
- Role-Based Access
- GUI Integration
- REST API Integration

---

## Learning Goal

This project focuses on understanding backend fundamentals before moving to frameworks like Spring Boot or Hibernate.

---

## Author

Danish Zakariya