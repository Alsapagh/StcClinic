package com.stc.clinic.responses;

import java.util.Date;

/**
 * 5/21/2022
 * CREATED BY @Ayman Alsapagh
 **/
public class Appointment {
    Date date;
    String pationtName;
    String appointmentSataus;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPationtName() {
        return pationtName;
    }

    public void setPationtName(String pationtName) {
        this.pationtName = pationtName;
    }

    public String getAppointmentSataus() {
        return appointmentSataus;
    }

    public void setAppointmentSataus(String appointmentSataus) {
        this.appointmentSataus = appointmentSataus;
    }
}
