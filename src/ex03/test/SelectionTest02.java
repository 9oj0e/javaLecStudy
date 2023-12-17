package ex03.test;

// 배열 내 최대 최소값을 찾아내는 알고리즘
public class SelectionTest02 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 3, 9, 6, 8, 7};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
            max = (max > arr[i]) ? max : arr[i];
        }
        System.out.println(min + " " + max);
    }
}
