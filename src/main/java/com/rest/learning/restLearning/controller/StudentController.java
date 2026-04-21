package com.rest.learning.restLearning.controller;

import com.rest.learning.restLearning.dto.AddStudentRequestDto;
import com.rest.learning.restLearning.dto.StudentDto;
import com.rest.learning.restLearning.entity.Student;
import com.rest.learning.restLearning.repository.StudentRepository;
import com.rest.learning.restLearning.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<StudentDto>> getStudents(){
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudents(@PathVariable long id){
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDto> createStudent(@RequestBody AddStudentRequestDto reqBody){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createStudent(reqBody));
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@RequestBody AddStudentRequestDto reqBody, @PathVariable long id){
        return ResponseEntity.ok(studentService.updateStudent(reqBody, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<StudentDto> deleteStudent(@PathVariable long id){
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<StudentDto> updatePartialStudent(@RequestBody Map<String, Object> updates, @PathVariable long id){
        return ResponseEntity.ok(studentService.updatePartialStudent(updates, id));
    }
}
