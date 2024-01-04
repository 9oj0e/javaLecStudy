package ex13;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {

        Vector<String> vec = new Vector<>(2);

        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        // 크기
        System.out.println(vec.size());

        // 인덱스 접근
        System.out.println(vec.get(0));
        System.out.println(vec.get(1));
        System.out.println(vec.get(2));

        // 정렬 (오름차순)
        Collections.sort(vec);

        for (String s : vec)
            System.out.print(s + " ");
        System.out.println();

        // 정렬 (내림차순)
        Collections.sort(vec, Collections.reverseOrder());

        for (String s : vec)
            System.out.print(s + " ");
        System.out.println();

        // 정렬 다른 방법
//        Arrays.sort();

        // 삭제
        String result = vec.remove(2);
        System.out.println(result);
        System.out.println(vec.size());

        // 값 찾기
        boolean search = vec.contains("mango");
        System.out.println(search);

        // 값 찾기 { mango, Mango, mAngo, maNgo, MANGO } 다 찾을 수 있는 건 없나..?
        String a = "Mango";
        boolean check = a.equalsIgnoreCase("mAngo");
        System.out.println(check);
    }
}