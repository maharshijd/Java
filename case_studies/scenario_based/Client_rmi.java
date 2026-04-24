package case_studies.scenario_based;

import java.rmi.registry.*;
import java.util.Scanner;

public class Client_rmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Registry r = LocateRegistry.getRegistry("localhost", 1099);
            ModInterface_rmi obj = (ModInterface_rmi) r.lookup("mod");

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int res = obj.mod(a, b);
            System.out.println("Remainder: " + res);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}