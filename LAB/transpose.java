import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { 
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The elements in the array are:");
        printMatrix(arr);

        int[][] transposed = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        
        System.out.println("The transpose of the matrix is:");
        printMatrix(transposed); 
    }
    

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
}

