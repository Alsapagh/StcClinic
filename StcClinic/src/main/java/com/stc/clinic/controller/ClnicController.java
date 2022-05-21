package com.stc.clinic.controller;

import com.stc.clinic.contracts.IAppointmnetService;
import com.stc.clinic.requests.appointmentDetails;
import com.stc.clinic.responses.Appointment;
import com.stc.clinic.responses.Appointments;
import sun.security.util.SecurityConstants;
import org.springframework.web.bind.annotation;

import java.awt.*;
import java.util.List;

/**
 * 5/21/2022
 * CREATED BY @Ayman Alsapagh
 **/
@RestController
public class ClnicController {

    @Autowired
    private IAppointmnetService iAppointmnetService;

    @ApiOperation(value = "Responsible for getting  all Today's Appointments of Doctor", response = InboxResponse.class, responseContainer = "List")
    @RequestMapping(method = RequestMethod.GET, value = "/todaysAppointments", produces = PageAttributes.MediaType.APPLICATION_JSON_VALUE)
    public List<Appointment> getProductsTypes(
            @RequestParam(required = true, name = "page", defaultValue = "1") Integer page,
            @RequestParam(required = true, name = "pageSize", defaultValue = "10") Integer pageSize) {

        return iAppointmnetService.getAllTodaysAppointments(page, pageSize);
    }


    @ApiOperation(value = "Responsible for getting  all Today's Appointments of Doctor", response = InboxResponse.class, responseContainer = "List")
    @RequestMapping(method = RequestMethod.POST, value = "/addNewAppointment", produces = PageAttributes.MediaType.APPLICATION_JSON_VALUE)
    public Appointment getProductsTypes(
            @RequestBody() appointmentDetails appointmentDetails,
            @RequestParam(required = true, name = "pageSize", defaultValue = "10") Integer pageSize) {

        return iAppointmnetService.(page, pageSize);
    }
}
