package ex02;

public class CastEx01 {
    public static void main(String[] args) {
        int n1 = 1;
        double d1 = 1.5;

        n1 = 2;
        d1 = n1; // upcasting (묵시적 형변환)
        System.out.println(d1);

        n1 = (int) d1; // downcasting (강제 형변환)
        System.out.println(n1);
    }
}
