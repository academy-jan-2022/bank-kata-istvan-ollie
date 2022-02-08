package feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Statement {
    private final ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public void add(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }


    public String render() {
        var outputSb = new StringBuilder();
        var balance = 0;

        outputSb.append("Date || Amount || Balance\n");

        for (var transaction : transactions) {
            balance += transaction.amount();
            outputSb.append(transaction.transactionDate() + " || " + transaction.amount() + " || " + balance);
        }

        return outputSb.toString();
    }
}
