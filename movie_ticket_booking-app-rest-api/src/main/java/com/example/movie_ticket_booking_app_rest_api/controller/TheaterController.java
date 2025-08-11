package com.example.movie_ticket_booking_app_rest_api.controller;



import com.example.movie_ticket_booking_app_rest_api.model.Theater;
import com.example.movie_ticket_booking_app_rest_api.service.TheaterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TheaterController {

    @Autowired
    TheaterService theaterService;

    @GetMapping("/theaters")
    public List<Theater> getAllTheaters() {
        return theaterService.getAllTheaters();
    }

    @PostMapping("/theaters")
    public Theater createTheater(@RequestBody Theater theater) {
        return theaterService.saveTheater(theater);
    }

    @GetMapping("/theaters/{id}")
    public ResponseEntity<Theater> getTheaterById(@PathVariable Long id) {
        return ResponseEntity.ok(theaterService.getTheaterById(id));
    }

    @PutMapping("/theaters/{id}")
    public Theater updateTheater(@PathVariable Long id, @RequestBody Theater theater) {
        Theater existing = theaterService.getTheaterById(id);
        existing.setName(theater.getName());
        existing.setLocation(theater.getLocation());
        return theaterService.saveTheater(existing);
    }

    @DeleteMapping("/theaters/{id}")
    public String deleteTheater(@PathVariable Long id) {
        theaterService.deleteTheater(id);
        return "Theater deleted with id " + id;
    }
}

