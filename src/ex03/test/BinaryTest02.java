package ex03.test;

public class BinaryTest02 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int N = arr.length;
        int start, mid, end, target;
        int count = 0;
        start = 0;
        end = N - 1; // 8
        target = 3;

        // 1회전
        count++;
        mid = start + ((end - start) / 2); // 0 + ((8-0)/2) = 4
        if (target == arr[mid]){
            target = arr[mid];
            System.out.println("target is located at arr[" + mid + "] attempts: " + count);
        }
        if (target > arr[mid]){
            // start = 5 ~ end = 8. { 6, 7, 8, 9 }
            // mid = 6
            start = mid + 1; // 5
        }
        else {
            end = mid - 1; // 4
        }
        // 2회전
        count++;
        mid = start + ((end - start) / 2); // 5 + ((8-5)/2) 6.5 -> 6 -> 7
        // {
        if (target == arr[mid]) {
            target = arr[mid];
            System.out.println("target is located at arr[" + mid + "] attempts: " + count);
        }
        if (target > arr[mid]){
            start = mid + 1; // 7
        } else{
            end = mid - 1;
        }
        // 3회전
        count++;
        mid = start + ((end - start) / 2); // 7 + ((8-7)/2) = 7
        if (target == arr[mid]) { // 7
            target = arr[mid];
            System.out.println("target is located at arr[" + mid + "] attempts: " + count);
        }
        if (target > arr[mid]){
            start = mid + 1;
        } else{
            end = mid - 1;
        }
        // 4회전
        count++;
        mid = start + ((end - start) / 2); // 8 + ((8-8)/2) = 8
        if (target == arr[mid]) { // 9
            target = arr[mid];
            System.out.println("target is located at arr[" + mid + "] attempts: " + count);
        }
        if (target > arr[mid]){
            start = mid + 1;
        } else{
            end = mid - 1;
        }

        // target 3

        // start = 0 ~ end = 8
        // mid = N/2 = 4 -> arr[4] = 5 (N = index)
        // if (target == mid)
        // target = mid;
        // if (target>mid) 참
        
        // start = 0 ~ end = 3 (mid-1) = { 1, 2, 3, 4 };
        // mid = arr[7]
        // if (target == mid)
        // target = mid;
    }
}
