package ex04.example;

import ex04.example.model.Account;

// Manage transactions
public class BankService {
    public static void withdrawal(Account withdrawalAccount, long amount){
        if ( amount <= 0 ){
            System.out.println("you can't make a transaction with that value");
            return;
        }
        if (withdrawalAccount.ifNotEnoughBalance(amount)){
            System.out.println("You have not enough balance on your account.");
            return;
        }
        withdrawalAccount.withdrawal(amount);
    }

    public static void transfer(Account withdrawalAccount, Account depositAccount, long amount){
        if ( amount <= 0 ){
            System.out.println("you can't make a transaction with that value");
            return;
        }
        if (withdrawalAccount.ifNotEnoughBalance(amount)){
            System.out.println("You have not enough balance on your account.");
            return;
        }
        withdrawalAccount.withdrawal(amount);
        depositAccount.deposit(amount);
    }
}
