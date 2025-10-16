# 🗂️ Task Tracker - Spring Boot REST API

A fully functional **Task Management REST API** built using **Spring Boot** and **MySQL**.  
This project allows users to create, update, delete, and view tasks — along with filtering and viewing task statistics like completed vs pending tasks.  

Designed with clean **RESTful architecture**, layered backend structure, and follows **best coding practices** for easy extensibility and maintenance.

Scroll below for sample screenshots
---

## 🧩 Project & Package Structure
task-tracker/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │   └── com/example/tasktracker/
│ │ │       ├── TaskTrackerApplication.java # Main class (entry point)
│ │ │       ├── controller/ # Handles API requests
│ │ │       │ └── TaskController.java
│ │ │       ├── model/ # Data models and enums
│ │ │       │ └── Task.java
│ │ │       ├── repository/ # JPA repositories
│ │ │         └── TaskRepository.java
│ │ │       ├── service/ # Business logic layer
│ │ │         └── TaskService.java
│ │ └── resources/
│ │ ├── application.properties # Database configuration
│ │ ├── data.sql (optional) # Initial data
│ │ └── static/ & templates/ (optional)
│ └── test/ # JUnit tests (future)
├── pom.xml # Maven dependencies
└── README.md # Project documentation


---

## 🚀 Features
✅ Create new tasks with title, description, due date, and priority  
✅ Update or delete existing tasks  
✅ Retrieve tasks with pagination, sorting, and filtering  
✅ Filter by status, priority, or category  
✅ View task statistics (total, completed, pending, completion rate)  
✅ Test endpoint (`/api/tasks/hello`) to check API availability  

---

## 🧰 Tech Stack
| Layer | Technology |
|--------|-------------|
| Language | Java 17 |
| Framework | Spring Boot 3.x |
| Database | MySQL |
| ORM | Spring Data JPA / Hibernate |
| Build Tool | Maven |
| IDE | Spring Tool Suite (STS) / IntelliJ |
| Testing | Postman |

---

## 🧪 API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| **POST** | `/api/tasks` | Create a new task |
| **GET** | `/api/tasks` | Get all tasks (with pagination, sorting, filtering) |
| **PUT** | `/api/tasks/{id}` | Update a task |
| **DELETE** | `/api/tasks/{id}` | Delete a task |
| **GET** | `/api/tasks/stats` | Get task statistics |
| **GET** | `/api/tasks/hello` | Test API connectivity |

##  Screenshots 
1️⃣ Create Task (POST)
<img width="1366" height="766" alt="http___localhost_8080_api_tasks_hello - My Workspace⁤ - Google Chrome 10_15_25 10_12_37 PM" src="https://github.com/user-attachments/assets/76d2f75c-1dc3-4d55-9ca0-37ab40ac8404" />

2️⃣ Get All Tasks (GET)
<img width="1366" height="766" alt="http___localhost_8080_api_tasks_hello - My Workspace⁤ - Google Chrome 10_15_25 10_28_03 PM" src="https://github.com/user-attachments/assets/88339d1a-5f42-48f7-977e-5e998e3e03a0" />

3️⃣ Filter Tasks (GET with params)
Example URL:
http://localhost:8080/api/tasks?status=Pending&priority=High&category=Work

<img width="1366" height="766" alt="http___localhost_8080_api_tasks_hello - My Workspace - Google Chrome 10_15_25 10_35_52 PM" src="https://github.com/user-attachments/assets/59e77cf1-270a-4432-8069-21555f216b82" />

4️⃣ Update Task (PUT)
<img width="1366" height="766" alt="http___localhost_8080_api_tasks_hello - My Workspace - Google Chrome 10_15_25 10_41_48 PM" src="https://github.com/user-attachments/assets/7976b95e-45bc-46e8-9a92-7e2969739c08" />


5️⃣ Delete Task (DELETE)
<img width="1366" height="766" alt="http___localhost_8080_api_tasks_hello - My Workspace - Google Chrome 10_15_25 10_42_37 PM" src="https://github.com/user-attachments/assets/c8d35701-6c53-47cc-bad8-b24e67b425a4" />

6️⃣ Get Statistics (GET)
<img width="1366" height="766" alt="http___localhost_8080_api_tasks_hello - My Workspace⁤ - Google Chrome 10_15_25 10_43_16 PM" src="https://github.com/user-attachments/assets/51ff5677-7762-43bc-a78a-0ded8c71cc6e" />

Testing Tips :
In Postman, set request type (POST/GET/PUT/DELETE) and choose Body > raw > JSON.
Use localhost:8080 unless you changed the port.
If you use H2 database, you can check the saved data at:
http://localhost:8080/h2-console

Future Enhancements :

 Authentication & Authorization: Add JWT-based login and signup
 Reminders: Send notifications for upcoming or overdue tasks
 Multi-user Support: Each user manages their own tasks
 Frontend Integration: Build a React or Angular UI to consume the REST API
 Search & Filters: Add keyword-based search and advanced filters
 Dashboard: Visual representation of statistics and progress charts

##  Steps to Run Locally :

Clone the Repository
git clone https://github.com/<your-username>/task-tracker.git
cd task-tracker

Configure Database
In src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/tasktracker
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Build and Run

mvn clean install
mvn spring-boot:run

Server starts at:
 http://localhost:8080

Author:
 Roshan S H
 roshansh24@gmail.com 
 https://github.com/Roshansh24
 “Built with passion for backend development and clean architecture.”
