package movie_characteristics;

import hall_characteristics.Hall;
import movie_characteristics.utils.*;

import java.time.LocalDate;


public class Movie {
    private String name;
    private Hall roomNumber;
    private MovieType movieType;
    private MovieStatus movieStatus;
    private MovieDuration duration;
    private double priceOfTicket;
    private MovieAgeCategory category;
    private int rating;
    private MovieGenre movieGenre;
    private LocalDate reliaseDate;

    public Movie(String name, Hall roomNumber, MovieType movieType, MovieStatus movieStatus,
                 MovieDuration duration, double priceOfTicket, MovieAgeCategory category,
                 int rating, MovieGenre movieGenre, LocalDate reliaseDate) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.movieType = movieType;
        this.movieStatus = movieStatus;
        this.duration = duration;
        this.priceOfTicket = priceOfTicket;
        this.category = category;
        this.rating = rating;
        this.movieGenre = movieGenre;
        this.reliaseDate = reliaseDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hall getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Hall roomNumber) {
        this.roomNumber = roomNumber;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public MovieStatus getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(MovieStatus movieStatus) {
        this.movieStatus = movieStatus;
    }

    public MovieDuration getDuration() {
        return duration;
    }

    public void setDuration(MovieDuration duration) {
        this.duration = duration;
    }

    public double getPriceOfTicket() {
        return priceOfTicket;
    }

    public void setPriceOfTicket(double priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }

    public MovieAgeCategory getCategory() {
        return category;
    }

    public void setCategory(MovieAgeCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Movie " +
                "'" + name + '\'' +
                ", " + roomNumber +
                ", movieType: " + movieType +
                ", movieStatus: " + movieStatus +
                ",\n duration: " + duration +
                ", priceOfTicket: " + priceOfTicket +
                ", category: " + category +
                ", rating: " + rating +
                ",\n movieGenre: " + movieGenre+
                ", reliaseDate: " + reliaseDate +"\n";
    }
}
