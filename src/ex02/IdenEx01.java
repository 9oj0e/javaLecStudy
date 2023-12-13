package ex02;

/**
 * 변수 작성법.
 * 1. camel표기법을 사용
 *
 * 2. 숫자를 먼저 사용하지 않는다.
 * int 1stMoney;
 * 3. 특수문자는 사용하지 않는다.
 * int abc#;
 * double abc$$;
 */

/** 사용할 수 없는 식별자
 * KEYWORD는 변수로 선언할 수 없다.
 * package, public, class, etc..
 * underbar는 사용하지 않는다. = java개발자들간의 약속.
 * int abc__;
 * int user_money;
 */
public class IdenEx01 {
    public static void main(String[] args) {
        int userMoney; // camel표기법
        int method;
    }
}
