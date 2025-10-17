Spring Boot To-Do List REST API

A production-ready REST API for managing tasks with complete CRUD operations, error handling, and cloud deployment.
🚀 Live Demo
API: https://spring-boot-todo-api-blq6.onrender.com/api/tasks
bash
# Try it out
curl https://spring-boot-todo-api-blq6.onrender.com/api/tasks
🛠️ Tech Stack
Java 17 • Spring Boot 3.5.3 • JPA/Hibernate • H2 Database • Maven • Docker • Render
📊 API Endpoints
Method	Endpoint	Description
GET	/api/tasks	Get all tasks
GET	/api/tasks/{id}	Get task by ID
POST	/api/tasks	Create task
PUT	/api/tasks/{id}	Update task
DELETE	/api/tasks/{id}	Delete task
PATCH	/api/tasks/{id}/complete	Mark complete
📝 Usage Example
bash
# Create task
curl -X POST https://spring-boot-todo-api-blq6.onrender.com/api/tasks \
  -H "Content-Type: application/json" \
  -d '{"title":"Buy groceries","description":"Get milk and bread"}'

# Get all tasks
curl https://spring-boot-todo-api-blq6.onrender.com/api/tasks

# Mark complete
curl -X PATCH https://spring-boot-todo-api-blq6.onrender.com/api/tasks/1/complete
✨ Features
Complete CRUD operations
Task completion workflow
Input validation with Bean Validation
Custom error handling with proper HTTP status codes
Layered architecture (Controller → Service → Repository)
Docker containerization
Cloud deployment on Render
🏗️ Architecture
Controller Layer  →  Handles HTTP requests
Service Layer     →  Business logic
Repository Layer  →  Database operations
Entity Layer      →  Data model
🏃‍♂️ Run Locally
bash
git clone https://github.com/gahanpatel/spring-boot-todo-api.git
cd spring-boot-todo-api
./mvnw spring-boot:run
Access at http://localhost:8080/api/tasks
🐳 Docker
bash
docker build -t todo-api .
docker run -p 8080:8080 todo-api
📚 What I Learned
Spring Boot fundamentals and auto-configuration
RESTful API design and HTTP methods
JPA/Hibernate ORM and database integration
Layered architecture and dependency injection
Error handling and validation strategies
Docker containerization and cloud deployment
Developer: Gahan Patel
Live API: https://spring-boot-todo-api-blq6.onrender.com
