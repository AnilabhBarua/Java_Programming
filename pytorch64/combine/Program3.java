
class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class GraduateStudent extends Student {
    String specialization;

    public GraduateStudent(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }
}

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter student name:");
            String name = scanner.nextLine();
            System.out.println("Enter student ID:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter specialization:");
            String specialization = scanner.nextLine();
            
            GraduateStudent gradStudent = new GraduateStudent(name, id, specialization);
            System.out.println("Graduate Student: " + gradStudent.name + ", ID: " + gradStudent.id + ", Specialization: " + gradStudent.specialization);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. ID must be a number.");
        }
        scanner.close();
    }
}
