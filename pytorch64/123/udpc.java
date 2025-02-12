import java.net.*;
import java.util.*;

public class udpc {
   public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter ");
    String message = sc.nextLine();
    DatagramSocket socket = new DatagramSocket();
    byte[] messageBytes = message.getBytes();
    InetAddress serveraddress = InetAddress.getByName("localhost");
    DatagramPacket packet = new DatagramPacket(messageBytes,messageBytes.length,serveraddress,3000);
    socket.send(packet);
    System.out.println("message is: "+message);
    sc.close();
    socket.close();

   } 
}