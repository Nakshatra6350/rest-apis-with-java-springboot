package com.rest.learning.restLearning.workingWithCrud.service.impl;

import com.rest.learning.restLearning.workingWithCrud.dto.AddStudentRequestDto;
import com.rest.learning.restLearning.workingWithCrud.dto.StudentDto;
import com.rest.learning.restLearning.workingWithCrud.entity.Student;
import com.rest.learning.restLearning.workingWithCrud.repository.StudentRepository;
import com.rest.learning.restLearning.workingWithCrud.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    public StudentServiceImpl(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<StudentDto> getAllStudents(){

        List<Student> students = studentRepository.findAll();

        List<StudentDto> studentDtoList = students.stream().map(student ->
           new StudentDto(student.getId(), student.getName(), student.getEmail())
        ).toList();

        return studentDtoList;
    }

    @Override
    public StudentDto getStudentById(long id){

        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with given id : " + id));

        StudentDto studentDto = modelMapper.map(student, StudentDto.class);

        return studentDto;
    }


    @Override
    public StudentDto createStudent(AddStudentRequestDto reqBody) {
        Student newStudent = modelMapper.map(reqBody, Student.class);
        Student student = studentRepository.save(newStudent);
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public StudentDto updateStudent(AddStudentRequestDto reqBody, long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with given id : " + id));
        modelMapper.map(reqBody, student);
        student = studentRepository.save(student);
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public void deleteStudent(long id) {
        if(!studentRepository.existsById(id)){
            throw new IllegalArgumentException("Student does not exists by id : " + id);
        }

        studentRepository.deleteById(id);
    }

    @Override
    public StudentDto updatePartialStudent(Map<String, Object> updates, long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with given id : " + id));
        updates.forEach((field, value) -> {
            switch (field){
                case "name" :
                    student.setName((String) value);
                    break;
                case "email" :
                    student.setEmail((String) value);
                    break;
                default:
                    throw new IllegalArgumentException("Field is not supported");
            }
        });

        Student newStudent = studentRepository.save(student);
        return modelMapper.map(newStudent, StudentDto.class);
    }
}
