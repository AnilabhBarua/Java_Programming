import java.net.*;
import java.io.*;

public class UDPServerClient {
    public static void main(String[] args) {
        new Thread(() -> startServer()).start();
        new Thread(() -> startClient()).start();
    }

    public static void startServer() {
        try (DatagramSocket socket = new DatagramSocket(9876)) {
            byte[] receiveBuffer = new byte[1024];
            System.out.println("Server is running...");
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                socket.receive(receivePacket);
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received: " + message);

                if (message.equalsIgnoreCase("exit")) break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void startClient() {
        try (DatagramSocket socket = new DatagramSocket()) {
            InetAddress address = InetAddress.getByName("localhost");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String message;

            System.out.println("Enter messages to send (type 'exit' to quit):");
            while (!(message = reader.readLine()).equalsIgnoreCase("exit")) {
                byte[] sendBuffer = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, address, 9876);
                socket.send(sendPacket);
            }
            System.out.println("Client exiting...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}