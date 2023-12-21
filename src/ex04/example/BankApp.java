package ex04.example;

import ex04.example.model.Account;
import ex04.example.model.User;

public class BankApp {
    public static void main(String[] args) {
        // 1. create two users
        User kildong = new User(1111, "kildong", "kdHong@history.com");
        User geumseo = new User(2222, "geumseo", "gs25@arbitrary.com");
        User love = new User(3333, "love", "love@xa5.com");

        // 2. create two accounts
        Account kildongAccount = new Account(1111, 1000, 1);
        Account geumseoAccount = new Account(2222, 1000, 2);
        Account loveAccount = new Account(3333, 1000, 3);

        // 3. read information
        long amount = 100L;

        // 4. transfer
        BankService.transfer(kildongAccount, geumseoAccount, 100);
        BankService.transfer(geumseoAccount, loveAccount, 200);
        BankService.transfer(loveAccount, kildongAccount, 300);

        // 5. print the results
        System.out.println(kildongAccount);
        System.out.println(geumseoAccount);
        System.out.println(loveAccount);

        // 6. withdrawal
    }
}
