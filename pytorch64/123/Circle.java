//  circle using defualt and parameterized constructors. instance variables to record radius and colour and method to are.two circle objects

import java.util.Scanner;

class Circle {
    private double radius;
    private String color;

    // Default constructor
    public Circle() {
        this.radius = 1.0;
        this.color = "Red";
    }

    // Parameterized constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Method to calculate the area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create first Circle object
        System.out.println("Enter radius and color for Circle 1:");
        double radius1 = sc.nextDouble();
        sc.nextLine(); // Consume newline
        String color1 = sc.nextLine();
        Circle circle1 = new Circle(radius1, color1);

        // Create second Circle object
        System.out.println("Enter radius and color for Circle 2:");
        double radius2 = sc.nextDouble();
        sc.nextLine(); // Consume newline
        String color2 = sc.nextLine();
        Circle circle2 = new Circle(radius2, color2);

        // Print areas
        System.out.println("Area of Circle 1: " + circle1.calculateArea());
        System.out.println("Area of Circle 2: " + circle2.calculateArea());

        sc.close();
    }
}
