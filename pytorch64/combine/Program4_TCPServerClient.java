
// Simplified TCP Server-Client for string reversal

// TCP Server
// Save this part as Program4_Server.java
import java.io.*;
import java.net.*;

public class Program4_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Server started. Waiting for connection...");
        Socket clientSocket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String input = in.readLine();
        String reversed = new StringBuilder(input).reverse().toString();
        out.println(reversed);

        clientSocket.close();
        serverSocket.close();
    }
}

// TCP Client
// Save this part as Program4_Client.java
import java.io.*;
import java.net.*;

public class Program4_Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out.println("Hello, Server");
        System.out.println("Reversed from Server: " + in.readLine());

        socket.close();
    }
}
