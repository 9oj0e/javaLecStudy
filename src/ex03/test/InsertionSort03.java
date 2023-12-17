package ex03.test;

// KEY값을 정하고, key값보다 크면 뒤로 key값보다 작으면 현재 위치에 key값 입력
public class InsertionSort03 {
    public static void main(String[] args) {
        int arr[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int key;
        // turn 1
        key = arr[1]; // 1
        if (arr[0] > key) { // true
            arr[1] = arr[0]; // 1 9 8 2 7 3 6 4 5
        }
        arr[0] = key;

        // turn 2
        key = arr[2]; // 8
        if (arr[1] > key) { // true
            arr[2] = arr[1]; // 1 9 9 2 7 3 6 4 5
        }
        if (arr[0] > key) { // false
            arr[1] = arr[0]; // pass
        }
        arr[1] = key; // 1 8 9 2 7 3 6 4 5


        //turn 3
        key = arr[3]; // 2
        if (arr[2] > key) { // true
            arr[3] = arr[2]; // 1 8 9 9 7 3 6 4 5
        }
        if (arr[1] > key) { // true
            arr[2] = arr[1]; // 1 8 8 9 7 3 6 4 5
        }
        if (arr[0] > key) { // false
            arr[1] = arr[0]; // pass
        }
        arr[1] = key; // 1 2 8 9 7 3 6 4 5

        //turn 4
        key = arr[4]; // 7
        if (arr[3] > key) { // true
            arr[4] = arr[3]; // 1 2 8 9 9 3 6 4 5
        }
        if (arr[2] > key) { // true
            arr[3] = arr[2]; // 1 2 8 8 9 3 6 4 5
        }
        if (arr[1] > key) { // false
            arr[2] = arr[1];
        }
        arr[2] = key; // 1 2 7 8 9 3 6 4 5

        //turn 5
        key = arr[5]; // 3
        if (arr[4] > key) { // true
            arr[5] = arr[4]; // 1 2 7 8 9 9 6 4 5
        }
        if (arr[3] > key) { // true
            arr[4] = arr[3]; // 1 2 7 8 8 9 6 4 5
        }
        if (arr[2] > key) { // true
            arr[3] = arr[2]; // 1 2 7 7 8 9 6 4 5
        }
        if (arr[1] > key) { // false
            arr[2] = arr[1]; // pass
        }
        arr[2] = key; // 1 2 3 7 8 9 6 4 5
        // enough...

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
