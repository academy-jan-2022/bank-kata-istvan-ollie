package feature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(MockitoJUnitRunner.class)
public class AccountShould {

        @Mock TransactionService transactionService;
        private Account account;

    @BeforeEach
        void setUp(){
            transactionService = Mockito.mock(TransactionService.class);
            this.account = new Account(transactionService);
        }

        @Test
        void invoke_transaction_service_when_depositing(){
            account.deposit(100);
            verify(transactionService, times(1)).deposit(100);
    }
}
