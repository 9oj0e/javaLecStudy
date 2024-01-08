package ex15;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        InputStream input = System.in; // keyboard
        try {
            int value = input.read();
            System.out.println("받은 값 " + value); // 한계. 아무리 많이 쳐도, 한 글자만 인식한다.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
