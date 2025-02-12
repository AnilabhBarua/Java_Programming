import java.util.ArrayList;
import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

public class Program1_Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();

        System.out.println("Enter number of shapes:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter shape type (Circle/Square):");
            String type = scanner.next();
            if (type.equalsIgnoreCase("Circle")) {
                System.out.println("Enter radius:");
                double radius = scanner.nextDouble();
                shapes.add(new Circle(radius));
            } else if (type.equalsIgnoreCase("Square")) {
                System.out.println("Enter side length:");
                double side = scanner.nextDouble();
                shapes.add(new Square(side));
            } else {
                System.out.println("Invalid shape type!");
            }
        }

        System.out.println("Areas of shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }

        scanner.close();
    }
}