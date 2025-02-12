import java.util.Scanner;
class Rectangle {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of first rectangle:");
        Rectangle r1 = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter length and width of second rectangle:");
        Rectangle r2 = new Rectangle(sc.nextDouble(), sc.nextDouble());

        double area1 = r1.calculateArea();
        double area2 = r2.calculateArea();

        System.out.println("Area of first rectangle: " + area1);
        System.out.println("Area of second rectangle: " + area2);

        if (area1 > area2) {
            System.out.println("First rectangle has a larger area.");
        } else if (area2 > area1) {
            System.out.println("Second rectangle has a larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }
}
