package com.example.movie_ticket_booking_app_rest_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	    private String title;
	    private String genre;
		public Movie(Long id, String title, String genre) {
			super();
			this.id = id;
			this.title = title;
			this.genre = genre;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		@Override
		public String toString() {
			return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + "]";
		}
	    
}
