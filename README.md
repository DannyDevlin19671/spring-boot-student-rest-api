
---

## Endpoints

### 1. **Get All Students**
- **Description:** Retrieve all students in the system.
- **Method:** `GET`
- **URL:** `/api/students`
- **Response Example:**
    ```json
    [
      {
        "id": 1,
        "firstname": "John",
        "lastname": "Doe",
        "dob": "2000-01-15",
        "address": "123 Main St, Cityville",
        "email": "john.doe@example.com",
        "mobile": "1234567890"
      }
    ]
    ```

---

### 2. **Get Student by ID**
- **Description:** Retrieve a specific student by their ID.
- **Method:** `GET`
- **URL:** `/api/students/{id}`
- **Path Parameter:**
    - `id` (integer): The unique ID of the student.
- **Response Example (Success):**
    ```json
    {
      "id": 1,
      "firstname": "John",
      "lastname": "Doe",
      "dob": "2000-01-15",
      "address": "123 Main St, Cityville",
      "email": "john.doe@example.com",
      "mobile": "1234567890"
    }
    ```
- **Response Example (Not Found):**
    ```json
    null
    ```

---

### 3. **Add a New Student**
- **Description:** Add a new student to the system.
- **Method:** `POST`
- **URL:** `/api/students`
- **Request Body Example:**
    ```json
    {
      "firstname": "John",
      "lastname": "Doe",
      "dob": "2000-01-15",
      "address": "123 Main St, Cityville",
      "email": "john.doe@example.com",
      "mobile": "1234567890"
    }
    ```
- **Response Example:**
    ```
    Student added with ID: 1
    ```

---

### 4. **Update an Existing Student**
- **Description:** Update the details of an existing student.
- **Method:** `PUT`
- **URL:** `/api/students/{id}`
- **Path Parameter:**
    - `id` (integer): The unique ID of the student.
- **Request Body Example:**
    ```json
    {
      "firstname": "Jane",
      "lastname": "Smith",
      "dob": "1999-05-22",
      "address": "456 Elm St, Townsville",
      "email": "jane.smith@example.com",
      "mobile": "0987654321"
    }
    ```
- **Response Example (Success):**
    ```
    Student with ID 1 updated successfully.
    ```
- **Response Example (Not Found):**
    ```
    Student with ID 1 not found.
    ```

---

### 5. **Delete a Student**
- **Description:** Remove a student from the system.
- **Method:** `DELETE`
- **URL:** `/api/students/{id}`
- **Path Parameter:**
    - `id` (integer): The unique ID of the student.
- **Response Example (Success):**
    ```
    Student with ID 1 deleted successfully.
    ```
- **Response Example (Not Found):**
    ```
    Student with ID 1 not found.
    ```

---

## Running the Application
1. **Start the Application:**
   Run the application using Gradle:
   ```bash
   gradle bootRun

## cURL  Commands for Testing the Student API

2. **Using cURL to test the Student API.** 
   Run these commands in your terminal to interact with the application.

```bash
# Get All Students
curl -X GET http://localhost:8080/api/students

# Get Student by ID
curl -X GET http://localhost:8080/api/students/{id}
# Example
curl -X GET http://localhost:8080/api/students/1

# Add a New Student
curl -X POST http://localhost:8080/api/students \
     -H "Content-Type: application/json" \
     -d '{
           "firstname": "John",
           "lastname": "Doe",
           "dob": "2000-01-15",
           "address": "123 Main St, Cityville",
           "email": "john.doe@example.com",
           "mobile": "1234567890"
         }'

# Update an Existing Student
curl -X PUT http://localhost:8080/api/students/{id} \
     -H "Content-Type: application/json" \
     -d '{
           "firstname": "Jane",
           "lastname": "Smith",
           "dob": "1999-05-22",
           "address": "456 Elm St, Townsville",
           "email": "jane.smith@example.com",
           "mobile": "0987654321"
         }'
# Example
curl -X PUT http://localhost:8080/api/students/1 \
     -H "Content-Type: application/json" \
     -d '{
           "firstname": "Jane",
           "lastname": "Smith",
           "dob": "1999-05-22",
           "address": "456 Elm St, Townsville",
           "email": "jane.smith@example.com",
           "mobile": "0987654321"
         }'

# Delete a Student
curl -X DELETE http://localhost:8080/api/students/{id}
# Example
curl -X DELETE http://localhost:8080/api/students/1
