package feature;

public class Account implements AccountService {
    private TransactionService transaction;

    public Account(TransactionService transaction) {
        this.transaction = transaction;
    }

    public void deposit(int amount) {
        transaction.deposit(amount);
    }

    public void withdraw(int amount) {
        throw new UnsupportedOperationException();
    }

    public void printStatement() {
        throw new UnsupportedOperationException();
    }
}