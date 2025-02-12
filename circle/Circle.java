public class Circle {
    // Instance variables
    private double radius;
    private String color;

    // Default Constructor
    public Circle() {
        this.radius = 1.0; // default radius
        this.color = "red"; // default color
    }

    // Parameterized Constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }

    // Method to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to get the color
    public String getColor() {
        return color;
    }

    // Method to set the color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate and return the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
