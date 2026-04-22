package com.rest.learning.restLearning.mainProject.repository;

import com.rest.learning.restLearning.mainProject.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}