package chat_socket;

import java.io.*;
import java.net.*;

public class Client{
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server!");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader console = new BufferedReader(
                    new InputStreamReader(System.in));

            String msg;

            while (true) {

                if (console.ready()) {
                    msg = console.readLine();
                    output.println(msg);
                }

                // Receive message from server
                if ((msg = input.readLine()) != null) {
                    System.out.println("Server: " + msg);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}