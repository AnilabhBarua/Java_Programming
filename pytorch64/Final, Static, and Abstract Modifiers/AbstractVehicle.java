
// 12. Define an abstract class Vehicle with abstract methods start and stop.
abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key.");
    }
    void stop() {
        System.out.println("Car stops by pressing the brake.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a kick.");
    }
    void stop() {
        System.out.println("Bike stops by applying the brake.");
    }
}

public class AbstractVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}
