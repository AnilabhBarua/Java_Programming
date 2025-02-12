
// 5. Demonstrate the use of static blocks in a class.
class StaticBlockExample {
    static int staticVar;
    
    static {
        staticVar = 10;
        System.out.println("Static block executed. Static Variable initialized.");
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println("Static Variable: " + StaticBlockExample.staticVar);
    }
}
