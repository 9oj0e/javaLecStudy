package ex04;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        int a, b;
        System.out.print("input num 1: ");
        a = sc.nextInt();
        System.out.print("input num 2: ");
        b = sc.nextInt();

        int resultAdd = cal.add(a,b);
        int resultMinus = cal.minus(a,b);
        int resultDivide = cal.divide(a,b);
        int resultRemain = cal.remain(a, b);
        int resultMulti = cal.multi(a,b);
        int resultPower = cal.power(a,b);

        //System.out.println(cal.add(50, 80));
        System.out.println(a + " add " + b + " eqauls " + resultAdd);
        System.out.println(a + " minus " + b + " eqauls " + resultMinus);
        System.out.println(a + " divide by " + b + " share: " + resultDivide + " remainder: " + resultRemain);
        System.out.println(a + " times " + b + " equals " + resultMulti);
        System.out.println(a + " power of " + b + " equals " + resultPower);
    }
}
