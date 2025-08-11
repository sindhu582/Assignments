package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.AppointmentService;

public class Appointment {
    public static void main(String[] args) {
        // Load context
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // Get service
        AppointmentService service = (AppointmentService) context.getBean("appointmentService");

        // Test booking
        service.book("DOC101", "2025-04-10"); // available
        service.book("DOC101", "2025-04-15"); // not available
    }
}
