package com.rest.learning.restLearning.mainProject.entity;

import jakarta.persistence.*;

import javax.print.Doc;
import java.time.LocalDateTime;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    @Column(length = 500)
    private String reason;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false) // patient is required to have an appointment
    private Patient patient;

    @ManyToOne
    @JoinColumn(nullable = false) // doctor is required to have an appointment
    private Doctor doctor;
}
