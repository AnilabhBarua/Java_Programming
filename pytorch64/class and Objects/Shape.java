import java.util.Scanner;

class Shape {
    public double calculateSquareArea(double side) {
        return side * side;
    }

    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("Enter the side of the square:");
        double side = sc.nextDouble();
        System.out.println("Area of square: " + shape.calculateSquareArea(side));

        System.out.println("Enter the length and width of the rectangle:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.println("Area of rectangle: " + shape.calculateRectangleArea(length, width));
    }
}
