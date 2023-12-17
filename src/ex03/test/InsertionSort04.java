package ex03.test;

// 패턴 발견
public class InsertionSort04 {
    public static void main(String[] args) {
        int arr[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int key, j;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                } else
                    break;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
