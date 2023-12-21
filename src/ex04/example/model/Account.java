package ex04.example.model;

public class Account {
    final int id; // 계좌 번호 (숫자 10자리로 만들어져있다, 앞으로 연산할 필요가 없다.)
    long balance;
    int userId;
    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
