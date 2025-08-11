package com.model;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class FlightService {

    private Map<String, Integer> flightSeats = new HashMap<>();

    public FlightService() {
        flightSeats.put("FL123", 2); // 2 seats available
        flightSeats.put("FL456", 0); // full
    }

    public boolean isAvailable(String flightId) {
        return flightSeats.getOrDefault(flightId, 0) > 0;
    }

    public void reduceSeat(String flightId) {
        flightSeats.put(flightId, flightSeats.get(flightId) - 1);
    }
}
