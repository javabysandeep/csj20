package collectionFramework;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMovie {
    public static void main(String[] args) {
        MovieComparator movieComparator = new MovieComparator();
        TreeSet<Movie> movies = new TreeSet<>(movieComparator);
       Movie movie1 = new Movie(1, "Cyber Attack",300);
       Movie movie5 = new Movie(1, "Cyber Attack",300);
       Movie movie2 = new Movie(101, "Sairat",300);
       Movie movie3 = new Movie(201, "Kashmir Files",300);
       Movie movie4 = new Movie(2, "Mulashi Pattern",300);
       movies.add(movie1);
       movies.add(movie2);
       movies.add(movie3);
       movies.add(movie4);
       movies.add(movie5);

       //Iterating
        for (Movie movie:movies) {
            System.out.println(movie);
        }
    }
}
