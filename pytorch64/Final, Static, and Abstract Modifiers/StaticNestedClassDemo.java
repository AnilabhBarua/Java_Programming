
// 10. Use a static nested class.
class OuterClass {
    static class NestedStaticClass {
        void display() {
            System.out.println("Static nested class method.");
        }
    }
}

public class StaticNestedClassDemo {
    public static void main(String[] args) {
        OuterClass.NestedStaticClass nestedObj = new OuterClass.NestedStaticClass();
        nestedObj.display();
    }
}
