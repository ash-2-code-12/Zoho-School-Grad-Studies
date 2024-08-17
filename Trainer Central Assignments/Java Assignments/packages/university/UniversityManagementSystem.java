// 2. Design a university management system with packages. 
// Create packages like university.students , university.courses , and university.faculty . 
// Implement classes within these packages to represent students, courses, and faculty members. 
// Utilize packages to structure the code based on the functionality.

package packages.university;

import packages.university.students.Student;
import packages.university.students.Enrollment;

import java.util.Date;

import packages.university.courses.Course;
import packages.university.courses.Schedule;
import packages.university.faculty.FacultyMember;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student = new Student("Alice Johnson", "S001", "Computer Science");
        Course course = new Course("Data Structures", "CS101", 3);
        FacultyMember faculty = new FacultyMember("Dr. Smith", "F001", "Computer Science");

        Enrollment enrollment = new Enrollment(student, course, "Fall 2024");
        Schedule schedule = new Schedule(course, new Date(), new Date());

        System.out.println("Student Name: " + student.getName());
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Faculty: " + faculty.getName() +"\n");

        System.out.println("Enrollment:");
        System.out.println("Student: " + enrollment.getStudent().getName());
        System.out.println("Course: " + enrollment.getCourse().getCourseName());
        System.out.println("Semester: " + enrollment.getSemester() + "\n");

        
        System.out.println("\nSchedule:");
        System.out.println("Course: " + schedule.getCourse().getCourseName());
        System.out.println("Start Time: " + schedule.getStartTime());
        System.out.println("End Time: " + schedule.getEndTime());
    }
}
