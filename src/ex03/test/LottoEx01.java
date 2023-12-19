package ex03.test;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[6];
        int num;
        boolean isSame;

        for (int i = 0; i < 6; i++) {
            if ( i == 0 ){
                num = r.nextInt(45) + 1;
                arr[i] = num;
                continue;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
