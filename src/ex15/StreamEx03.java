package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx03 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        // InputStreamReader의 매개 변수를 상대방의 socket으로 받으면, 그게 통신이다.
        BufferedReader br = new BufferedReader(ir);
        try {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
