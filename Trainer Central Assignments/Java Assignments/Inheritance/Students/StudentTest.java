package Students;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Saran", 22, "S001", "2024-07-01");
        Student student2 = new ZSGSStudent("Surya", 23, "S002", "2024-07-15");
        ZSGSStudent student3 = new ZSGSStudent("Ashwin", 24, "S003", "2024-08-01");

        System.out.println("Student 1 Info");
        student1.displayInfo();

        System.out.println("\nStudent 2 Info");
        student2.displayInfo();
        
        System.out.println("\nStudent 3 Info");
        student3.displayInfo();  
    }
}
