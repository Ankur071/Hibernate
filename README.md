# Hibernate Demo Project

A demonstration project showcasing Hibernate ORM implementation in Java.

## Overview

This project demonstrates the fundamental concepts of Hibernate ORM (Object-Relational Mapping) for managing database operations in Java applications.

## Technologies Used

- Java
- Hibernate ORM
- Maven
- MySQL/PostgreSQL (configure as needed)

## Project Structure

```
DemoHib/
├── src/
│   └── main/
│       └── java/
│           └── com/telusko/DemoHib/
│               └── Alien.java
├── pom.xml
└── README.md
```

## Entity Classes

- **Alien**: POJO/Bean class representing the entity with properties:
  - `aid` (int) - Alien ID
  - `aname` (String) - Alien Name
  - `color` (String) - Alien Color

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/Ankur071/Hibernate.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Hibernate
   ```

3. Configure database connection in `hibernate.cfg.xml`

4. Build the project:
   ```bash
   mvn clean install
   ```

5. Run the application:
   ```bash
   mvn exec:java
   ```

## Configuration

Ensure you have the following dependencies in your `pom.xml`:
- Hibernate Core
- Database Driver (MySQL/PostgreSQL)
- JPA API

## Author

[Ankur071](https://github.com/Ankur071)

## License

This project is open source and available for all.
```

