package com.rest.learning.restLearning.workingWithCrud.repository;

import com.rest.learning.restLearning.workingWithCrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
