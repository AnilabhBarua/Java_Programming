import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private int year;

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        c1.setMake("Ford");
        c1.setModel("Mustang");
        c1.setYear(1974);

        c2.setMake("Chevrolet");
        c2.setModel("Camaro");
        c2.setYear(2007);

      
        System.out.println("Enter details for Car 3:");

        System.out.print("Make: ");
        c3.setMake(sc.nextLine());

        System.out.print("Model: ");
        c3.setModel(sc.nextLine());

        System.out.print("Year: ");
        while (!sc.hasNextInt()) {
            System.out.println("That's not a valid year! Please enter a valid year:");
            sc.next();
        }
        c3.setYear(sc.nextInt());


        System.out.println("\nCar 1:");
        System.out.println("Make: " + c1.getMake());
        System.out.println("Model: " + c1.getModel());
        System.out.println("Year: " + c1.getYear());

        System.out.println("\nCar 2:");
        System.out.println("Make: " + c2.getMake());
        System.out.println("Model: " + c2.getModel());
        System.out.println("Year: " + c2.getYear());

        System.out.println("\nCar 3:");
        System.out.println("Make: " + c3.getMake());
        System.out.println("Model: " + c3.getModel());
        System.out.println("Year: " + c3.getYear());

        sc.close();
    }
}

