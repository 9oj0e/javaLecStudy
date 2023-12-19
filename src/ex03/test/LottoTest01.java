package ex03.test;

import java.util.Arrays;
import java.util.Random;

public class LottoTest01 {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[6];
        int num;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) { // exceptional case
                num = r.nextInt(45) + 1;
                arr[i] = num;
            } else { // i = 1 ~ 5
                while (true) {
                    boolean dupCheck = false;
                    num = r.nextInt(45) + 1;
                    for (int j = 0; j <= i; j++) {
                        if (arr[j] == num)
                            dupCheck = true;
                    }
                    if (dupCheck != true) {
                        arr[i] = num;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    } // end of main
}
