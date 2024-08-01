import java.util.ArrayList;

public class Movie {
    private String title;
    private String director;
    private String genre;
    private int releaseYear;
    private float rating;

    private static int movieCount = 0;

    public Movie(String title, String director, String genre, int releaseYear, float rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
        movieCount++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public static int getCount() {
        return movieCount;
    }

    public void getDetails() {
        System.out.println("Details : \n Title : " + this.title + "\n Director : " + this.director + "\n Genre : " + this.genre + "\n Release Year : " + this.releaseYear + "\n Rating : " + this.rating);
    }

    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Inception", "Christopher Nolan", "Sci-Fi", 2010, 8.8f));
        movies.add(new Movie("The Godfather", "Francis Ford Coppola", "Crime", 1972, 9.2f));
        movies.add(new Movie("The Dark Knight", "Christopher Nolan", "Action", 2008, 9.0f));

        for (Movie movie : movies) {
            movie.getDetails();
        }

        System.out.println("Total number of movies: " + Movie.getCount());
    }
}
