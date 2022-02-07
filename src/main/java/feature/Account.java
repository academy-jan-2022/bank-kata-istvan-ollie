package feature;

public class Account implements AccountService {
    public Account(TransactionService transaction) {
    }

    public void deposit(int amount) {

    }

    public void withdraw(int amount) {
        throw new UnsupportedOperationException();
    }

    public void printStatement() {
        throw new UnsupportedOperationException();
    }
}