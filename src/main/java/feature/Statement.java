package feature;

import java.util.ArrayList;
import java.util.Collections;

public class Statement {
    private final ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    private final String statementHeader = "Date || Amount || Balance\n";

    public void add(Transaction transaction) {
        transactions.add(transaction);
    }


    public String render() {
        var outputSb = new StringBuilder();
        outputSb.append(statementHeader);
        var newStatementList = new ArrayList<String>();
        var balance = 0;

        for (int i = 0; i<transactions.size(); i++) {
            var transaction = transactions.get(i);
            balance += transaction.amount();
            newStatementList.add(transaction.transactionDate() + " || " + transaction.amount() + " || " + balance
                    );
        }
        Collections.reverse(newStatementList);

        outputSb.append(String.join("\n", newStatementList));

        return outputSb.toString();
    }
}
