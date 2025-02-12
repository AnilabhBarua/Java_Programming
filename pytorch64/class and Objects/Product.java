import java.util.Scanner;

class Product {
    private String name;
    private double price, tax;

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public double calculateTotalPrice() {
        return price + (price * tax / 100);
    }

    public void displayDetails() {
        System.out.println("Product: " + name + ", Total Price: $" + calculateTotalPrice());
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name, price, and tax percentage:");
        String name = sc.next();
        double price = sc.nextDouble();
        double tax = sc.nextDouble();

        Product product = new Product(name, price, tax);
        product.displayDetails();
    }
}
