package ex17.oneway;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 10000);
            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();

            // buffer로 감싸는 이유 : buffer가 없으면 1바이트 이상 못 받는다.
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(
                            socket.getOutputStream(), "UTF-8"
                    )
            );
            bw.write(msg + "\n");
            // bw.write(msg); // 소비될 수 없는 데이터.
            bw.flush();
        } catch (IOException e) { // 잘못된 ip, port를 입력하는 경우를 잡아야 한다.
//            throw new RuntimeException(e); // JVM에 exception을 던지는 것.
//            System.out.println(e.getMessage()); // 최상단 메세지 하나만 출력.. 자세한 사항을 알 수 없다.
            e.printStackTrace(); // 꿀팁. 내가 만든 파일 부터 찾아라. 내가 만든 파일이 문제다.
        }
    }
}
