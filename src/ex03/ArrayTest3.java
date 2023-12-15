package ex03;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] scores = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < scores.length; i++) // 모든 배열은 기본적으로 length라는 필드를 가지고 있다.
            System.out.print(scores[i]+ " "); // length는 배열의 크기를 나타낸다.
    }
}
