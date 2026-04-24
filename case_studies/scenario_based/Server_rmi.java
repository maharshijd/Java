package case_studies.scenario_based;

import java.rmi.registry.*;

public class Server_rmi {
    public static void main(String[] args) {
        try {
            Registry r = LocateRegistry.createRegistry(1099);
            ModImpl_rmi obj = new ModImpl_rmi();
            r.rebind("mod", obj);
            System.out.println("Server ready");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}