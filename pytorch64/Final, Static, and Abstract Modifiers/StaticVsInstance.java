
// 11. Demonstrate the difference between static and instance variables.
class VariableDemo {
    static int staticVar = 0;
    int instanceVar = 0;

    void increment() {
        staticVar++;
        instanceVar++;
    }
}

public class StaticVsInstance {
    public static void main(String[] args) {
        VariableDemo obj1 = new VariableDemo();
        VariableDemo obj2 = new VariableDemo();

        obj1.increment();
        obj2.increment();

        System.out.println("Static Variable (shared): " + VariableDemo.staticVar);
        System.out.println("Instance Variable (obj1): " + obj1.instanceVar);
        System.out.println("Instance Variable (obj2): " + obj2.instanceVar);
    }
}
