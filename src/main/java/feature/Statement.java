package feature;

import java.util.ArrayList;

public class Statement {
    private final ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    private final String statementHeader = "Date || Amount || Balance\n";

    public void add(Transaction transaction) {
        transactions.add(transaction);
    }


    public String render() {
        var outputSb = new StringBuilder();
        outputSb.append(statementHeader);

        var balance = 0;
        for (var transaction : transactions) {
            balance += transaction.amount();
            outputSb.append(transaction.transactionDate() + " || " + transaction.amount() + " || " + balance);
        }

        return outputSb.toString();
    }
}
