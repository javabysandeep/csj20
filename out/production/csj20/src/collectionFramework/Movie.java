package collectionFramework;

public class Movie /*implements Comparable<Movie>*/{
    private Integer movieId;
    private String movieName;
    private Integer ticketPrice;

    public Movie() {
    }

    public Movie(Integer movieId, String movieName, Integer ticketPrice) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

   /* @Override
    public int compareTo(Movie movie) {
        return this.movieId-movie.movieId;
    }*/
}
