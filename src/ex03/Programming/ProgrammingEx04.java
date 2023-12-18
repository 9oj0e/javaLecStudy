package ex03.Programming;

import java.util.Scanner;

// print sum of multiples of 3 and 4 between 1 and a number, a number is input.
public class ProgrammingEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max;
        System.out.println("set range from 0 to NUM");
        System.out.print("input NUM: ");
        max = sc.nextInt();
        for (int i = 1; i < max + 1; i++) {
            if (i % 3 == 0 || i % 4 == 0)
                sum += i;
        }
        System.out.println("sum of multiples of 3 and 4: " + sum);
    }
}
