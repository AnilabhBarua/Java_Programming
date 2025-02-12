
import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] chars = new StringBuilder(input).reverse().toString().toCharArray();
        System.out.println("Characters in reverse order:");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        scanner.close();
    }
}
