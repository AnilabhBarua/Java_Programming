import java.util.Scanner;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println("Employee Name: " + name + ", Monthly Salary: " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name and salary of employee " + (i + 1) + ":");
            String name = sc.next();
            double salary = sc.nextDouble();
            employees[i] = new Employee(name, salary);
        }

        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displaySalary();
        }
    }
}
