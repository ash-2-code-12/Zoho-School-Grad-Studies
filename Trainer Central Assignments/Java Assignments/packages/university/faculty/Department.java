package packages.university.faculty;

public class Department {
    private String name;
    private String head;

    public Department(String name, String head) {
        this.name = name;
        this.head = head;
    }

    // Getters and setters
    public String getName() { return name; }
    public String getHead() { return head; }
}
