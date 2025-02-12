import java.util.Scanner;

class Shape {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    public double calculateArea(double side1, double side2, double height) {
        return 0.5 * side1 * side2 * height;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Scanner scanner = new Scanner(System.in);
        double[] areas = new double[5];
        int count = 0;

        while (count < 5) {
            System.out.println("Calculate area: 1. Circle 2. Rectangle 3. Triangle");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    areas[count++] = shape.calculateArea(radius);
                    break;
                case 2:
                    System.out.print("Enter length and breadth: ");
                    double length = scanner.nextDouble();
                    double breadth = scanner.nextDouble();
                    areas[count++] = shape.calculateArea(length, breadth);
                    break;
                case 3:
                    System.out.print("Enter side1, side2, and height: ");
                    double side1 = scanner.nextDouble();
                    double side2 = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    areas[count++] = shape.calculateArea(side1, side2, height);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.println("Calculated areas:");
        for (double area : areas) {
            System.out.println(area);
        }
    }
}
