package ex03.test;

// 배열내에서 다음 값을 KEY값으로 지정해주는 알고리즘
public class InsertionSort01 {
    public static void main(String[] args) {
        int arr[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int key;
        System.out.print("arr[0]: " + arr[0] + " ");
        System.out.println("length of arr: " + arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            key = arr[i + 1];
            System.out.printf("arr[%d]: %d, key: %d\n", i, arr[i], key);
        }
    }
}
