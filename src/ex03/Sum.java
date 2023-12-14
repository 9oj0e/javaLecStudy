package ex03;
//ex07

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0, j;
        int k = i;

        System.out.print("정수를 입력하시오: ");
        Scanner scan = new Scanner(System.in);
        j = scan.nextInt();
        for (i = 1; i <= j; i++)
            sum += i;

        System.out.println(k + "부터 " + j + "까지의 정수의 합 = " + sum);
    }
}
