package com.model;

import org.springframework.stereotype.Component;

@Component
public class TicketService {

    FlightService flightService;

    public void setFlightService(FlightService flightService) {
        this.flightService = flightService;
    }

    public void confirmBooking(String flightId, String userId) {
        if (flightService.isAvailable(flightId)) {
            flightService.reduceSeat(flightId);
            System.out.println("Booking confirmed for " + userId + " on " + flightId);
        } else {
            System.out.println("Flight " + flightId + " is full");
        }
    }
}
