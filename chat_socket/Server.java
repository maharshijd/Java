package chat_socket;

import java.io.*;
import java.net.*;

public class Server{
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader console = new BufferedReader(
                    new InputStreamReader(System.in));

            String msg;

            while (true) {
                // Read from client
                if ((msg = input.readLine()) != null) {
                    System.out.println("Client: " + msg);
                }

                // Send to client
                if (console.ready()) {
                    msg = console.readLine();
                    output.println(msg);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}