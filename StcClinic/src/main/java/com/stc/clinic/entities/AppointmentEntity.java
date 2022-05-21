package com.stc.clinic.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stc.clinic.enums.Configurations;

import javax.persistence.*;
import java.util.Date;

/**
 * 5/21/2022
 * CREATED BY @Ayman Alsapagh
 **/
@Entity
@Table(name = "Apointment")
public class AppointmentEntity {

    @Id
    @Column(name = "APPOINTMENT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long appointmentId;

    @JsonFormat(shape = Shape.STRING, pattern = Configurations.DATE_FORMATE)
    Date date;

    @Column(name = "PATIENT_NAME")
    @ManyToOne()
    @JoinColumn(name = "patient_id", referencedColumnName = "patient_id")
    PatientEntity patient;

    @Column(name = "APPOINTMENT_STATUS")
    String appointmentSataus;


    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PatientEntity getPatient() {
        return patient;
    }

    public void setPatient(PatientEntity patient) {
        this.patient = patient;
    }

    public String getAppointmentSataus() {
        return appointmentSataus;
    }

    public void setAppointmentSataus(String appointmentSataus) {
        this.appointmentSataus = appointmentSataus;
    }
}
