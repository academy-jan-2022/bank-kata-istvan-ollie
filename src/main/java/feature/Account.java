package feature;

public class Account implements AccountService {
    private TransactionService transaction;
    private UserInterface userInterface;

    public Account(TransactionService transaction, UserInterface userInterface) {
        this.transaction = transaction;
        this.userInterface = userInterface;
    }

    public void deposit(int amount) {
        transaction.deposit(amount, 0);
    }

    public void withdraw(int amount) {
        transaction.withdraw(amount, 0);
    }

    public void printStatement() {
        userInterface.printline("");
    }
}