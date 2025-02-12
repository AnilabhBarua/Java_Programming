//wap to print the area of two rectangle s having sides respt. by creating class names rectangle with both defualt and para cons and method named area 
import java.util.Scanner;

class Rectangle {
    private double length, breadth;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.breadth = 1.0;
    }

    // Parameterized constructor
    public Rectangle(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new IllegalArgumentException("Length and breadth must be positive numbers.");
        }
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle with default dimensions
        Rectangle defaultRect = new Rectangle();
        System.out.println("Area of default rectangle: " + defaultRect.area());

        try {
            // Rectangle with user input
            System.out.println("Enter length and breadth for the first rectangle:");
            double l1 = sc.nextDouble();
            double b1 = sc.nextDouble();
            Rectangle rect1 = new Rectangle(l1, b1);

            System.out.println("Enter length and breadth for the second rectangle:");
            double l2 = sc.nextDouble();
            double b2 = sc.nextDouble();
            Rectangle rect2 = new Rectangle(l2, b2);

            System.out.println("Area of first rectangle: " + rect1.area());
            System.out.println("Area of second rectangle: " + rect2.area());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
