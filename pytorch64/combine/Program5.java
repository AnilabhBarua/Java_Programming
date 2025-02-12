
import java.util.ArrayList;

public class Program5 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(80);
        marks.add(90);
        marks.add(70);

        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        System.out.println("Total Marks: " + total);
    }
}
