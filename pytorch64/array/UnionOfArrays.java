import java.util.Scanner;

public class UnionOfArrays {
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

        // Create a temporary array to store the union of both arrays
        int[] union = new int[n1 + n2];
        int index = 0;

        // Add elements of the first array to the union array
        for (int i = 0; i < n1; i++) {
            union[index++] = arr1[i];
        }

        // Add elements of the second array to the union array if they are not already present
        for (int i = 0; i < n2; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr2[i] == union[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If the element is not a duplicate, add it to the union array
            if (!isDuplicate) {
                union[index++] = arr2[i];
            }
        }

        // Display the union of the two arrays
        System.out.print("Union of the two arrays: ");
        for (int i = 0; i < index; i++) {
            System.out.print(union[i] + " ");
        }
    }
}
