package ex02;

import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sel;
        double temp, f_temp, c_temp;
        System.out.println("==============");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("==============");
        System.out.println();
        System.out.print("번호를 선택하시오: ");
        sel = sc.nextInt();
        switch (sel) {
            case 1:
                System.out.print("화씨 온도를 입력하세요: ");
                temp = sc.nextDouble();
                f_temp = (temp - 32) * 5.0 / 9.0;
                System.out.println(temp + "'C는 " + f_temp + "'F 입니다.");
                break;
            case 2:
                System.out.print("섭씨 온도를 입력하세요: ");
                temp = sc.nextDouble();
                c_temp = temp * 9.0 / 5.0 + 32;
                System.out.println(temp + "'F는 " + c_temp + "'C 입니다.");
                break;
            default:
                System.out.println("알 수 없는 명령어. 시스템 종료");
                break;
        }
    }
}
