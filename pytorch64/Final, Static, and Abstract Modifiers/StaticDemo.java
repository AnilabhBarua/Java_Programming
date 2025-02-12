
// 2. Demonstrate the use of static variables and methods in a class.
class StaticExample {
    static int staticVar = 0;
    
    static void increment() {
        staticVar++;
        System.out.println("Static Variable: " + staticVar);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        StaticExample.increment();
        StaticExample.increment();
    }
}
