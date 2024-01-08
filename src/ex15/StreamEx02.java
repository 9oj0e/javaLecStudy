package ex15;

import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in); // InputStream in = System.in;
        char[] ch = new char[4]; // 매번 사이즈를 변경해주어야 되기에 절대 쓸 일이 없다.

        try {
            ir.read(ch);
            for (char c : ch)
                System.out.println(c + " ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
