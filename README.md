 Spring Boot Project

This is a RESTful API built using **Spring Boot** that manages departments in an organization.
It supports full **CRUD operations**, uses **Spring Data JPA** with an **H2 in-memory database**,
and implements best practices like **Hibernate Validation**, **Lombok for boilerplate removal**,
**logging**, and **exception handling**.

---

## 📌 Features

- Create a new department
- Get all departments
- Update an existing department
- Delete a department
- Validation with Hibernate Validator
- Centralized exception handling
- Logging using SLF4J
- In-memory database (H2)
- Clean project structure using layered architecture
-  RESTful endpoints for managing a primary entity (e.g. `Department`)
- Create, Read (by ID and all), Update, Delete
- Lookup by property (e.g. find by name/code)
- Input validation with Hibernate Validator (`@NotBlank`, `@Size`, etc.)
- Centralized exception handling using `@ControllerAdvice`
- Logging using SLF4J
- Entity mapping via Lombok (e.g. `@Data`, `@Builder`)
- In-memory H2 database for quick startup and testing
- Layered architecture: `controller`, `service`, `repository`, `entity`, `exception`

---

## 🛠️ Tech Stack

| Tool/Framework     | Purpose                            |
|--------------------|------------------------------------|
| Java 21            | Programming language               |
| Spring Boot        | Application framework              |
| Spring Web         | Building REST APIs                 |
| Spring Data JPA    | ORM and data access layer          |
| H2 Database        | In-memory development database     |
| Hibernate Validator| Input validation                   |
| Lombok             | Reducing boilerplate code          |
| Maven              | Dependency management              |
| IntelliJ           | Development IDEs                   |

---

## 📂 Project Structure
src
└── main
├── java
│ └── com.example.department
│ ├── controller
│ ├── service
│ ├── repository
│ ├── entity
│ └── exception
└── resources
├── application.properties


🔗 API Endpoints
Method	Endpoint	Description
POST	/api/departments	Create a new department
GET	/api/departments	Get all departments
GET	/api/departments/{id}	Get department by ID
GET	/api/departments/name/{name}	Get department by name
PUT	/api/departments/{id}	Update department
DELETE	/api/departments/{id}	Delete department


