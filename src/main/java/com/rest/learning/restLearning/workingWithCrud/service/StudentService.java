package com.rest.learning.restLearning.workingWithCrud.service;

import com.rest.learning.restLearning.workingWithCrud.dto.AddStudentRequestDto;
import com.rest.learning.restLearning.workingWithCrud.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDto> getAllStudents();

    StudentDto getStudentById(long id);

    StudentDto createStudent(AddStudentRequestDto reqBody);

    StudentDto updateStudent(AddStudentRequestDto reqBody, long id);

    void deleteStudent(long id);

    StudentDto updatePartialStudent(Map<String, Object> updates, long id);
}
