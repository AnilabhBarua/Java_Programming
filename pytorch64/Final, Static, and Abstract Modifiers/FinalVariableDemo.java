
// 13. Show that final variables cannot be reassigned.
public class FinalVariableDemo {
    public static void main(String[] args) {
        final int finalVar = 10;
        System.out.println("Final Variable: " + finalVar);
        
        // Uncommenting the below line will cause a compilation error.
        // finalVar = 20;
    }
}
