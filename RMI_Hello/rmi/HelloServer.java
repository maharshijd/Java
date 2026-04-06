package RMI_Hello.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {
    public static void main(String[] args) {
        try {
            HelloImpl obj = new HelloImpl();
            Registry registry = LocateRegistry.createRegistry(5000);
            registry.rebind("HelloServer", obj);
            System.out.println("Server is Running. . . . . .");
        } catch (Exception e) {
            System.out.println("Server failed to start");
            e.printStackTrace();
        }
    }
}
