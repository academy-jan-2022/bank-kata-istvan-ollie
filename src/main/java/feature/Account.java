package feature;

public class Account implements AccountService {
    private final TransactionRepository transaction;
    private final UserInterface printer;

    public Account(TransactionRepository transaction, UserInterface printer) {
        this.transaction = transaction;
        this.printer = printer;
    }

    public void deposit(int amount) {
        transaction.add(amount);
    }

    public void withdraw(int amount) {
        transaction.add(-amount);
    }

    public void printStatement() {
        var statement = transaction.getStatement();
        var renderedStatement = statement.render();
        printer.printline(renderedStatement);
    }
}