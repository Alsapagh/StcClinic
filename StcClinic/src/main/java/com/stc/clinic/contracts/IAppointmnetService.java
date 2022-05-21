package com.stc.clinic.contracts;

import com.stc.clinic.enums.CancelationReasons;
import com.stc.clinic.responses.Appointment;

import java.util.Date;
import java.util.List;

/**
 * 5/21/2022
 * CREATED BY @Ayman Alsapagh
 **/


public interface IAppointmnetService {

    //        --list all today's Appointment
    List<Appointment> getAllTodaysAppointments(Integer page, Integer pageSize);

    //        --add new appointment
    Appointment addNewAppointment(AppointmentDetails appointmentDetails);

    //        --cancel appointment and log the reason
    void cancelAppoitment(CancelationReasons cancelationReason, Long appointmentId);

    //        --filter appointment by dat future or history
    List<Appointment> filterAllAppointmentsByDate(Date date, Integer page, Integer pageSize);

    //        --filter appointment by patient name
    List<Appointment> filterAllAppointmentsByPatientNAme(String patientName, Integer page, Integer pageSize);

    //        --preview patient appointments history
    List<Appointment> perviewAllAppointmentsByPatientId(Long patientId, Integer page, Integer pageSize);
}
