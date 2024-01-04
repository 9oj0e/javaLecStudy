package ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList(); // 문법적인 선언 방식
        arr1.add(1);
        arr1.add(2);

        List<Integer> arr2 = Arrays.asList(1, 2); // 주로 쓰는 방식. 선언과 동시에 추가.
        // + 부모 클래스 List로 선언.
    }
}
