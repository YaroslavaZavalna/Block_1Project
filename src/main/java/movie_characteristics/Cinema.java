package movie_characteristics;

import movie_characteristics.Movie;

import java.util.List;

public class Cinema {
    private String name;
    private String address;
    private int rating;
    private List<Movie> movieList;

    public Cinema(String name, String address, int rating, List<Movie> movieList) {
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.movieList = movieList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public String toString() {
        return "name: '" + name + '\'' +
                ", address: " + address +
                ", rating: " + rating ;
    }
}
