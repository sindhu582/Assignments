package com.model;

import java.time.LocalDate;
import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class DoctorRepository {

    private Map<String, List<LocalDate>> doctorSchedule = new HashMap<>();

    public DoctorRepository() {
        doctorSchedule.put("DOC101", Arrays.asList(
            LocalDate.of(2025, 4, 10),
            LocalDate.of(2025, 4, 12)
        ));
    }

    public boolean isAvailable(String doctorId, LocalDate date) {
        List<LocalDate> availableDates = doctorSchedule.getOrDefault(doctorId, new ArrayList<>());
        return availableDates.contains(date);
    }
}
