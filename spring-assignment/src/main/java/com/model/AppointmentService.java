package com.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class AppointmentService {

    DoctorRepository doctorRepository;

    public void setDoctorRepository(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public void book(String doctorId, String dateStr) {
        LocalDate date = LocalDate.parse(dateStr);
        if (doctorRepository.isAvailable(doctorId, date)) {
            System.out.println("Appointment confirmed");
        } else {
            System.out.println("Doctor not available");
        }
    }
}
