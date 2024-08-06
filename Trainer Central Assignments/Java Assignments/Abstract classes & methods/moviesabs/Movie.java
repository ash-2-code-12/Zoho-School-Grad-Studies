// 3. Change 'Movie' class to abstract class and add additional abstract methods in 'Movie' class and define them in the child classes

import java.util.ArrayList;
import java.util.Scanner;

public abstract  class Movie {
    
    public String title;
    public String director;
    public String genre;
    public float rating;
    public static ArrayList<Movie> movieList = new ArrayList<>();

    public static Scanner sc = new Scanner(System.in);

    public Movie(String title, String director, float rating){
        this.title = title;
        this.director = director;
        this.rating = rating;
        movieList.add(this);
    }

    public Movie(){
        this.title = Movie.setTitle();
        this.director = Movie.setDirector();
        this.rating = Movie.setRating();
        movieList.add(this);
    }

    public static String setTitle() {
        System.out.println("Enter the movie title : " );
        return sc.nextLine();
    }

    public static String setDirector() {
        System.out.println("Enter the movie director : " );
        return sc.nextLine();
    }

    public static float setRating() {
        System.out.println("Enter the movie rating : " );
        return sc.nextFloat();
    }

    public static void printMovieList(){
        System.out.println("---------------------");
        System.out.println("\nTHE MOVIE LIST : \n");
        for(Movie mv : movieList){
            System.out.println("\t" + mv.title);
        }
        System.out.println("---------------------");
    }

    protected abstract void getInfo();

    protected abstract String getGenre();

}
