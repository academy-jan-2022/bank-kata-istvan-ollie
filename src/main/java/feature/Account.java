package feature;

public class Account implements AccountService {
    private final TransactionService transaction;
    private final UserInterface printer;

    public Account(TransactionService transaction, UserInterface printer) {
        this.transaction = transaction;
        this.printer = printer;
    }

    public void deposit(int amount) {
        transaction.deposit(amount);
    }

    public void withdraw(int amount) {
        transaction.withdraw(amount);
    }

    public void printStatement() {
        var statement = transaction.getStatement();
        var renderedStatement = statement.render();
        printer.printline(renderedStatement);
    }
}