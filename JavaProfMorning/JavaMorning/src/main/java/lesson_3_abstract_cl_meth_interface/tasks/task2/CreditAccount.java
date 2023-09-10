package lesson_3_abstract_cl_meth_interface.tasks.task2;

public class CreditAccount extends Account implements Transferable {

    private double credit;

    public CreditAccount(String name, double credit, double balance) {
        super(name, balance);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public void transfer(Account destination, double amount) {
        if (this.getBalance() - amount < 0 && this.getBalance() + Math.abs(this.getCredit()) > amount) {
            destination.setBalance(destination.getBalance() + amount);
            this.setBalance(this.getBalance() - amount);
        } else if (this.getBalance() - amount < 0 && this.getBalance() + Math.abs(this.getCredit()) < amount) {
            System.out.println("transfer unavailable");
        } else {
            destination.setBalance(destination.getBalance() + amount);
            this.setBalance(this.getBalance() - amount);
        }
    }
}
