import java.util.Scanner;

class Laptop {
    private String brand, model, processor;
    private int ram;

    public void setSpecifications(String brand, String model, String processor, int ram) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
    }

    public void displaySpecifications() {
        System.out.println("Laptop Brand: " + brand + ", Model: " + model + ", Processor: " + processor + ", RAM: " + ram + "GB");
    }
}

public class LaptopTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop laptop = new Laptop();

        System.out.println("Enter laptop brand, model, processor, and RAM size:");
        String brand = sc.next();
        String model = sc.next();
        String processor = sc.next();
        int ram = sc.nextInt();

        laptop.setSpecifications(brand, model, processor, ram);
        laptop.displaySpecifications();
    }
}
