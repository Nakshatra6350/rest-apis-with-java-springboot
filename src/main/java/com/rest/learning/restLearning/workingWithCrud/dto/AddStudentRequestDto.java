package com.rest.learning.restLearning.workingWithCrud.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AddStudentRequestDto {

    @NotBlank(message = "Name is Required")
    @Size(min=3, max = 30, message = "Length should be of length between 3 to 30 characters")
    private String name;

    @Email
    @NotBlank(message = "Email is Required")
    private String email;


    public AddStudentRequestDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public AddStudentRequestDto() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
