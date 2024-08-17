package packages.university.faculty;

public class FacultyMember {
    private String name;
    private String facultyId;
    private String department;

    public FacultyMember(String name, String facultyId, String department) {
        this.name = name;
        this.facultyId = facultyId;
        this.department = department;
    }

    // Getters and setters
    public String getName() { return name; }
    public String getFacultyId() { return facultyId; }
    public String getDepartment() { return department; }
}
