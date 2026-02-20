# 🚀 Spring Boot User CRUD API

A simple RESTful API built using **Spring Boot** that performs CRUD operations for user management.

## 📌 Features

* Create User
* Get All Users
* Get User By Name
* Update User
* Delete User
* Request Validation
* Global Exception Handling
* Clean Layered Architecture

## 🛠️ Tech Stack

* Java 17+
* Spring Boot
* Maven
* Jakarta Validation
* REST API
* Postman (Testing)

## 📂 Project Structure

```
controller → API endpoints
service → Business logic
model → Entity classes
dto → Request objects
exception → Custom exceptions
response → Standard API response
```

## ▶️ How to Run

1. Clone the repository

```
git clone https://github.com/Tarang-Thakur/springboot-user-crud-api.git
```

2. Open in IntelliJ

3. Run:

```
DemoApplication.java
```

Server will start at:

```
http://localhost:8080
```

## 📡 API Endpoints

### Create User

POST `/api/users`

```
{
  "name": "Tarang",
  "age": 21
}
```

### Get All Users

GET `/api/users`

### Get User By Name

GET `/api/users/{name}`

### Update User

PUT `/api/users/{name}`

### Delete User

DELETE `/api/users/{name}`

## ✅ Sample Response

```
{
  "success": true,
  "message": "User created successfully",
  "data": {
    "name": "Tarang",
    "age": 21
  }
}
```

## 👨‍💻 Author

Tarang Thakur
