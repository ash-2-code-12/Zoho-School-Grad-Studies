import java.util.Scanner;

public class Student extends User {
    private String studentClass;

    public Student(String userType, String userName, String password, String name, String id, String studentClass) {
        super(userType, userName, password, name, id);
        this.studentClass = studentClass;
    }

    public Student() {
        super();
        Scanner sc = new Scanner(System.in);
        this.studentClass = setStudentClass(sc);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Class : " + this.studentClass);
    }

    public static String setStudentClass(Scanner sc) {
        System.out.println("Enter Class: ");
        return sc.nextLine();
    }
}