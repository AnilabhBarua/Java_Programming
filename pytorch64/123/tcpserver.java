import java.net.*;
import java.io.*;


public class tcpserver {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server is listening on port 5000...");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected");
        System.out.println("Waiting for message...");
        // Set up input stream to receive messages from client
        DataInputStream input = new DataInputStream(socket.getInputStream());
        String message = input.readUTF();
        String m1= new String(message).toUpperCase();
        System.out.println("Message from client: " + m1);
        
        socket.close();
        serverSocket.close();
    }
}