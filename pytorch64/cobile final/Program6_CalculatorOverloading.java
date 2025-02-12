import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

public class Program6_CalculatorOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Choose addition type: 1. Two integers 2. Two doubles 3. Array of integers");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter two integers:");
                int int1 = scanner.nextInt();
                int int2 = scanner.nextInt();
                System.out.println("Sum: " + calc.add(int1, int2));
                break;
            case 2:
                System.out.println("Enter two doubles:");
                double double1 = scanner.nextDouble();
                double double2 = scanner.nextDouble();
                System.out.println("Sum: " + calc.add(double1, double2));
                break;
            case 3:
                System.out.println("Enter size of array:");
                int size = scanner.nextInt();
                int[] numbers = new int[size];
                System.out.println("Enter elements of the array:");
                for (int i = 0; i < size; i++) {
                    numbers[i] = scanner.nextInt();
                }
                System.out.println("Sum: " + calc.add(numbers));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}