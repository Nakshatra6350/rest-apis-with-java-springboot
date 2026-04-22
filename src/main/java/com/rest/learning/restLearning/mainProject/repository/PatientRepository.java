package com.rest.learning.restLearning.mainProject.repository;

import com.rest.learning.restLearning.mainProject.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
