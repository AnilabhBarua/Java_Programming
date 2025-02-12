
// 3. Demonstrate a final method that cannot be overridden.
class ParentClass {
    final void finalMethod() {
        System.out.println("This is a final method in the parent class.");
    }
}

class ChildClass extends ParentClass {
    // Uncommenting the below code will cause a compilation error.
    // void finalMethod() {
    //     System.out.println("Trying to override a final method.");
    // }
}

public class FinalMethodOverride {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.finalMethod();
    }
}
