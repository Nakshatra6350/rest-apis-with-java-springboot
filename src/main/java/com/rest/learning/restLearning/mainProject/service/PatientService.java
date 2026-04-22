package com.rest.learning.restLearning.mainProject.service;

import com.rest.learning.restLearning.mainProject.entity.Patient;
import com.rest.learning.restLearning.mainProject.repository.PatientRepository;
import jakarta.transaction.Transactional;

public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Transactional
    public Patient getPatientById(Long id){
        Patient p = patientRepository.findById(id).orElseThrow();
        return p;
    }
}
