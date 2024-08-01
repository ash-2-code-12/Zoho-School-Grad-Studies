// 2. Design a Student Parent class and ZSGSStudent Child class. 
// Create constructors in both class with varying number of parameters.
//  Call parent constructor from child constructor.
//  Try experimenting by creating child object using parent constructor.


package Students;

public class Student {
    private String name;
    private int age;
    private String id;
    private String joinDate;

    public Student(String name, int age, String id, String joinDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.joinDate = joinDate;
    }

    public void displayInfo() {
        System.out.println("Name :" + name);
        System.out.println("Age : "+ age);
        System.out.println("ID  :"+ id);
        System.out.println("Join Date :" + joinDate);
    }
}
