package Three.abstraction;

public class currentAccount extends BankAccount{
    @Override
    public void deposit(double amount){
        System.out.println("Deposited in Current Account");
    }
    public void withdraw(double amount){
        System.out.println("Withdraw from Current Account");
    }

}
