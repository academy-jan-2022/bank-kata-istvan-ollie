package feature;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class StatementShould {


	@Test
	void return_statement_header_when_no_transactions(){
		var statement = new Statement();
		var result = statement.render();
		var expected = "Date || Amount || Balance\n";

		assertEquals(expected, result);

	}

	@Test
	void return_statement_containing_1_transaction(){
		var statement = new Statement();
		var expectedDate =  new Date().toString();
		statement.add(new Transaction(100, expectedDate));
		var result = statement.render();

		var expected = "Date || Amount || Balance\n" +
				expectedDate + " || " + "100" + " || " + "100";

		assertEquals(expected, result);

	}

}
