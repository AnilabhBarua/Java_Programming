import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;
    private double total;
    private char grade;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculateTotalAndGrade();
    }

    private void calculateTotalAndGrade() {
        for (int mark : marks) {
            total += mark;
        }
        double average = total / marks.length;
        if (average >= 90) grade = 'A';
        else if (average >= 80) grade = 'B';
        else if (average >= 70) grade = 'C';
        else if (average >= 60) grade = 'D';
        else grade = 'F';
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Total: " + total + ", Grade: " + grade);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = sc.next();
            System.out.println("Enter marks of 5 subjects:");
            int[] marks = new int[5];
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }
            students[i] = new Student(name, marks);
        }

        System.out.println("Student Details:");
        for (Student student : students) {
            student.displayDetails();
        }
    }
}
