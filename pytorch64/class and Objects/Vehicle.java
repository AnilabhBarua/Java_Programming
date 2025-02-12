import java.util.Scanner;

class Vehicle {
    private String brand, model;
    private double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicle brand, model, and price:");
        String brand = sc.next();
        String model = sc.next();
        double price = sc.nextDouble();

        Vehicle vehicle = new Vehicle(brand, model, price);
        vehicle.displayDetails();
    }
}
