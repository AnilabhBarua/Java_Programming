import java.util.Scanner;

class Car {
    private String model;
    private double fuel, distance;

    public Car(String model, double fuel, double distance) {
        this.model = model;
        this.fuel = fuel;
        this.distance = distance;
    }

    public double calculateMileage() {
        return distance / fuel;
    }

    public void displayDetails() {
        System.out.println("Model: " + model + ", Mileage: " + calculateMileage() + " km/l");
    }
}

public class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car model, fuel consumed (liters), and distance travelled (km):");
        Car car = new Car(sc.next(), sc.nextDouble(), sc.nextDouble());
        car.displayDetails();
    }
}
