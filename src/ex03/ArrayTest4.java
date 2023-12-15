package ex03;
//for-each
public class ArrayTest4 {
    public static void main(String[] args) {
        int [] numbers = { 10, 20, 30 };
        for (int value : numbers) // int value에 numbers의 요소들을 첫번째부터 마지막까지 차례대로 대입해줌.
            System.out.print(value + " ");
    }
}
