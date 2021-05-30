package exe2;

import java.net.InetAddress;
public class Test {
	public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub
    InetAddress adr=InetAddress.getLocalHost();
    InetAddress adr2=InetAddress.getByName("Bahri");
    String nom=adr.getHostName();
    
    System.out.println("@de la machine local"+adr);
    System.out.println("@de la machine du nom Bahri est: "+adr2);
    System.out.println("le nom de la machine"+adr+"est:"+nom);
    
    byte []ipAddress= {127,0,0,1};
    InetAddress adr3=InetAddress.getByAddress(ipAddress);
    System.out.println("@de la machine local"+adr3);
    }
}

