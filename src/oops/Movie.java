package oops;

public class Movie {
    int movieId;
    String movieTitle;
    int ticketPrice;

    int addition(int num1, int num2) {
        return num1 + num2;
    }

    Movie getMovieReference(Movie movie) {
        return this;
    }

    void display() {
        getMovieReference(this);
        System.out.println("instance method");
    }

    public Movie(int movieId) {
        this();
        System.out.println("one param con");
    }

    public Movie(int movieId, String movieTitle, int ticketPrice) {
//        this();//CTE
        this(20);//call to the zero param con
        // we want to assign the local var values to the instance variables.
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.ticketPrice = ticketPrice;
        this.display();
    }

    //will be called if we create object
    Movie() {
        System.out.println("zero param");
    }

    //instance block will be called if we create object
    {
        System.out.println("Instance block");
    }

    // only once when the class loaded
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        Movie movie = new Movie(1, "Pushpa", 500);
        int addition = movie.addition(10, 30);
        System.out.println(addition);
        Movie movieReference = movie.getMovieReference(new Movie());

    }
}
