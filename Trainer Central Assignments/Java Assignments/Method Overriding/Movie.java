// 3. Create hierarchy from Movie class with Child classes of different genre movies like RomComMovie, ThrillerMovie, etc.
// Demonstrate polymorphism using them.

class MovieMain {
    public static void main(String[] args) {
        RomComMovie mov = new RomComMovie("Lala Land", 5.60);
        System.out.println(mov.getMovieDetails());
    }
    
}

class Movie{
    private String name;
    protected String genre = "unspecified";
    private float ratings;

    public Movie(String name, double ratings){
        this.name = name;
        this.ratings = (float)ratings;
    }   
    public String getMovieDetails(){
        return "Movie {\n\tName : "+name+",\n\tRatings : "+ratings+",\n\tGenre : "+genre+"\n\t}";
    } 
}

class RomComMovie extends Movie {

    public RomComMovie(String name, double ratings) {
        super(name, ratings);
        this.genre = "Rom-Com";
    }
}

class ThrillerMovie extends Movie {
    public ThrillerMovie(String name, double ratings) {
        super(name, ratings);
        this.genre = "Thriller";
    }
}

class ActionMovie extends Movie {
    public ActionMovie(String name, double ratings) {
        super(name, ratings);
        this.genre = "Action";
    }
}
// Polymorphism: In this example, Movie is a superclass, and RomComMovie, ThrillerMovie, and ActionMovie are subclasses. 
// Each subclass sets its genre in its constructor. Despite different implementations (i.e., different genres),
// we use the superclass reference type (Movie) to handle all instances.
// This demonstrates polymorphism, as we can treat different genre movies as Movie objects and still use their specific behaviors