package com.stc.clinic;

import com.stc.clinic.contracts.IAppointmnetService;
import com.stc.clinic.entities.AppointmentEntity;
import com.stc.clinic.repositories.AppointmentRepo;
import com.stc.clinic.responses.Appointments;
import sun.applet.AppletIOException;

import java.awt.print.Pageable;
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

    List<Appointments> getAllTodaysAppointments(Integer page, Integer pageSize) {
        Pageable paging = org.springframework.data.domain.PageRequest.of(page - 1, pageSize);
        Page<AppointmentEntity> list = appointmentRepo.findbyTodayAppointment(paging);
        List<Appointments> response = list.stream().map((view) -> {
            InboxResponse vo = new InboxResponse();
            vo.setServiceId(view.getServiceId());
            vo.setStageId(view.getCurrStageId());
            vo.setCustName(view.getCustName());
            vo.setBrName(view.getBrName());
            vo.setProdName(view.getProdName());
            vo.setEntryDate(view.getEntryDate());
            vo.setLastActionDate(view.getLastActionDate());
            vo.setWfCode(view.getWfCode());
            vo.setFromUserName(view.getFromUserName());
            return vo;
        }).collect(Collectors.toList());
        return null;
    }
}