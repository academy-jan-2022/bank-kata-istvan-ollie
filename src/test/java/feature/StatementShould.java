package feature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatementShould {

	@Test
	void returns_an_empty_list_of_transactions(){
		var statement = new Statement();
		var result = statement.getTransactions();
		var expected = new ArrayList<Transaction>(List.of());

		Assertions.assertEquals(expected, result);
	}

	@Test
	void returns_a_list_of_1_when_recording_1_transaction(){
		var statement = new Statement();
		var transaction = new Transaction(100, new Date());
		var expected = new ArrayList<Transaction>(List.of(transaction));
		statement.add(transaction);
		var result = statement.getTransactions();

		Assertions.assertEquals(expected, result);
	}

}
