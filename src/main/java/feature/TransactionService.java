package feature;

import java.util.Date;

public class TransactionService {
    private Statement statement;

    public TransactionService() {
        statement = new Statement();
    }

    public Integer deposit(Integer amount, Integer balance) {
        var newBalance = balance + amount;
        var transaction = new Transaction(new Date().toString(), newBalance);
        statement.recordTransaction(transaction);
        return newBalance;
    }

    public Integer withdraw(Integer amount, Integer balance) {
        return balance - amount;
    }

}
