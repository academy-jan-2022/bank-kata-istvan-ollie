package feature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AccountShould {

        @Mock
        TransactionRepository transactionRepository;
        @Mock UserInterface userInterface;
        private Account account;

    @BeforeEach
    void setUp(){
        transactionRepository = mock(TransactionRepository.class);
        userInterface = mock(UserInterface.class);
        this.account = new Account(transactionRepository, userInterface);
    }


    @Test
    void invoke_transaction_service_when_depositing() {
        account.deposit(100);
        verify(transactionRepository, times(1)).add(100);
    }

    @Test
        void invoke_transaction_service_when_withdrawing(){
            account.withdraw(100);
            verify(transactionRepository, times(1)).add(-100);
    }

    @Test
    void invoke_printing_service_when_calling_method(){
        when(transactionRepository.getStatement()).thenReturn(new Statement());
        account.printStatement();
        verify(userInterface, times(1)).printline(anyString());
    }

}
