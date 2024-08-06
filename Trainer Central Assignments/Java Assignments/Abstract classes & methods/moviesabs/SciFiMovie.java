public class SciFiMovie extends Movie {

    public static String genre = "SciFi";

    public SciFiMovie(){
        super();
    }

    public SciFiMovie(String title, String director, float rating){
        super(title, director, rating);
    }

    @Override
    protected void getInfo() {
        System.out.println("Movie details : \n\tTitle : " + this.title + "\n\tDirector : " + this.director + "\n\tGenre : " + genre + "\n\tRating : " + this.rating);
    }

    @Override
    protected String getGenre() {
        return genre;
    }
    
}
