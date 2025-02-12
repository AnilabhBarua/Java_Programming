class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}

class Customer extends Person {
    String customerID;

    Customer(String name, int age, String customerID) {
        super(name, age);
        this.customerID = customerID;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Customer ID: " + customerID);
    }
}

public class Program7_InheritancePerson {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 30, 50000);
        Customer cust = new Customer("Bob", 25, "C12345");

        System.out.println("Employee Details:");
        emp.display();

        System.out.println("Customer Details:");
        cust.display();
    }
}