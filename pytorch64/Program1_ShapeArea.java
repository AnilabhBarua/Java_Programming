
import java.util.Scanner;

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }
}

public class Program1_ShapeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[2];

        System.out.print("Enter radius of Circle: ");
        shapes[0] = new Circle(scanner.nextDouble());

        System.out.print("Enter side of Square: ");
        shapes[1] = new Square(scanner.nextDouble());

        System.out.println("Areas of Shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
