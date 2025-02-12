import java.io.*;
import java.net.*;

public class Program4_TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6789);
        System.out.println("Server is running...");

        while (true) {
            Socket connectionSocket = serverSocket.accept();
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

            String clientSentence = inFromClient.readLine();
            String reversedSentence = new StringBuilder(clientSentence).reverse().toString();

            outToClient.writeBytes(reversedSentence + '
');
        }
    }
}

import java.io.*;
import java.net.*;

public class Program4_TCPClient {
    public static void main(String[] args) throws IOException {
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("localhost", 6789);

        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        System.out.println("Enter a string to reverse:");
        String sentence = inFromUser.readLine();
        outToServer.writeBytes(sentence + '
');

        String modifiedSentence = inFromServer.readLine();
        System.out.println("Reversed String: " + modifiedSentence);

        clientSocket.close();
    }
}