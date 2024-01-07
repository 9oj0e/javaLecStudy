package ex14;
// ex02

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kim", "Park", "Lee", "Choi", "Chee");

        List<String> sublist = list.stream() // stream source
                .filter(s -> s.startsWith("C")) // operation #1
                .sorted() // operation #2
                .collect(Collectors.toList()); // terminal operation
        System.out.println(sublist);
    }
}
