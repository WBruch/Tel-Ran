package org.example.lesson_3_abstract_cl_meth_interface.tasks.task2;

public class Main {
    public static void main(String[] args) {
        FixedBalanceAccount fixedAccount = new FixedBalanceAccount("123456", 1000);
        CreditAccount creditAccount = new CreditAccount("789012", -500, 1000);

        fixedAccount.transfer(creditAccount, 500);
  //      creditAccount.transfer(fixedAccount, 1000);
        System.out.println("Fixed account balance: " + fixedAccount.getBalance());
        System.out.println("Credit account balance: " + creditAccount.getBalance());

//        creditAccount.transfer(fixedAccount, 500);
//        System.out.println("Fixed account balance: " + fixedAccount.getBalance());
//        System.out.println("Credit account balance: " + creditAccount.getBalance());
    }
}
