
import java.io.*;
import java.net.*;

public class Program9 {
    public static void main(String[] args) {
        // Server
        new Thread(() -> {
            try (DatagramSocket serverSocket = new DatagramSocket(9876)) {
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                String message = new String(receivePacket.getData()).trim();
                System.out.println("Received: " + message);

                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                String response = "Hello, " + message;
                byte[] sendData = response.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        // Client
        new Thread(() -> {
            try (DatagramSocket clientSocket = new DatagramSocket()) {
                InetAddress serverAddress = InetAddress.getByName("localhost");
                String message = "Client";
                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9876);
                clientSocket.send(sendPacket);

                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                clientSocket.receive(receivePacket);
                System.out.println("Response: " + new String(receivePacket.getData()).trim());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
