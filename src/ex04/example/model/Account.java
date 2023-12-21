package ex04.example.model;

public class Account {
    private final int id;
    private long balance;
    private int userId;

    public boolean ifNotEnoughBalance(long amount){ // use 'if' to sort out exceptional case
        if (balance < amount){ // such if clauses are called, 'validation' clauses.
            return true;
        }
        return false;
    }

    public void withdrawal(long amount) { // method only execute
        this.balance = this.balance - amount;
    }
    public void deposit(long amount) {
        this.balance = this.balance + amount;
    }

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
