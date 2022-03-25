package collectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetMovieJava8Way {
    public static void main(String[] args) {
//        TreeSet<Movie> movies = new TreeSet<>((o1, o2) -> o1.getMovieId()-o2.getMovieId());
        TreeSet<Movie> movies = new TreeSet<>(Comparator.comparingInt(Movie::getMovieId));
        Movie movie1 = new Movie(1, "Cyber Attack", 300);
        Movie movie2 = new Movie(101, "Sairat", 300);
        Movie movie3 = new Movie(201, "Kashmir Files", 300);
        Movie movie4 = new Movie(2, "Mulashi Pattern", 300);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);

        //Iterating
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
