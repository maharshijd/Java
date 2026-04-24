package case_studies.scenario_based;


import java.rmi.*;
import java.rmi.server.*;

public class ModImpl_rmi extends UnicastRemoteObject implements ModInterface_rmi {

    public ModImpl_rmi() throws RemoteException {
    }

    public int mod(int a, int b) throws RemoteException {
        return a % b;
    }
}
