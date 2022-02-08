package feature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TransactionServiceShould {

    @Mock
    Statement statement;

    @BeforeEach
    void setUp(){
        this.statement = mock(Statement.class);
    }

    @Test
    void registers_a_deposit_transaction(){
        var transactionService = new TransactionService(statement);
        transactionService.deposit(100);
        verify(statement).add(100);
    }
}
