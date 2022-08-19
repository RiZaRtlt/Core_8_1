import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Start server");
        int port = 8083;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket clientSocket = serverSocket.accept(); // ждем подключения
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                //BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                out.println(String.format("Твой порт %d", clientSocket.getPort()));
            }
        }
    }
}
