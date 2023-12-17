package ex03.test;

// 패턴 발견
public class SelectionTest04 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 2, 3, 9, 6, 8, 1};
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                min = (min < arr[j]) ? min : arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == min) {
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
