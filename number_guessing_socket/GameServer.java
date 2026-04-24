package number_guessing_socket;

import java.io.*;
import java.net.*;
import java.util.Random;

public class GameServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(6000);
        System.out.println("Server is running... Waiting for client.");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        Random rand = new Random();
        int number = rand.nextInt(100) + 1; // random number 1–100
        System.out.println("Secret number: " + number); // for testing

        String input;

        while ((input = in.readLine()) != null) {
            int guess = Integer.parseInt(input);

            if (guess < number) {
                out.println("Too low!");
            } else if (guess > number) {
                out.println("Too high!");
            } else {
                out.println("Correct!");
                break;
            }
        }

        socket.close();
        serverSocket.close();
        System.out.println("Game over.");
    }
}