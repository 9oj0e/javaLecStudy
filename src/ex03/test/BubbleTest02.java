package ex03.test;
// 세번째 도전 4바퀴 돌고, 내부적으로 (4, 3, 2, 1) 바퀴 돌기
public class BubbleTest02 {
    public static void main(String[] args) {
        int [] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.println("몇바퀴?");
            }
            System.out.println();
        }
    }
}
