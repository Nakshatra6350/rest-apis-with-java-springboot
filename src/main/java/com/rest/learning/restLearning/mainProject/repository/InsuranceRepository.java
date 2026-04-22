package com.rest.learning.restLearning.mainProject.repository;

import com.rest.learning.restLearning.mainProject.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}