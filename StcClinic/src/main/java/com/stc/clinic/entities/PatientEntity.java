package com.stc.clinic.entities;

import javax.persistence.*;
import java.util.List;

/**
 * 5/21/2022
 * CREATED BY @Ayman Alsapagh
 **/
@Entity
@Table(name = "Patient")
public class PatientEntity {
    @OneToMany(mappedBy = "patient")
    public List<AppointmentEntity> appointmentEntityList;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PATIENT_ID")

    Long patientId;
    @Column(name = "PATIENT_NAME")
    String patientName;
    @Column(name = "PATIENT_AGE")
    Long patientAge;

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Long getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Long patientAge) {
        this.patientAge = patientAge;
    }
}
