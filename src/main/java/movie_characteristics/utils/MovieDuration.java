package movie_characteristics.utils;

public class MovieDuration {
    private String from;
    private String to;

    public MovieDuration(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "from: " + from +
                ", to: " + to ;
    }
}
