package com.rest.learning.restLearning.service;

import com.rest.learning.restLearning.dto.AddStudentRequestDto;
import com.rest.learning.restLearning.dto.StudentDto;
import org.jspecify.annotations.Nullable;

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
