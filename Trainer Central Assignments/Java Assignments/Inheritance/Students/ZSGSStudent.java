package Students;

public class ZSGSStudent extends Student {
    private static final String group = "ZOHO School for Graduate Studies";

    public ZSGSStudent(String name, int age, String id, String joinDate) {
        super(name, age, id, joinDate);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Group"  + group);
    }
}