package ex14.example1;

import java.util.Arrays;
import java.util.List;

public class CopyEx02 { // 컬랙션 가공
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        /* map(Function), 가공자 */
        List<Integer> newList = list.stream().map((i) -> i*100).toList();

        /* foreach */
        for(Integer i : newList)
            System.out.println(i);

        /* foreach(Consumer) */
        newList.stream().forEach(i -> System.out.println(i));
    }
}
