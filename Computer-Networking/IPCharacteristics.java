import java.net.InetAddress;

public class IPCharacteristics {
    public static void main(String[] args){
        try {
            InetAddress address = InetAddress.getByName(args[0]);

            if(address.isAnyLocalAddress()) {
                System.out.println(address+" is a wildcard address");
            }

            if(address.isLoopbackAddress()) {
                System.out.println(address+ " is a loopback address");
            }

            if(address.isLinkLocalAddress()) {
                System.out.println(address+" is a link-local address");
            } else if (address.isSiteLocalAddress()) {
                System.out.println(address+" is a site-local address");
            } else {
                System.out.println(address+" is a global address");
            }

            if(address.isMulticastAddress()) {
                if(address.isMCGlobal()) {
                    System.out.println(address+ " is a global multicast address");  
                } else if (address.isMCOrgLocal()) {
                    System.out.println(address + " is an organization-local multicast address");
                } else if (address.isMCSiteLocal()) {
                    System.out.println(address + " is a site-local multicast address");
                } else if (address.isMCLinkLocal()) {
                    System.out.println(address + " is a link-local multicast address");
                } else if (address.isMCNodeLocal()) {
                    System.out.println(address + " is a node-local multicast address");
                }
            }
        } catch ( Exception ex) {
            System.out.println("Could not resolve " + args[0]);
        }
    }
}
