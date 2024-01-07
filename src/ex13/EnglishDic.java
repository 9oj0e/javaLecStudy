package ex13;
// lab

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDic {
    public static void main(String[] args) {
        Map<String, String> st = new HashMap<>();
        st.put("map", "지도");
        st.put("java", "자바");
        st.put("school", "학교");
        System.out.println("사전");

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("영어 단어를 입력하시오:");
            String key = sc.next();
            if (key.equals("quit")) break;
            System.out.println("단어의 의미는 " + st.get(key));
        } while (true);
    }
}
