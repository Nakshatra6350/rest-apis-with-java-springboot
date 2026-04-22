package com.rest.learning.restLearning.mainProject.dto;

import lombok.Data;

@Data
public class OnboardDoctorRequestDto {
    private Long userId;

    public String getSpecialization() {
        return specialization;
    }

    public OnboardDoctorRequestDto(Long userId, String specialization, String name) {
        this.userId = userId;
        this.specialization = specialization;
        this.name = name;
    }

    public OnboardDoctorRequestDto() {
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String specialization;
    private String name;
}
