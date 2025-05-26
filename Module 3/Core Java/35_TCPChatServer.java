// 35_TCPChatServer.java
import java.io.*;
import java.net.*;

public class TCPChatServer {
    public static void main(String[] args) {
        int port = 12345; // any available port
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server listening on port " + port);
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());
            
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            
            // Simple communication: echo until "bye" is received
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println("Client: " + line);
                out.println("Server echo: " + line);
                if (line.equalsIgnoreCase("bye")) {
                    break;
                }
            }
            
            clientSocket.close();
        } catch(IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
