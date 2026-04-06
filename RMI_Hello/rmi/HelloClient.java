package RMI_Hello.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 5000);
            Hello stub = (Hello) registry.lookup("HelloServer");
            String response = stub.sayHello();
            System.out.println("Server says: " + response);
        } catch (Exception e) {
            System.out.println("Client Server Failed to start");
            e.printStackTrace();
        }
    }
}
