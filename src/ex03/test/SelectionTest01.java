package ex03.test;

// 작은 수를 구하는 알고리즘
public class SelectionTest01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int LowNum = (num1 < num2) ? num1 : num2;
        System.out.println(LowNum);
    }
}
