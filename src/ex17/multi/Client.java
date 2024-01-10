package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
            try {
                // BW
                Socket socket = new Socket("192.168.0.97", 20000);
                Scanner sc = new Scanner(System.in);
                PrintWriter pw = new PrintWriter(
                        socket.getOutputStream(), true, Charset.forName("UTF-8")
                );

                // BR
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(socket.getInputStream(),"UTF-8")
                );
                new Thread(() -> {
                    while(true){
                        String msg = sc.nextLine();
                        pw.println(msg);
                    }
                }).start();
                new Thread(()->{
                    while (true) {
                        try {
                            String msg = br.readLine();
                            System.out.println("Client: " + msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}