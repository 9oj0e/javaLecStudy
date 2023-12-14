package ex03;
//ex08
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        int n;

        System.out.print("input num: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for (int i = 1; i <= n; i++)
            fact = fact * i;

        System.out.printf("%d! = %d", n, fact);
    }
}
