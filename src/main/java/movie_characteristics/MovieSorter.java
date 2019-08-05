package movie_characteristics;

import movie_characteristics.utils.MovieGenre;

import java.util.*;
import java.util.stream.Collectors;

import static movie_characteristics.MovieCreator.*;

public class MovieSorter {
   private static Random random;

   public static List<Movie>filterByPopular(){
        random = new Random();
        List<Movie>movies = createListOfMovie();
        Set<Movie>popularMovies = new HashSet<>();
        List<Movie>popular = null;
       for (Movie movie : movies) {
           int index = random.nextInt(movies.size());
           popularMovies.add(movies.get(index));
       }
       popular = new ArrayList<>(popularMovies);
        return popular;
    }
   public static List<Movie>filterByBest(){
        random = new Random();
        List<Movie>movies = MovieCreator.createListOfMovie();
        List<Movie> groupedAndSorted = null;
        groupedAndSorted = movies.stream()
               .sorted(Comparator.comparing(Movie::getRating)
                       .reversed().thenComparing(Comparator.comparing(Movie::getPriceOfTicket)))
               .collect(Collectors.toList());
        return groupedAndSorted;
   }

    public static List<Movie> filterComedies(){
        List<Movie>movies = createListOfMovie();
        List<Movie> comedies = movies.stream()
                .filter(movie -> movie.getMovieGenre().equals(MovieGenre.COMEDY))
                .collect(Collectors.toList());

        return comedies;
    }
    public static List<Movie> filterHorrors(){
        List<Movie>movies = createListOfMovie();
        List<Movie> horrors = movies.stream()
                .filter(movie -> movie.getMovieGenre().equals(MovieGenre.HORROR))
                .collect(Collectors.toList());

        return horrors;
    }
    public static List<Movie> filterThriller(){
        List<Movie>movies = createListOfMovie();
        List<Movie> thrillers = movies.stream()
                .filter(movie -> movie.getMovieGenre().equals(MovieGenre.THRILLER))
                .collect(Collectors.toList());

        return thrillers;
    }
    public static List<Movie> filterDramas(){
        List<Movie>movies = createListOfMovie();
        List<Movie> dramas = movies.stream()
                .filter(movie -> movie.getMovieGenre().equals(MovieGenre.DRAMA))
                .collect(Collectors.toList());

        return dramas;
    }
    public static List<Movie> filterFantasy(){
        List<Movie>movies = createListOfMovie();
        List<Movie> fantasies = movies.stream()
                .filter(movie -> movie.getMovieGenre().equals(MovieGenre.FANTASY))
                .collect(Collectors.toList());
        printMovies(fantasies);
        return fantasies;
    }
    public static List<Movie> filterSciFi(){
        List<Movie>movies = createListOfMovie();
        List<Movie> sci_fi = movies.stream()
                .filter(movie -> movie.getMovieGenre().equals(MovieGenre.SCI_FI))
                .collect(Collectors.toList());

        return sci_fi;
    }
}
