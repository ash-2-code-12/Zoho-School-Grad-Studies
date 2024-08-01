import java.util.Scanner;

public class Staff extends User {
    private String dept;

    public Staff(String userType, String userName, String password, String name, String id, String dept) {
        super(userType, userName, password, name, id);
        this.dept = dept;
    }

    public Staff() {
        super();
        Scanner sc = new Scanner(System.in);
        this.dept = setDept(sc);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Dept : " + this.dept);
    }

    public static String setDept(Scanner sc) {
        System.out.println("Enter Department: ");
        return sc.nextLine();
    }
}
