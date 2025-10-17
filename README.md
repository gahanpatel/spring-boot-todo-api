Spring Boot To-Do List REST API

A production-ready REST API for managing tasks with complete CRUD operations, error handling, and cloud deployment.

🛠️ Tech Stack
Java 17 • Spring Boot 3.5.3 • JPA/Hibernate • H2 Database • Maven • Docker • Render
✨ Features
Complete CRUD operations (Create, Read, Update, Delete)
Task completion workflow via dedicated PATCH endpoint
Individual task retrieval by ID
Input validation using Bean Validation
Custom exception handling with proper HTTP status codes (400, 404, 500)
Layered architecture (Controller → Service → Repository → Entity)
Database persistence with JPA/Hibernate
RESTful API design following best practices
Docker containerization
Deployed on Render with automated GitHub integration

📊 API Endpoints
Method	Endpoint	Description
GET	/api/tasks	Get all tasks
GET	/api/tasks/{id}	Get task by ID
POST	/api/tasks	Create new task
PUT	/api/tasks/{id}	Update existing task
DELETE	/api/tasks/{id}	Delete task
PATCH	/api/tasks/{id}/complete	Mark task as complete
GET	/actuator/health	Health check endpoint

🏗️ Architecture
Layered Architecture Pattern:
Controller Layer - Handles HTTP requests and responses
Service Layer - Business logic and validation
Repository Layer - Database operations
Entity Layer - Data model
Key Design Patterns:
Dependency Injection
Repository Pattern
DTO Pattern for request/response objects
Centralized Exception Handling with @ControllerAdvice

🔍 Validation & Error Handling
Input Validation:
Title: Required, cannot be blank
Description: Optional, max 1000 characters
HTTP Status Codes:
200 OK - Successful operation
400 Bad Request - Invalid input
404 Not Found - Resource not found
500 Internal Server Error - Server error

📚 Learning Outcomes
Spring Boot framework and auto-configuration
RESTful API design principles
JPA/Hibernate ORM and database integration
Layered architecture and separation of concerns
Professional error handling and validation
Docker containerization
Cloud deployment with automated CI/CD
Developer: Gahan Patel
Repository: https://github.com/gahanpatel/spring-boot-todo-api
Live API: https://spring-boot-todo-api-blq6.onrender.com
