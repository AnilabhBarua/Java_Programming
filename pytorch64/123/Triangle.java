//to print the area of triange having side of 3,4 and 5 by creating a class names triangle having both default and parameterized constructors and a method named are
import java.util.Scanner;

class Triangle {
    private double side1, side2, side3;

    // Default constructor
    public Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    // Parameterized constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method to calculate the area using Heron's formula
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to validate if sides can form a triangle
    public boolean isValidTriangle() {
        return (side1 + side2 > side3) &&
               (side1 + side3 > side2) &&
               (side2 + side3 > side1);
    }

    public static void main(String[] args) {
        // Using default constructor
        Triangle defaultTriangle = new Triangle();
        if (defaultTriangle.isValidTriangle()) {
            System.out.println("Area of default triangle: " + defaultTriangle.area());
        } else {
            System.out.println("Default triangle sides do not form a valid triangle.");
        }

        // Using parameterized constructor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of triangle:");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        Triangle paramTriangle = new Triangle(s1, s2, s3);

        if (paramTriangle.isValidTriangle()) {
            System.out.println("Area of triangle: " + paramTriangle.area());
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        sc.close();
    }
}
