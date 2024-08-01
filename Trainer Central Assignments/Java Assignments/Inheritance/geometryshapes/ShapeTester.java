
public class ShapeTester {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("Circle Details:");
        circle.display();
        
        System.out.println("\nRectangle Details:");
        rectangle.display();
    }
}
