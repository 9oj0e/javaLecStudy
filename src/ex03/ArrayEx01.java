package ex03;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 4byte * 3 = 12byte, 16 - 1?

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
//        arr[3] = 4;
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}
