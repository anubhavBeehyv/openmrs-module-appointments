package org.openmrs.module.appointments.eventListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.event.EventListener;
import org.bahmni.module.events.api.model.Event;
import org.bahmni.module.events.api.model.BahmniEventType;


//@Component
public class SMSEventListenerAppointment {

    private final Log log = LogFactory.getLog(this.getClass());

    public SMSEventListenerAppointment() {
    }

    @EventListener
    public void onApplicationEvent(Event event) {
        if (event.eventType == BahmniEventType.BAHMNI_PATIENT_CREATED) {
//            event.payload
//            patient=(Patientevent.payload;
//            if (savePatientEvent.isRegistrationSmsEnabled()) {
//                Patient patient = savePatientEvent.getPatient();
//                String locationUuid = savePatientEvent.getLocationUuid();
//                UserContext userContext = savePatientEvent.getUserContext();
//                Context.openSession();
//                Context.setUserContext(userContext);
//                String phoneNumber = patient.getAttribute("phoneNumber").getValue();
//                if (null == phoneNumber) {
//                    log.info("Since no mobile number found for the patient. SMS not sent.");
//                    return;
//                }
//                Location location = Context.getLocationService().getLocationByUuid(locationUuid);
//                String message = smsService.getRegistrationMessage(new Locale("en"), patient, location);
//                smsService.sendSMS(phoneNumber, message);
//            }
        }
    }
}
