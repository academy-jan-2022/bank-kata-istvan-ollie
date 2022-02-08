package feature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TransactionServiceShould {

    @Mock
    Statement statement;
    private DateProvider dateProvider;

    @BeforeEach
    void setUp(){
        this.statement = mock(Statement.class);
        this.dateProvider = mock(DateProvider.class);
    }

    @Test
    void registers_a_deposit_transaction(){
        var expectedDate = new Date();
        when(dateProvider.UtcNow()).thenReturn(expectedDate);
        var transactionService = new TransactionService(statement, dateProvider);
        transactionService.deposit(100);
        var expectedTransaction = new Transaction(100, expectedDate);
        verify(statement).add(expectedTransaction);
    }

    @Test
    void registers_a_withdraw_transaction(){
        var expectedDate = new Date();
        when(dateProvider.UtcNow()).thenReturn(expectedDate);
        var transactionService = new TransactionService(statement, dateProvider);
        transactionService.withdraw(100);
        var expectedTransaction = new Transaction(-100, expectedDate);
        verify(statement).add(expectedTransaction);
    }
}
