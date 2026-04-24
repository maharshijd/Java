package case_studies.scenario_based;

import java.io.*;
import java.net.*;

public class server_socket {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            int a = dis.readInt();
            int b = dis.readInt();

            int result = a % b;
            dos.writeInt(result);

            dis.close();
            dos.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}