
import java.io.*;
import java.net.*;

public class Program4 {
    public static void main(String[] args) throws IOException {
        // Server
        new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(6789)) {
                System.out.println("Server is running...");
                Socket connectionSocket = serverSocket.accept();
                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
                
                String clientMessage = inFromClient.readLine();
                outToClient.writeBytes(new StringBuilder(clientMessage).reverse().toString() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        // Client
        new Thread(() -> {
            try (Socket clientSocket = new Socket("localhost", 6789)) {
                DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
                BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                
                String message = "HelloServer";
                outToServer.writeBytes(message + "\n");
                System.out.println("From Server: " + inFromServer.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
