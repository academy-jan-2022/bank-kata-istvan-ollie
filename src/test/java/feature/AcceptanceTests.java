package feature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AcceptanceTests {

    @Mock UserInterface mockUI;
    private Account account;
    private SimpleDateProvider mockDate;

    @BeforeEach
    void setUp() {
        mockUI = mock(UserInterface.class);
        mockDate = mock(SimpleDateProvider.class);
        this.account = new Account(new TransactionRepository(new Statement(), mockDate),
                mockUI);

    }

    @Test
    void account_prints_balance(){
        when(mockDate.UtcNow()).thenReturn("10/01/2012", "13/01/2012", "14/01/2012");
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);
        account.printStatement();

        verify(mockUI).printline(
                "Date || Amount || Balance\n" +
                "14/01/2012 || -500 || 2500\n" +
                "13/01/2012 || 2000 || 3000\n" +
                "10/01/2012 || 1000 || 1000"
        );

    }

    // hopefully cant push
}
