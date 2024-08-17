package packages.library.books;

public class Author {
    private String name;
    private String bio;

    public Author(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    // Getters and setters
    public String getName() { return name; }
    public String getBio() { return bio; }
}