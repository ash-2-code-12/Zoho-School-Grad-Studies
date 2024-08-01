// 4. Create a Movie DTO class

public class MovieDTO {
    private static String studioName = "Universal Studios";

    private String title;
    private String director;
    private String genre;
    private int releaseYear;
    private double rating;

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
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

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static String getStudioName() {
        return studioName;
    }

    public static void setStudioName(String studioName) {
        MovieDTO.studioName = studioName;
    }
}
