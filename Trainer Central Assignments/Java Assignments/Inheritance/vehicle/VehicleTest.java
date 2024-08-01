package vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("Toyota", "Camry", 2023, 4);
        Vehicle vehicle2 = new Motorcycle("Harley-Davidson", "Sportster", 2022, true);
        
        System.out.println("Vehicle 1 Info:");
        vehicle1.displayInfo();
        
        System.out.println("\nVehicle 2 Info:");
        vehicle2.displayInfo();
    }
}