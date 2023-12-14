package ex03;
//ex10
import java.util.Scanner;

public class GetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, value = 0;

        while (value != -1){
            sum += value;
            System.out.print("input num: ");
            value = sc.nextInt();
        }
        System.out.println("sum = " + sum);
    }
}
