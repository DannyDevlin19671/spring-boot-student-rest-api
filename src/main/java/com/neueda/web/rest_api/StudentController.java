package com.neueda.web.rest_api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author danieldevlin
 * @date 16/12/2024
 * @project rest-api
 */

@RestController
@RequestMapping("/api/students")
public class StudentController {

    // In-memory storage for students
    private Map<Integer, Student> studentData = new HashMap<>();
    private int currentId = 1;

    // GET: Fetch all students
    @GetMapping
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentData.values());
    }

    // GET: Fetch a student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentData.getOrDefault(id, null);
    }

    // POST: Add a new student
    @PostMapping
    public String addStudent(@RequestBody Student student) {
        student.setId(currentId);
        studentData.put(currentId, student);
        return "Student added with ID: " + currentId++;
    }

    // PUT: Update an existing student
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        if (studentData.containsKey(id)) {
            updatedStudent.setId(id); // Keep the same ID
            studentData.put(id, updatedStudent);
            return "Student with ID " + id + " updated successfully.";
        } else {
            return "Student with ID " + id + " not found.";
        }
    }

    // DELETE: Remove a student by ID
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        if (studentData.remove(id) != null) {
            return "Student with ID " + id + " deleted successfully.";
        } else {
            return "Student with ID " + id + " not found.";
        }
    }
}
