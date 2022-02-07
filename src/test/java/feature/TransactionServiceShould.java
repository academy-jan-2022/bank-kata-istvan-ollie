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

	@Test
	void
	deposit_return_100_when_depositing_100() {
		var transactionService = new TransactionService();
		var result = transactionService.deposit(100, 0);

		assertEquals(100, result);
	}

	@Test
	void
	deposit_return_balance_plus_amount() {
		var transactionService = new TransactionService();
		var result = transactionService.deposit(100, 100);

		assertEquals(200, result);
	}

	@Test
	void
	withdraw_return_0_when_balance_and_amount_are_0() {
		var transactionService = new TransactionService();
		var result = transactionService.withdraw(0, 0);

		assertEquals(0, result);
	}

	@Test
	void
	withdraw_return_100_when_withdrawing_100_from_200() {
		var transactionService = new TransactionService();
		var result = transactionService.withdraw(100, 200);

		assertEquals(100, result);
	}

}
