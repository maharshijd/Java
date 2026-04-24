package ChatApp.src.Server;

import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server Started....");
        while (true) {
            Socket socket = server.accept();
            new ClientHandler(socket).start();
        }
    }
}
