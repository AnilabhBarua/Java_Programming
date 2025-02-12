import java.util.Scanner;

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}

class GraduateStudent extends Student {
    String degree;

    GraduateStudent(String name, int id, String degree) {
        super(name, id);
        this.degree = degree;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Graduate Degree: " + degree);
    }
}

public class Program3_StudentInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter Student Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Student ID:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter Graduate Degree:");
            String degree = scanner.nextLine();

            GraduateStudent gradStudent = new GraduateStudent(name, id, degree);
            gradStudent.display();

        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}