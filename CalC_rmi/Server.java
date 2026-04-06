package CalC_rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            CalculatorImpl obj = new CalculatorImpl();
            Registry registry = LocateRegistry.createRegistry(6969);
            registry.rebind("CalC", obj);
            System.out.println("CalC server Started. . . ");
        } catch (Exception e) {
            System.out.println("Server Failed to start");
            e.printStackTrace();
        }

    }
}
