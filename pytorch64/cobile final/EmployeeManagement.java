import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

class Manager extends Employee {
    String department;

    Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        int count = 0;

        while (true) {
            System.out.println("1. Add Employee 2. View All 3. Exit");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        if (count >= employees.length) {
                            throw new Exception("Employee array is full.");
                        }
                        System.out.print("Enter ID, Name, and Salary: ");
                        int id = scanner.nextInt();
                        String name = scanner.next();
                        double salary = scanner.nextDouble();

                        System.out.print("Is this a Manager? (yes/no): ");
                        String isManager = scanner.next();

                        if (isManager.equalsIgnoreCase("yes")) {
                            System.out.print("Enter Department: ");
                            String department = scanner.next();
                            employees[count++] = new Manager(id, name, salary, department);
                        } else {
                            employees[count++] = new Employee(id, name, salary);
                        }
                        break;
                    case 2:
                        for (Employee emp : employees) {
                            if (emp != null) System.out.println(emp);
                        }
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
