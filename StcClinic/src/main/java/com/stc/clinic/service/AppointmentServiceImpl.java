package com.stc.clinic.service;

import com.stc.clinic.contracts.IAppointmnetService;
import com.stc.clinic.entities.AppointmentEntity;
import com.stc.clinic.enums.CancelationReasons;
import com.stc.clinic.repositories.AppointmentRepo;
import com.stc.clinic.responses.Appointment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 5/21/2022
 * CREATED BY @Ayman Alsapagh
 **/
@Service
public class AppointmentServiceImpl implements IAppointmnetService {

    @Autowire
    AppointmentRepo appointmentRepo;

    @Override
    public List<Appointment> getAllTodaysAppointments(Integer page, Integer pageSize) {
        Pageable paging = PageRequest.of(page - 1, pageSize);
        Page<AppointmentEntity> list = appointmentRepo.findbyTodayAppointment(new Date(), paging);
        return list.stream().map((view) -> {
            Appointment vo = new Appointment();
            vo.setAppointmentSataus(view.getAppointmentSataus());
            vo.setDate(view.getDate());
            vo.setPationtName(view.getPatient().getPatientName());
            return vo;
        }).collect(Collectors.toList());

    }

    @Override
    public Appointment addNewAppointment(AppointmentDetails appointmentDetails) {
        return null;
    }

    @Override
    public void cancelAppoitment(CancelationReasons cancelationReason, Long appointmentId) {

    }

    @Override
    public List<Appointment> filterAllAppointmentsByDate(Date date, Integer page, Integer pageSize) {
        return null;
    }

    @Override
    public List<Appointment> filterAllAppointmentsByPatientNAme(String patientName, Integer page, Integer pageSize) {
        return null;
    }

    @Override
    public List<Appointment> perviewAllAppointmentsByPatientId(Long patientId, Integer page, Integer pageSize) {
        return null;
    }


}