// 1. Write a hierarchy of geometric shape classes 'Circle', 'Rectangle', etc inherited from a common base class 'Shape'
// 2. Design a Student Parent class and ZSGSStudent Child class. Create constructors in both class with varying number of parameters. Call parent constructor from child constructor. Try experimenting by creating child object using parent constructor.
// 3. Create Vehicle Hierarchy
// 4. Create classes for the given class diagram - https://www.geeksforgeeks.org/class-diagram-for-library-management-system/
// 5. https://exercism.org/tracks/java/exercises/wizards-and-warriors

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
