package ex03;
// bubble sort
public class BubbleEx01 {
    // define method
    static void bubble(int[] arr){
        final int N = arr.length;
        int temp;

        for (int loop = 1; loop < N; loop++) {
            for (int i = 0; i < (N - loop); i++) {
                if(arr[i] > arr[i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        // output
        for (int i = 0; i < N; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        int[] arr1 = {5, 8, 2, 4, 3};
        BubbleEx01.bubble(arr1); // use method 'bubble' in 'BubbleEx01'
        System.out.println();

        int[] arr2 = {5, 8, 2, 4, 3, 10, 9, 7, 6};
        BubbleEx01.bubble(arr2);
    }
}
