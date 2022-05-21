package com.stc.clinic.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.work.specialist.App.enums.Configurations;

/**
 * 5/21/2022
 * CREATED BY @Ayman Alsapagh
 **/
@Entity
@Table(name = "Patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("PATIENT_ID")

    Long patientId;
    @Column("PATIENT_NAME")
    String patientName;
    @Column("PATIENT_AGE")
    Long patientAge;

    @OneToMany(mappedBy = "patient")
    private List<AppointmentEntity> appointmentEntityList;

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
