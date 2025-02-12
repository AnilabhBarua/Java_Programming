
// 15. Create a static method to calculate compound interest.
class InterestCalculator {
    static double calculateCompoundInterest(double principal, double rate, int time) {
        return principal * Math.pow((1 + rate / 100), time);
    }
}

public class StaticCompoundInterest {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        int time = 2;

        double interest = InterestCalculator.calculateCompoundInterest(principal, rate, time);
        System.out.println("Compound Interest: " + interest);
    }
}
