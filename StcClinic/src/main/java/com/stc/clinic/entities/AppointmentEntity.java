package com.stc.clinic.entities;

import java.util.Date;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stc.clinic.enums.Configurations;
import com.work.specialist.App.enums.Configurations;

/**
 * 5/21/2022
 * CREATED BY @Ayman Alsapagh
 **/
@Entity
@Table(name = "Apointment")
public class AppointmentEntity {

    @Id
    @Cloumn(name = "APPOINTMENT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long appointmentId;

    @JsonFormat(shape = Shape.STRING, pattern = Configurations.DATE_FORMATE)
    Date date;

    @Cloumn(name = "PATIENT_NAME")
    @ManyoOne()
    @JoinColumn(name = "patient_id", referencedColumnName = "patient_id")
    PatientEntity patient;

    @Cloumn(name = "APPOINTMENT_STATUS")
    String appointmentSataus;

}
