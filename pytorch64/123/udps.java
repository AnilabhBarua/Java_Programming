import java.net.*;
public class udps {
    public static void main(String[] args)throws Exception {
        DatagramSocket socket = new DatagramSocket(3000);
        byte[] buffer = new byte[1024];
        System.out.println("Waiting for CLient...");
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
        socket.receive(packet);
       
        String message = new String(packet.getData(),0,packet.getLength());
        String m = new String(message.toUpperCase());

        System.out.println("Client: "+m);
        socket.close();
    }
}