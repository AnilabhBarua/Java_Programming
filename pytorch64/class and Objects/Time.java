import java.util.Scanner;

class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time addTime(Time t) {
        int totalSeconds = this.toSeconds() + t.toSeconds();
        return Time.fromSeconds(totalSeconds);
    }

    public int toSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public static Time fromSeconds(int totalSeconds) {
        int hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return new Time(hours, minutes, seconds);
    }

    public void displayTime() {
        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours, minutes, and seconds for Time 1:");
        Time t1 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Enter hours, minutes, and seconds for Time 2:");
        Time t2 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());

        Time t3 = t1.addTime(t2);
        System.out.print("Sum of times: ");
        t3.displayTime();
    }
}
