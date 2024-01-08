package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 { // 출력
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(System.out)
        );
        try {
            bw.write("안녕\n"); // '\n'은 통상적으로 줄바꾸기를 의미하는 시퀸스.
            bw.write("반가워\n"); // '.readLine()'은 '\n' 직전까지 읽는다. -> 마지막을 알리는 신호.
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
