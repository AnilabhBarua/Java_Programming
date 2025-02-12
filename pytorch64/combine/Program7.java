
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}

class Customer extends Person {
    int customerID;

    public Customer(String name, int customerID) {
        super(name);
        this.customerID = customerID;
    }
}

public class Program7 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        Customer cust = new Customer("Bob", 12345);
        System.out.println("Employee: " + emp.name + ", Salary: " + emp.salary);
        System.out.println("Customer: " + cust.name + ", ID: " + cust.customerID);
    }
}
