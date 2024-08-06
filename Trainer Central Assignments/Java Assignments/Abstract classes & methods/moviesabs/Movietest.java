public class Movietest {
    public static void main(String[] args) {
        Movie mv1 = new HorrorMovie("Chandramukhi","P.Vasu", 9.10f);
        mv1.getInfo();
        mv1 = new SciFiMovie("Interstellar", "Alex caruso", 8.70f);
        mv1.getInfo();
        mv1 = new ComedyMovie("Blended", "Adam Sandler", 8.90f);
        mv1.getInfo();
        Movie.printMovieList();
    }
}
