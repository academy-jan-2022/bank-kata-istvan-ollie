package feature;

import java.util.ArrayList;
import java.util.Collections;

public class Statement {
    private final ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    private final String statementHeader = "Date || Amount || Balance";
    private final String statementFormatter = "%s || %s || %s";

    public void add(Transaction transaction) {
        transactions.add(transaction);
    }


    public String render() {
        var statementLines = new ArrayList<String>();
        var balance = 0;

        for (var transaction : transactions) {
            balance += transaction.amount();
            var statementLine = String.format(statementFormatter, transaction.transactionDate(), transaction.amount(), balance);
            statementLines.add(0, statementLine);
        }

        statementLines.add(0, statementHeader);
        return String.join("\n", statementLines);
    }
}
