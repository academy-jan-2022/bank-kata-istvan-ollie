package feature;

public class TransactionService {

    private final Statement statement;
    private final DateProvider dateProvider;

    public TransactionService(Statement statement, DateProvider dateProvider) {
        this.statement = statement;
        this.dateProvider = dateProvider;
    }

    public void add(Integer amount) {
        var transactionDate = dateProvider.UtcNow();
        var transaction = new Transaction(amount, transactionDate);
        statement.add(transaction);
    }

    public Statement getStatement(){
        return statement;
    }
}
