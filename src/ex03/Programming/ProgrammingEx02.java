package ex03.Programming;

import java.util.Scanner;

public class ProgrammingEx02 {
    static Scanner sc = new Scanner(System.in);
    static void Calculator(char input) {
        double num1, num2, result;
        if (input == '+') {
            System.out.print("input num: ");
            num1 = sc.nextDouble();
            System.out.print(num1 + " + ");
            num2 = sc.nextDouble();
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (input == '-') {
            System.out.print("input num: ");
            num1 = sc.nextDouble();
            System.out.print(num1 + " - ");
            num2 = sc.nextDouble();
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (input == '*') {
            System.out.print("input num: ");
            num1 = sc.nextDouble();
            System.out.print(num1 + " * ");
            num2 = sc.nextDouble();
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else if (input == '/') {
            System.out.print("input num: ");
            num1 = sc.nextDouble();
            System.out.print(num1 + " / ");
            num2 = sc.nextDouble();
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            } else
                System.out.println(num1 + " / " + num2 + " = undefined");
        } else
            System.out.println("ERROR : undeclared operator");
    }
    public static void main(String[] args) {
        char input;
        System.out.println("        (+, -, *, /)");
        System.out.print("input operator type : ");
        input = sc.next().charAt(0);
        ProgrammingEx02.Calculator(input);
    }
}
