package feature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StatementShould {

	@Test
	void returns_an_empty_list_of_transactions(){
		var statement = new Statement();
		var result = statement.getTransactions();
		var expected = new ArrayList<Transaction>(List.of());

		Assertions.assertEquals(expected, result);
	}

}
