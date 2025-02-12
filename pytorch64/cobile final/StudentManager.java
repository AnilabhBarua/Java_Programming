import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];
        int count = 0;

        while (true) {
            System.out.println("1. Add Student 2. View All 3. Search by ID 4. Update 5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (count < students.length) {
                        System.out.print("Enter ID, Name, and Age: ");
                        int id = scanner.nextInt();
                        String name = scanner.next();
                        int age = scanner.nextInt();
                        students[count++] = new Student(id, name, age);
                    } else {
                        System.out.println("No more students can be added.");
                    }
                    break;
                case 2:
                    for (Student student : students) {
                        if (student != null) System.out.println(student);
                    }
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = scanner.nextInt();
                    for (Student student : students) {
                        if (student != null && student.id == searchId) {
                            System.out.println(student);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null && students[i].id == updateId) {
                            System.out.print("Enter new Name and Age: ");
                            students[i].name = scanner.next();
                            students[i].age = scanner.nextInt();
                        }
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
