package ex14.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyEx01 { // 컬렉션 복사
    public static void main(String[] args) {
        /*
        var list = Arrays.asList(1, 2, 3, 4);
        list.add(5); // 불가능, Arrays.asList는 불변성을 지닌다.
        */
        /*
        Object list = Arrays.asList(1, 2, 3, 4); //  Object타입 = downcasting 강제
        */
        var list = new ArrayList<>();
        // var = 값이 들어올 때 자료형 결정 = generic과 유사,
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        /* 원시적인 컬렉션 복사 방법
        var newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i));
        }
        */

        /* 컬렉션 복사 1 */
        System.out.println("Integer형 list -> newList에 복사");
        var newList = new ArrayList<>(list);
        System.out.println(
                "list hashCode: " + list.hashCode() + ", newList hashCode: " + newList.hashCode()
        );
        System.out.println();

        newList.add(5);
        System.out.println("newList에 값(5) 추가");
        System.out.println(
                "list hashCode: " + list.hashCode() + ", newList hashCode: " + newList.hashCode()
        );
        System.out.println();

        /* 컬랙션 복사 2 */
        System.out.println("Integer형 newList1, String형 newList2 생성");
        var newList1 = list.stream().map(i -> i).toList(); // Integer -> Integer
        var newList2 = list.stream().map(i -> i+"").toList(); // Integer -> String
        System.out.println(
                "newList1 hashCode: " + newList1.hashCode() + ", newList2 hashCode: " + newList2.hashCode()
        );

    }
}
