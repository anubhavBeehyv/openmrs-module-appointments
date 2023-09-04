package org.openmrs.module.appointments.config;

import org.openmrs.module.appointments.eventListener.SMSEventListenerAppointment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventListenerConfig {

    @Bean
    public SMSEventListenerAppointment smsEventListenerAppointment(){
        return new SMSEventListenerAppointment();
    }
}
