package feature;

public class TransactionService {

    private final Statement statement;

    public TransactionService(Statement statement) {
        this.statement = statement;
    }

    public void deposit(Integer amount) {
        statement.add(amount);
    }

    public void withdraw(Integer amount) {

    }
}
