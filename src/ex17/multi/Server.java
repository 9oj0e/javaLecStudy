package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            // BR
            ServerSocket serverSocket = new ServerSocket(20000);
            System.out.println("서버 켜짐");
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트 연결");
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(),"UTF-8")
            );
            // BW
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(
                    socket.getOutputStream(), true, Charset.forName("UTF-8")
            );
            new Thread(()->{ // sub thread
                while (true) {
                    try {
                        String msg = br.readLine();
                        System.out.println("Client: " + msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            new Thread(() -> { // sub thread
                while(true){
                    String msg = sc.nextLine();
                    pw.println(msg);
                }
            }).start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}