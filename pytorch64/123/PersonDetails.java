//wap that describes a person. it should have instance variables to record name, age and salary. create a person object. set and display its instance variables using methods.
import java.util.Scanner;

class Person {
    // Instance variables
    String name;
    int age;
    double salary;

    // Method to set the instance variables
    public void setDetails(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to display the instance variables
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Person object
        Person person = new Person();

        // User input for the person's details
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        // Set the person's details using the method
        person.setDetails(name, age, salary);

        // Display the person's details using the method
        System.out.println("\nPerson's Details:");
        person.displayDetails();
    }
}
