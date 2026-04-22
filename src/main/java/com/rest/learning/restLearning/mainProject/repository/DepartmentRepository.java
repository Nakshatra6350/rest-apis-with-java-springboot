package com.rest.learning.restLearning.mainProject.repository;

import com.rest.learning.restLearning.mainProject.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}