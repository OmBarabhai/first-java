package Three.abstraction;

public class abstractionDemo {
    public static void main(String[] args) {
        savingAccount savingAcc = new savingAccount();

        savingAcc.deposit(100);

        currentAccount currAcc = new currentAccount();
        currAcc.withdraw(300.80);
    }
}
