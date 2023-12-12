package ex01;

public class VarEx01 {
    //모든 코드는 main 매서드 내부에 적는다.
    public static void main(String[] args) {
        int n1 = 1; // 21억까지 (4Byte)
        double d1 = 1.5; // (8Byte) 소수점자리수 308자리
        long big1 = 20000000000L; // 경까지 (8Byte) 정수표현범위를 넘어서면 숫자끝에 대문자 L을 기입.
        boolean b1 = false; // true, false중 하나만 저장 가능. (1Bit)
        char c1 = '가';
        String s1 = "가나다";

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(s1);
    } //자바 프로그램 종료
}
