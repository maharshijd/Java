package number_guessing_socket;

import java.io.*;
import java.net.*;

public class GameClient {
    public static void main(String[] args) throws Exception
    {
        Socket socket = new Socket("localhost",6000);
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

        while(true){
            System.out.print("Enter guess (1-100): ");
            String guess = user.readLine();
            System.out.println(in);
            if(in.equals("Correct!")) break;
        }
        socket.close();
    }    
}
