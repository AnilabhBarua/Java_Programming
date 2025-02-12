//wap that describes a class lamp instance variable ..three methods....on off display two lamp object 
import java.util.Scanner;

class Lamp {
    private boolean isOn;

    // Constructor
    public Lamp() {
        this.isOn = false; // Lamp is initially off
    }

    // Method to turn on the lamp
    public void turnOn() {
        isOn = true;
    }

    // Method to turn off the lamp
    public void turnOff() {
        isOn = false;
    }

    // Method to display the lamp's status
    public void displayLightStatus() {
        if (isOn) {
            System.out.println("The lamp is ON.");
        } else {
            System.out.println("The lamp is OFF.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Turn on Lamp 1");
            System.out.println("2. Turn off Lamp 1");
            System.out.println("3. Display status of Lamp 1");
            System.out.println("4. Turn on Lamp 2");
            System.out.println("5. Turn off Lamp 2");
            System.out.println("6. Display status of Lamp 2");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lamp1.turnOn();
                    System.out.println("Lamp 1 is turned ON.");
                    break;
                case 2:
                    lamp1.turnOff();
                    System.out.println("Lamp 1 is turned OFF.");
                    break;
                case 3:
                    System.out.print("Lamp 1: ");
                    lamp1.displayLightStatus();
                    break;
                case 4:
                    lamp2.turnOn();
                    System.out.println("Lamp 2 is turned ON.");
                    break;
                case 5:
                    lamp2.turnOff();
                    System.out.println("Lamp 2 is turned OFF.");
                    break;
                case 6:
                    System.out.print("Lamp 2: ");
                    lamp2.displayLightStatus();
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
