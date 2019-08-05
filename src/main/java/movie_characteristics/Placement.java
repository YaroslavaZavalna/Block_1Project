package movie_characteristics;

import movie_characteristics.Cinema;

public class Placement {
    private Cinema cinema;
    public static int counter = 1;

    public Placement(Cinema cinema) {
        this.cinema = cinema;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public String toString() {
        return "Placement " + (counter++)+
                ": " + cinema+ "\n";
    }
}
