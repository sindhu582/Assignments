package com.example.movie_ticket_booking_app_rest_api.controller;



import com.example.movie_ticket_booking_app_rest_api.model.Booking;
import com.example.movie_ticket_booking_app_rest_api.service.BookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/bookings")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping("/bookings")
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking);
    }

    @GetMapping("/bookings/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable Long id) {
        return ResponseEntity.ok(bookingService.getBookingById(id));
    }

    @PutMapping("/bookings/{id}")
    public Booking updateBooking(@PathVariable Long id, @RequestBody Booking booking) {
        Booking existing = bookingService.getBookingById(id);
        existing.setBookingDate(booking.getBookingDate());
        existing.setSeats(booking.getSeats());
        existing.setMovieId(booking.getMovieId());
        existing.setTheaterId(booking.getTheaterId());
        existing.setCustomerId(booking.getCustomerId());
        return bookingService.saveBooking(existing);
    }

    @DeleteMapping("/bookings/{id}")
    public String deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
        return "Booking deleted with id " + id;
    }
}

