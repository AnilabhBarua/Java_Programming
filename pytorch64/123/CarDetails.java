import java.util.Scanner;

class Car {
    // Attributes (Instance variables)
    String make;
    String model;
    int year;

    // Constructor to initialize the attributes
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display the details of the car
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class CarDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for the car's attributes
        System.out.print("Enter the car make: ");
        String make = scanner.nextLine();
        System.out.print("Enter the car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter the car year: ");
        int year = scanner.nextInt();

        // Create a Car object and initialize its attributes using the constructor
        Car car = new Car(make, model, year);

        // Display the car details
        car.displayDetails();
    }
}
