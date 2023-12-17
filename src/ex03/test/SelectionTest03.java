package ex03.test;

// 구해진 최소값과 첫번째 열의 값을 바꾸는 알고리즘
public class SelectionTest03 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 2, 3, 9, 6, 8, 1};
        int min;
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
        }
        arr[8] = arr[0];
        arr[0] = min;
        // {1, 7, 4, 2, 3, 9, 6, 8, 5}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        min = arr[1];
        for (int i = 1; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
        }
        arr[3] = arr[1];
        arr[1] = min;
        // {1, 2, 4, 7, 3, 9, 6, 8, 5}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        min = arr[2];
        for (int i = 2; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
        }
        arr[4] = arr[2];
        arr[2] = min;
        // {1, 2, 3, 7, 4, 9, 6, 8, 5}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        min = arr[3];
        for (int i = 3; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
        }
        arr[4] = arr[3];
        arr[3] = min;
        // {1, 2, 3, 4, 7, 9, 6, 8, 5}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        min = arr[4];
        for (int i = 4; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
        }
        arr[8] = arr[4];
        arr[4] = min;
        // {1, 2, 3, 4, 5, 9, 6, 8, 7}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        min = arr[5];
        for (int i = 5; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
        }
        arr[6] = arr[5];
        arr[5] = min;
        // {1, 2, 3, 4, 5, 6, 9, 8, 7}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        min = arr[6];
        for (int i = 6; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
        }
        arr[8] = arr[6];
        arr[6] = min;
        // {1, 2, 3, 4, 5, 6, 7, 8, 9}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        min = arr[7];
        for (int i = 7; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
        }
        // {1, 2, 3, 4, 5, 6, 7, 8, 9}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
