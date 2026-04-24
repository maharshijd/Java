package case_studies.scenario_based;
import java.rmi.*;

public interface ModInterface_rmi extends Remote {
    int mod(int a, int b) throws RemoteException;
}