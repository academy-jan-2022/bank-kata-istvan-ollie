package feature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionServiceShould {

	@Test
	void
	deposit_return_0_when_balance_and_amount_are_0() {
		var transactionService = new TransactionService();
		var result = transactionService.deposit(0, 0);

		assertEquals(0, result);
	}
}
