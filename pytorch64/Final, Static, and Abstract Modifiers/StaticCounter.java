
// 9. Define a static counter variable in a class.
class Counter {
    static int count = 0;
    
    Counter() {
        count++;
    }
}

public class StaticCounter {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("Total objects created: " + Counter.count);
    }
}
