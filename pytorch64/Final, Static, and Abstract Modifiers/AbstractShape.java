
// 8. Define an abstract class Shape with an abstract method area. Implement it for Circle and Rectangle.
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    double area() {
        return length * width;
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());

        Shape rectangle = new Rectangle(4, 5);
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
