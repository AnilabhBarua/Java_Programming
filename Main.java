public class Main {
    public static void main(String[] args) {
        // Create two Circle objects with different radii and colors
        Circle circle1 = new Circle(5.0, Color.RED);
        Circle circle2 = new Circle(10.0, Color.GREEN);

        // Print the area of each circle (simplified for brevity)
        System.out.println("Area: " + String.format("%.2f", Math.PI * Math.pow(circle1.radius, 2)));

        // Print a summary of both circles (radius, color, and calculated area)
        System.out.println("\nSummary:");
        System.out.println(String.format("Circle 1: %s with radius %.2f sq.units and color %s.", circle1.toString(), circle1.radius, Color.RED.name()));
        System.out.println(String.format("Circle 2: %s with radius %.2f sq.units and color %s.", circle2.toString(), circle2.radius, Color.GREEN.name()));
    }
}

public enum Color {
    RED,
    GREEN,
    BLUE
}
