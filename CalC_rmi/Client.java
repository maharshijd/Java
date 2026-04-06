package CalC_rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(6969);
            Calculator stud = (Calculator) registry.lookup("CalC");
            System.out.println("Add: " + stud.add(10, 20));
            System.out.println("Sub: " + stud.sub(10, 20));
            System.out.println("Mul: " + stud.mul(10, 20));
            System.out.println("Div: " + stud.div(10, 20));
        } catch (Exception e) {
            System.out.println("Client Server Failed to start");
            e.printStackTrace();
        }
    }
}
