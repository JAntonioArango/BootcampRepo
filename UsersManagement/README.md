# Users Management System

A RESTful API for managing users built with Spring Boot. This application provides basic CRUD operations for user management with in-memory storage.

## Technologies Used

- **Java 21** - Programming language
- **Spring Boot 3.3.5** - Framework for building the REST API
- **Spring Web** - For creating RESTful web services
- **Maven** - Build automation and dependency management
- **Spring Boot Test** - Testing framework

## Project Structure

```
src/
├── main/
│   ├── java/com/example/UsersManagement/
│   │   ├── Controller/
│   │   │   └── UserController.java      # REST endpoints
│   │   ├── Entities/
│   │   │   └── User.java               # User entity model
│   │   ├── Services/
│   │   │   └── UserService.java        # Business logic
│   │   └── UsersManagementApplication.java # Main application
│   └── resources/
│       └── application.properties       # Configuration
└── test/
    └── java/com/example/UsersManagement/
        └── UsersManagementApplicationTests.java
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/addUser` | Add a new user |
| GET | `/listingUsers` | Get all users |
| POST | `/modifyUser` | Update an existing user |
| DELETE | `/deleteUser` | Delete a user |

### User Model
```json
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "age": 30,
  "role": "Developer"
}
```

## Local Development Setup

### Prerequisites
- Java 21 or higher
- Maven 3.6+ (or use included Maven wrapper)

### Running the Application

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd UsersManagement
   ```

2. **Using Maven Wrapper (Recommended)**
   ```bash
   # Windows
   mvnw.cmd spring-boot:run
   
   # Linux/Mac
   ./mvnw spring-boot:run
   ```

3. **Using Maven directly**
   ```bash
   mvn spring-boot:run
   ```

4. **Building and running JAR**
   ```bash
   mvn clean package
   java -jar target/UsersManagement-0.0.1-SNAPSHOT.jar
   ```

The application will start on `http://localhost:8080`

### Testing the API

You can test the endpoints using curl, Postman, or any HTTP client:

**Add a user:**
```bash
curl -X POST http://localhost:8080/addUser \
  -H "Content-Type: application/json" \
  -d '{"id":1,"firstName":"John","lastName":"Doe","age":30,"role":"Developer"}'
```

**Get all users:**
```bash
curl http://localhost:8080/listingUsers
```

**Update a user:**
```bash
curl -X POST http://localhost:8080/modifyUser \
  -H "Content-Type: application/json" \
  -d '{"id":1,"firstName":"Jane","lastName":"Smith","age":25,"role":"Manager"}'
```

**Delete a user:**
```bash
curl -X DELETE http://localhost:8080/deleteUser \
  -H "Content-Type: application/json" \
  -d '{"id":1}'
```

## Running Tests

```bash
# Using Maven wrapper
mvnw.cmd test

# Using Maven
mvn test
```

## Notes

- This application uses in-memory storage (ArrayList), so data will be lost when the application restarts
- No database configuration is required for basic functionality
- The application runs on port 8080 by default