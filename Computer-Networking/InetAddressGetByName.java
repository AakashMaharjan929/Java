import java.net.*;

public class InetAddressGetByName {

    public static void main( String[] args ){
        try {
            // InetAddress address = InetAddress.getByName("aakashmaharjan.com.np");
            // System.out.println( address );
            // InetAddress address = InetAddress.getByName("172.67.166.16");
            // System.out.println( address.getHostName() );
            // System.out.println( address );
            InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
            for( InetAddress address : addresses ){
                System.out.println( address );
            }

        } catch ( UnknownHostException ex ){
            System.out.println("Could not find 172.67.166.16");
        }
    }
}