package ex03.test;

// 현재 값에서 첫번째 값까지 역행하는 알고리즘
public class InsertionSort02 {
    public static void main(String[] args) {
        int arr[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        for (int i = 1; i < arr.length - 1; i++) {
            System.out.print("i:" + i + " ");
            for (int j = i - 1; j >= 0; j--) {
                System.out.print("j:" + j + " ");
            }
            System.out.println();
        }
    }
}
