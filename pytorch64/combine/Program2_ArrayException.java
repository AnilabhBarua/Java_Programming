
public class Program2_ArrayException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println("Accessing element at index 3: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
