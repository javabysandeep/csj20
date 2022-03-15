package collectionFramework;

import java.util.Comparator;

class MovieComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getMovieId()-m2.getMovieId();
    }
}