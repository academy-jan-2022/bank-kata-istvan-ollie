package feature;

import java.util.List;

public class Statement {

	public List<Transaction> transactionServices;

	public void recordTransaction(Transaction transaction) {
		transactionServices.add(transaction);
	}
}
