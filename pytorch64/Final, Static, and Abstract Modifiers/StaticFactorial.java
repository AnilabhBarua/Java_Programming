
// 7. Use a static method for calculating factorial.
class Factorial {
    static int calculate(int n) {
        if (n == 0) return 1;
        return n * calculate(n - 1);
    }
}

public class StaticFactorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is " + Factorial.calculate(number));
    }
}
