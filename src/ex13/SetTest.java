package ex13;
// ex05
import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        // HashSet, 가장 우수한 성능, 원소간의 순서가 일정하지 않음
        HashSet<String> set1 = new HashSet<>();

        set1.add("Milk");
        set1.add("Bread");
        set1.add("Butter");
        set1.add("Cheese");
        set1.add("Ham");
        set1.add("Ham"); // 입력되지 않음
        System.out.println("set1 " + set1);
        if (set1.contains("Ham"))
            System.out.println("Ham도 포함되어 있음.");

        // LinkedHashSet, HashSet + LinkedList. HashSet의 단점을 극복한 Set
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Milk");
        set2.add("Bread");
        set2.add("Butter");
        set2.add("Cheese");
        set2.add("Ham");
        System.out.println("set2 " + set2);

        // TreeSet, 값에 따라 원소간 순서 결정. 느리다.
        TreeSet<String> set3 = new TreeSet<>();
        set3.add("Milk");
        set3.add("Bread");
        set3.add("Butter");
        set3.add("Cheese");
        set3.add("Ham");
        System.out.println("set3 " + set3);
    }
}
