
// 14. Demonstrate how abstract classes cannot be instantiated.
abstract class AbstractDemo {
    abstract void display();
}

public class AbstractClassInstantiation {
    public static void main(String[] args) {
        // Uncommenting the below line will cause a compilation error.
        // AbstractDemo obj = new AbstractDemo();
        System.out.println("Abstract classes cannot be instantiated.");
    }
}
