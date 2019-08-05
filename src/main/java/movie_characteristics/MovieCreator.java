package movie_characteristics;

import hall_characteristics.Hall;
import movie_characteristics.utils.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MovieCreator {
    private static LocalDate formattedDate;
    private static DateTimeFormatter dateTimeFormatter;;
    private static final int min = 50;
    private static final int max = 75;

    public static int counterList = 1;
    public static int counterSet = 1;
    public static int seatsDiapason(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    public static List<Movie> createListOfMovie(){
        List<Movie>listOfMovie = new ArrayList<>();

        listOfMovie.add(new Movie("Capitan America", new Hall((int)((Math.random()*3)+1), seatsDiapason(min, max)), MovieType.ORIGINAL, MovieStatus.AVAILABLE, new MovieDuration("10:00", "11:40"),
                Math.round(((Math.random()*50)+1)*100.0)/100.0, MovieAgeCategory.FROM_12, (int)((Math.random()*5)+1), MovieGenre.FANTASY, formattedDate.parse(String.format("2019-07-30", dateTimeFormatter))));

        listOfMovie.add(new Movie("Psycho", new Hall((int)((Math.random()*3)+1), seatsDiapason(min, max)), MovieType.TRANSLATED, MovieStatus.PREMIERE, new MovieDuration("10:00", "11:40"),
                Math.round(((Math.random()*50)+1)*100.0)/100.0, MovieAgeCategory.FROM_16, (int)((Math.random()*5)+1), MovieGenre.THRILLER, formattedDate.parse(String.format("2019-07-30", dateTimeFormatter))));

        listOfMovie.add(new Movie("Funny Family", new Hall((int)((Math.random()*3)+1), seatsDiapason(min, max)), MovieType.ORIGINAL, MovieStatus.PRE_PREMIERE, new MovieDuration("10:00", "11:40"),
                Math.round(((Math.random()*50)+1)*100.0)/100.0, MovieAgeCategory.FROM_6, (int)((Math.random()*5)+1), MovieGenre.COMEDY ,formattedDate.parse(String.format("2019-07-30", dateTimeFormatter))));

        listOfMovie.add(new Movie("Clown", new Hall((int)((Math.random()*3)+1), seatsDiapason(min, max)), MovieType.ORIGINAL, MovieStatus.AVAILABLE, new MovieDuration("14:00", "15:40"),
                Math.round(((Math.random()*50)+1)*100.0)/100.0, MovieAgeCategory.FROM_16, (int)((Math.random()*5)+1), MovieGenre.HORROR, formattedDate.parse(String.format("2019-07-30", dateTimeFormatter))));

        listOfMovie.add(new Movie("Planets", new Hall((int)((Math.random()*3)+1), seatsDiapason(min, max)), MovieType.TRANSLATED, MovieStatus.PREMIERE, new MovieDuration("19:00", "21:40"),
                Math.round(((Math.random()*50)+1)*100.0)/100.0, MovieAgeCategory.FROM_16,(int)((Math.random()*5)+1), MovieGenre.SCI_FI ,formattedDate.parse(String.format("2019-07-30", dateTimeFormatter))));

        listOfMovie.add(new Movie("Last night", new Hall((int)((Math.random()*3)+1), seatsDiapason(min, max)), MovieType.ORIGINAL, MovieStatus.PRE_PREMIERE, new MovieDuration("21: 30", "23:00"),
                Math.round(((Math.random()*50)+1)*100.0)/100.0, MovieAgeCategory.FROM_18, (int)((Math.random()*5)+1), MovieGenre.DRAMA, formattedDate.parse(String.format("2019-07-30", dateTimeFormatter))));

        return listOfMovie;
    }
    public static void printMovies(List<Movie> movies){

        for (Movie movie: movies) {
            System.out.println((counterList++)+" "+movie.toString());
        }
    }

}
