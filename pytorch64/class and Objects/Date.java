import java.util.Scanner;

class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void displayDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day, month, and year:");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        Date date = new Date(day, month, year);
        date.displayDate();
    }
}
