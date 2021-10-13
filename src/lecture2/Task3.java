package lecture2;

public class Task3 {
    public static void main(String[] args) {

        Task3Bank bank = new Task3Bank();
        bank.checkBalance();

        bank.deposit(500);
        bank.checkBalance();
        bank.withdraw(700);
        bank.checkBalance();
    }
}
