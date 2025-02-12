import java.net.*;
import java.io.*;
import java.util.Scanner;

public class tcpclient {
    public static void main(String[] args) throws IOException {
        // Take user input for the message
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter message to send to server:");
        String message = scanner.nextLine();
        
        Socket socket = new Socket("localhost", 8080);

        // Set up output stream to send message to the server
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        output.writeUTF(message);
        String m = new String(message).toUpperCase();
        System.out.println("Message sent to server: " + m);

        socket.close();
        scanner.close();
    }
}