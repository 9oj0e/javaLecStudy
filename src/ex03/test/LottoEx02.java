package ex03.test;

import java.util.Arrays;
import java.util.Random;

public class LottoEx02 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        int num;
        boolean isSame;

        for (int i = 0; i < 6; i++) {
            // 공 꺼내서 바로 추가
            if (i == 0) {
                num = r.nextInt(45) + 1;
                arr[i] = num;
                continue;
            }
            while (true) {
                // 1. 공을 꺼내기
                isSame = false;
                num = r.nextInt(45) + 1;
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] == num) { // 2. 이전 번호들과 비교
                        isSame = true;
                        break;
                    }
                }
                if (!isSame) { // 3. 동일한 번호가 없을때 값 추가하기
                    arr[i] = num;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}