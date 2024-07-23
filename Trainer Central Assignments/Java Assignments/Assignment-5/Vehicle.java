// 2. In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes.

 class VehicleMain{
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Vehicle(),
            new Car(),
            new Bike()
        };

        for(Vehicle each : vehicles){
            System.out.println((each.start()));
            System.out.println(each.stop());
            System.out.println("_________________________________");
        }
    }
}

class Vehicle {
    public String start(){
        return "Vehicle has started.";
    }
    public String stop(){
        return "Vehicle has stopped.";
    }
}
class Car extends Vehicle{
    @Override
    public String start(){
        return "Car has started.";
    }

    @Override 
    public String stop(){
        return "Car has stopped.";
    }
}
class Bike extends Vehicle{
    @Override
    public String start(){
        return "Bike has started.";
    }

    @Override 
    public String stop(){
        return "Bike has stopped.";
    }
}