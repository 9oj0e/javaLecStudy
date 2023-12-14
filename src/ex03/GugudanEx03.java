package ex03;

import java.util.Scanner;

public class GugudanEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num: ");
        int n = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.print(n + "*" + i + "=" + (n * i) + "\t");
        }
    }
}
