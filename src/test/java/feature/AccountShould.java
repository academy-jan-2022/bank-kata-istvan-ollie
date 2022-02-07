package feature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class AccountShould {

        @Mock
        TransactionService transactionService;
        @Mock UserInterface userInterface;
        private Account account;

    @BeforeEach
    void setUp(){
        transactionService = Mockito.mock(TransactionService.class);
        userInterface = Mockito.mock(UserInterface.class);
        this.account = new Account(transactionService, userInterface);
    }


    @Test
    void invoke_transaction_service_when_depositing() {
        account.deposit(100);
        verify(transactionService, times(1)).deposit(100, 0);
    }

    @Test
        void invoke_transaction_service_when_withdrawing(){
            account.withdraw(100);
            verify(transactionService, times(1)).withdraw(100, 0);
    }

    @Test
    void invoke_UI_when_printing(){
        account.printStatement();
        verify(userInterface, times(1)).printline(anyString());
    }

}
