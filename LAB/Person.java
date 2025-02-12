import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p1 = new Person();
        Person p2 = new Person();    
        Person p3 = new Person();

        p1.setName("Saul Goodman");
        p1.setAge(49);
        p1.setSalary(50000.00);

        p2.setName("Walter White");
        p2.setAge(52);
        p2.setSalary(300000.00);

        System.out.println("Person 1:");
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Salary: " + p1.getSalary());

        System.out.println("Person 2:");
        System.out.println("Name: " + p2.getName());
        System.out.println("Age: " + p2.getAge());
        System.out.println("Salary: " + p2.getSalary());

        sc.nextLine();
        System.out.println("Enter Name:");
        p3.setName(sc.nextLine());

        System.out.println("Enter Age:");
        while (!sc.hasNextInt()) {
            System.out.println("That's not a valid integer! Please enter an age:");
            sc.next();
        }
        p3.setAge(sc.nextInt());

        System.out.println("Enter Salary:");
        while (!sc.hasNextDouble()) {
            System.out.println("That's not a valid number! Please enter a salary:");
            sc.next();
        }
        p3.setSalary(sc.nextDouble());

        System.out.println("Person 3:");
        System.out.println("Name: " + p3.getName());
        System.out.println("Age: " + p3.getAge());
        System.out.println("Salary: " + p3.getSalary());

        sc.close();
    }
}

