package com.example.movie_ticket_booking_app_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movie_ticket_booking_app_rest_api.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}