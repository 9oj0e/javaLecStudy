package ex03.test;

// refactoring
// reference to https://gmlwjd9405.github.io/2018/05/06/algorithm-insertion-sort.html
public class InsertionSort05 {
    static void SelectionSort(int arr[]) {
        int i, j, key;
        int n = arr.length;
        for (i = 1; i < n; i++) {
            key = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int arr2[] = {9, 7, 8, 6, 5, 2, 4, 3, 1};
        int arr3[] = {323, 43, 243, 43, 23, 12, 34, 55};
        InsertionSort05.SelectionSort(arr1);
        InsertionSort05.SelectionSort(arr2);
        InsertionSort05.SelectionSort(arr3);
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
        System.out.println();
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
        System.out.println();
        for (int i = 0; i < arr3.length; i++)
            System.out.print(arr3[i] + " ");
    }
}
