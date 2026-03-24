# 🚀 Spring Boot User Management API

A fully functional **RESTful API** built using **Spring Boot** that performs CRUD operations for user management with validation, global exception handling, and database integration.

---

## 📌 Features

* ✅ Create, Read, Update, Delete Users (CRUD)
* ✅ Input Validation using Hibernate Validator
* ✅ Global Exception Handling
* ✅ Standard API Response Structure
* ✅ Layered Architecture (Controller → Service → Repository)
* ✅ H2 In-Memory Database Integration
* ✅ RESTful API Design
* ✅ GitHub Version Control

---

## 🛠️ Tech Stack

* **Java 17**
* **Spring Boot**
* **Spring Data JPA**
* **Hibernate Validator**
* **H2 Database**
* **Maven**
* **Postman (API Testing)**

---

## 📂 Project Structure

```
com.example.demo
│
├── controller     → Handles API requests
├── service        → Business logic layer
├── repository     → Database interaction (JPA)
├── model          → Entity classes
├── dto            → Request/Response objects
├── exception      → Global exception handling
├── response       → Standard API response format
└── config         → Security configuration
```

---

## 📡 API Endpoints

| Method | Endpoint            | Description       |
| ------ | ------------------- | ----------------- |
| POST   | `/api/users`        | Create a new user |
| GET    | `/api/users`        | Get all users     |
| GET    | `/api/users/{name}` | Get user by name  |
| PUT    | `/api/users/{name}` | Update user       |
| DELETE | `/api/users/{name}` | Delete user       |

---

## 🧪 Sample Request

### Create User

```json
{
  "name": "Tarang",
  "age": 21
}
```

---

## ✅ Sample Success Response

```json
{
  "success": true,
  "message": "User created successfully",
  "data": {
    "id": 1,
    "name": "Tarang",
    "age": 21
  }
}
```

---

## ❌ Sample Validation Error

```json
{
  "success": false,
  "message": "Validation failed",
  "data": {
    "name": "Name cannot be empty",
    "age": "Age must be greater than 0"
  }
}
```

---

## 🗄️ Database (H2)

* In-memory database used for development
* Automatically creates tables using JPA

### Access H2 Console:

```
http://localhost:8080/h2-console
```

**JDBC URL:**

```
jdbc:h2:mem:testdb
```

**Username:** `sa`
**Password:** *(leave empty)*

---

## ▶️ How to Run Locally

1. Clone the repository:

```
git clone https://github.com/Tarang-Thakur/springboot-user-crud-api.git
```

2. Open project in **IntelliJ IDEA**

3. Run:

```
DemoApplication.java
```

4. Server starts at:

```
http://localhost:8080
```

---

## 🧠 Key Concepts Learned

* REST API Development
* Layered Architecture
* Dependency Injection
* DTO Pattern
* Exception Handling
* Validation
* JPA & Database Integration
* API Testing with Postman

---

## 📈 Future Improvements

* 🔹 Add MySQL / PostgreSQL database
* 🔹 Implement JWT Authentication
* 🔹 Add Swagger API Documentation
* 🔹 Add Logging (SLF4J)
* 🔹 Pagination & Sorting

---

## 👨‍💻 Author

**Tarang Thakur**

---

⭐ If you found this project helpful, consider giving it a star!
