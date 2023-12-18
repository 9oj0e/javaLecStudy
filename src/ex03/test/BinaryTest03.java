package ex03.test;

import java.util.Scanner;

public class BinaryTest03 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        // 16 / 2*2*2*2 -> logn -> log16
        int N = arr.length;
        Scanner sc = new Scanner(System.in);
        int start, mid, end, target;
        System.out.print("input target num: ");
        target = sc.nextInt();
        int count = 0;
        start = 0;
        end = N - 1; // 8
        while (true) {
            mid = start + ((end - start) / 2);
            if (target == arr[mid]){
                target = arr[mid];
                System.out.printf("target is located at arr[%d], attempts: %d", mid, count);
                break;
            }
            if (target > arr[mid]){
                start = mid + 1;
            }
            else
                end = mid - 1;
            count++;
        }
        System.out.println("시간복잡도 : " + (Math.log(N) / Math.log(2)));
    }
}
