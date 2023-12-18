package ex03.test;

public class BinaryTest01 {
    public static void main(String[] args) {
        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // target 8

        // start = 0 ~ end = 8
        // mid = N/2 = 4 -> arr[4] = 5 (N = index)
        // if (target == mid)
        // target = mid;
        // if (target>mid) 참

        // start = 5 (mid+1) ~ end = 8 = { 6, 7, 8, 9 };
        // mid = arr[7]
        // if (target == mid)
        // target = mid;

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
