package com.springboot.movieApp.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")

public class Movie {

	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="movie_id")
		private int movieId;
		@Column(name="movie_name", nullable=false, length=50, unique=true)
		private String movieName;
		@Column(name="movie_description", nullable=false, length=500)
		private String movieDescription;
		@Column(name="release_date", nullable=false)
		private LocalDateTime releaseDate;
		@Column(name="trailer_url", nullable=false, length=500)
		private String trailerUrl;
		@Column(name="cover_photo_url", nullable=false, length=500)
		private String coverPhotoUrl;
		@Column(name="duration", nullable=false)
		private double duration;
		@Column(name="genre", nullable=false)
		private String genre;
		
		public int getMovieId() {
			return movieId;
		}
		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}
		public String getMovieName() {
			return movieName;
		}
		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}
		public String getMovieDescription() {
			return movieDescription;
		}
		public void setMovieDescription(String movieDescription) {
			this.movieDescription = movieDescription;
		}
		public LocalDateTime getReleaseDate() {
			return releaseDate;
		}
		public void setReleaseDate(LocalDateTime releaseDate) {
			this.releaseDate = releaseDate;
		}
		public String getTrailerUrl() {
			return trailerUrl;
		}
		public void setTrailerUrl(String trailerUrl) {
			this.trailerUrl = trailerUrl;
		}
		public String getCoverPhotoUrl() {
			return coverPhotoUrl;
		}
		public void setCoverPhotoUrl(String coverPhotoUrl) {
			this.coverPhotoUrl = coverPhotoUrl;
		}
		public double getDuration() {
			return duration;
		}
		public void setDuration(double duration) {
			this.duration = duration;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		@Override
		public String toString() {
			return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieDescription=" + movieDescription
					+ ", releaseDate=" + releaseDate + ", trailerUrl=" + trailerUrl + ", coverPhotoUrl=" + coverPhotoUrl
					+ ", duration=" + duration + ", genre=" + genre + "]";
		}
		public Movie(int movieId, String movieName, String movieDescription, LocalDateTime releaseDate,
				String trailerUrl, String coverPhotoUrl, double duration, String genre) {
			super();
			this.movieId = movieId;
			this.movieName = movieName;
			this.movieDescription = movieDescription;
			this.releaseDate = releaseDate;
			this.trailerUrl = trailerUrl;
			this.coverPhotoUrl = coverPhotoUrl;
			this.duration = duration;
			this.genre = genre;
		}
		
		

}
