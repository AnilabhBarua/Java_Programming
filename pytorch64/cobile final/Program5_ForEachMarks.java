import java.util.Scanner;

public class Program5_ForEachMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = scanner.nextInt();
        int[] marks = new int[n];

        System.out.println("Enter marks for each student:");
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt();
        }

        int total = 0;
        for (int mark : marks) {
            total += mark;
        }

        System.out.println("Total Marks: " + total);
        scanner.close();
    }
}