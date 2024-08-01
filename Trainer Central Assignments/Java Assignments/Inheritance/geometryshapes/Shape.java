// 1. Write a hierarchy of geometric shape classes 'Circle', 'Rectangle', etc inherited from a common base class 'Shape'
// 2. Design a Student Parent class and ZSGSStudent Child class. Create constructors in both class with varying number of parameters. Call parent constructor from child constructor. Try experimenting by creating child object using parent constructor.
// 3. Create Vehicle Hierarchy
// 4. Create classes for the given class diagram - https://www.geeksforgeeks.org/class-diagram-for-library-management-system/
// 5. https://exercism.org/tracks/java/exercises/wizards-and-warriors
public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Shape Color: " + color);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }
}
