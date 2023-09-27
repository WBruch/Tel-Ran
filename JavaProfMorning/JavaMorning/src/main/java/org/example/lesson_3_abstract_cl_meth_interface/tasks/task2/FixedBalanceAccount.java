package org.example.lesson_3_abstract_cl_meth_interface.tasks.task2;

public class FixedBalanceAccount extends Account implements Transferable {

    public FixedBalanceAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void transfer(Account destination, double amount) {
        if (this.getBalance() - amount < 0) {
            System.out.println("transfer unavailable");
        } else {
             destination.setBalance(destination.getBalance() + amount);
             this.setBalance(this.getBalance() - amount);
        }
    }
}
