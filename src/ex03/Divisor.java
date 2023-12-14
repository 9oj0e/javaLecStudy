package ex03;
//ex09
import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("양의 정수를 입력하시오: ");
        int n = scan.nextInt();

        System.out.println(n + "의 약수는 다음과 같습니다.");
        for (int i = 1; i <= n; ++i){
            if (n % i == 0 ) // 약수 = 정수 n과 나누어서 나머지가 0인 것들
                System.out.print(" " + i);
        }
    }
}
