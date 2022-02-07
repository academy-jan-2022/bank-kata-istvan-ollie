package feature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionServiceShould {

	@Mock
	Statement statement;

	@BeforeEach
	void setUp(){
		this.statement = Mockito.mock(Statement.class);
	}

	@ParameterizedTest
	@MethodSource("deposit_once_cases")
	void
	deposit_single_amounts(Integer amount, Integer balance, Integer expected) {
		var transactionService = new TransactionService();
		var result = transactionService.deposit(amount, balance);

		assertEquals(expected, result);
	}

	@ParameterizedTest
	@MethodSource("withdraw_once_cases")
	void
	withdraw_single_amounts(Integer amount, Integer balance, Integer expected) {
		var transactionService = new TransactionService();
		var result = transactionService.withdraw(amount, balance);

		assertEquals(expected, result);
	}

	private static Stream<Arguments> deposit_once_cases(){
		return Stream.of(
				Arguments.of(0, 0, 0),
				Arguments.of(100, 0, 100),
				Arguments.of(100, 100, 200)
		);
	}

	private static Stream<Arguments> withdraw_once_cases(){
		return Stream.of(
				Arguments.of(0, 0, 0),
				Arguments.of(100, 200, 100)
		);
	}


}
