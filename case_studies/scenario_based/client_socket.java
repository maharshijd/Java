package case_studies.scenario_based;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client_socket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Socket s = new Socket("localhost", 5000);

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            dos.writeInt(a);
            dos.writeInt(b);

            int res = dis.readInt();
            System.out.println("Remainder: " + res);

            dos.close();
            dis.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
