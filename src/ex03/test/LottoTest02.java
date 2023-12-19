package ex03.test;

import java.util.Arrays;
import java.util.Random;

public class LottoTest02 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        int num;
        boolean d;
        int i = 0;
        do{
            d = false;
            num = r.nextInt(45) + 1;
            if(i == 0){
                arr[i] = num;
            } else {
                for (int j = 0; j <= i; j++) {
                    if (arr[j] == num)
                        d = true;
                }
            }
            if (d != true) {
                arr[i] = num;
                i++;
            }
        }while(i<6);
        System.out.println(Arrays.toString(arr));
    } // end of main
}
