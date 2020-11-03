import java.net.*;

public class test {
        public static void main(String[] args) throws UnknownHostException {

        InetAddress IP = InetAddress.getLocalHost();
            System.out.println(IP);

        InetAddress name = InetAddress.getByName("DESKTOP-CD0UR15");
            System.out.println(name);

        String ip = IP.getHostName();
            System.out.println(ip);







    }

}
