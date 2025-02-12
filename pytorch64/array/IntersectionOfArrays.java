import java.util.Scanner;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();

        // Create and input the first array
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Ask the user for the number of elements in the second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();

        // Create and input the second array
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Find and display the intersection of the two arrays
        System.out.println("Intersection of the two arrays:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;  // To avoid duplicate intersection elements
                    break;  // Break the loop once the match is found
                }
            }
        }
    }
}
