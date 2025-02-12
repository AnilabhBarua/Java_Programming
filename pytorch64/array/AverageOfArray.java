//wap in java that creates and initializes a four element int array. calculate and display the average of its value 
//user input
import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 4 elements
        int[] arr = new int[4];

        // Ask the user to input values for the array
        System.out.println("Enter 4 integer values:");
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt(); // Input each value
            sum += arr[i]; // Add the value to the sum
        }

        // Calculate the average
        double average = sum / 4.0;

        // Display the average
        System.out.println("The average of the array elements is: " + average);
    }
}
