package packages.university.students;

import packages.university.courses.Course;

public class Enrollment {
    private Student student;
    private Course course;
    private String semester;

    public Enrollment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    // Getters and setters
    public Student getStudent() { return student; }
    public Course getCourse() { return course; }
    public String getSemester() { return semester; }
}

