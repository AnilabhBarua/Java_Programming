
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

public class Program6 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of integers: " + calc.add(3, 5));
        System.out.println("Sum of doubles: " + calc.add(3.5, 2.5));
        System.out.println("Sum of array: " + calc.add(new int[]{1, 2, 3, 4}));
    }
}
