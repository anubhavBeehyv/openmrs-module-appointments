package org.openmrs.module.appointments.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.openmrs.module.appointments.dao.AppointmentServiceDao;
import org.openmrs.module.appointments.model.AppointmentService;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.times;

@RunWith(PowerMockRunner.class)
public class AppointmentServiceServiceImplTest{

    @Mock
    private AppointmentServiceDao appointmentServiceDao;

    @InjectMocks
    AppointmentServiceServiceImpl appointmentServiceService;

    @Test
    public void testCreateAppointmentService() throws Exception {
        AppointmentService appointmentService = new AppointmentService();
        appointmentService.setName("Cardiology OPD");
        appointmentServiceService.save(appointmentService);
        Mockito.verify(appointmentServiceDao, times(1)).save(appointmentService);
    }

    @Test
    public void shouldGetAllAppointmentServices() throws Exception {
        appointmentServiceService.getAllAppointmentServices();
        Mockito.verify(appointmentServiceDao, times(1)).getAllAppointmentServices();
    }
}