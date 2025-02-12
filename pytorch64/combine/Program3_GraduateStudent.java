
import java.util.Scanner;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class GraduateStudent extends Student {
    int year;

    GraduateStudent(String name, int year) {
        super(name);
        this.year = year;
    }
}

public class Program3_GraduateStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter graduation year: ");
            int year = scanner.nextInt();

            GraduateStudent gs = new GraduateStudent(name, year);
            System.out.println("Graduate Student: " + gs.name + ", Year: " + gs.year);
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }
}
