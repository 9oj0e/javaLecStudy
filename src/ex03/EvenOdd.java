package ex03;
//ex01
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("정수를 입력하시오: ");
            int number = sc.nextInt();
            if (number == 99){
                break;
            }

            if (number % 2 == 0) //
                System.out.println("입력된 정수는 짝수.");
            else
                System.out.println("입력된 정수는 홀수.");
        }
    }
}
