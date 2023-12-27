package ex08;

class Account extends Object{
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

public class ObEx01 {
    public static void main(String[] args) {
        Account account1 = new Account("홍길동", 1111, 1000);
        Account account2 = new Account("홍길동", 1111, 1000);
        System.out.println(account1);
//        = System.out.println(account1.toString());
        /*
        System.out.println(account1.getClass());
        System.out.println(account1.hashCode()); // 메모리를 검증하기 위해 쓰임
        */
        // 메모리 주소 비교
        if (account1 == account2) {
            System.out.println("같다");
        }
        // account1.equals()  // Object내 메소드
        // account1.toString().equals() // toStrings()내 메소드 (주소 비교 and 값 비교)
        if (account1.toString().equals(account2.toString())){
            System.out.println("같다");
        }
        String s1 = new String("물");
        String s2 = new String("물");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
