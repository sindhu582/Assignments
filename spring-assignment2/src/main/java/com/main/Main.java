package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.TicketService;

public class Main {
    public static void main(String[] args) {
        // Load Spring 
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // Get TicketService bean
        TicketService ticketService = (TicketService) context.getBean("ticketService");

        // Confirm bookings
        ticketService.confirmBooking("FL123", "USER456");
        ticketService.confirmBooking("FL123", "USER789"); 
        ticketService.confirmBooking("FL123", "USER101"); 
    }
}
