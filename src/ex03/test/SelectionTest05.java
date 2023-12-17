package ex03.test;

// refactoring
// reference to https://gmlwjd9405.github.io/2018/05/06/algorithm-selection-sort.html
public class SelectionTest05 {
    static void SelecSort(int[] arr) {
        int min, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            if (i != min) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            /* print process
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
             */
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 2, 3, 9, 6, 8, 1};
        SelectionTest05.SelecSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
