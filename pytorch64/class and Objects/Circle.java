import java.util.Scanner;

class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0; // Default constructor
    }

    public Circle(double radius) {
        this.radius = radius; // Parameterized constructor
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle defaultCircle = new Circle();
        System.out.println("Default Circle - Area: " + defaultCircle.calculateArea());

        System.out.println("Enter radius for a new circle:");
        Circle customCircle = new Circle(sc.nextDouble());
        System.out.println("Custom Circle - Area: " + customCircle.calculateArea() + ", Circumference: " + customCircle.calculateCircumference());
    }
}
