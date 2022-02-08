package feature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class AcceptanceTests {

    @Mock UserInterface mockUI;
    private Account account;

    @BeforeEach
    void setUp() {
        this.account = new Account(new TransactionService(new Statement(), new SimpleDateProvider()),
                new UserInterface());
        mockUI = mock(UserInterface.class);

    }

    @Test
    void account_prints_balance(){

        account.deposit(1000);
        account.withdraw(2000);
        account.deposit(500);
        account.printStatement();

        verify(mockUI).printline(
                "Date || Amount || Balance\n" +
                "14/01/2012 || -500 || 2500\n" +
                "13/01/2012 || 2000 || 3000\n" +
                "10/01/2012 || 1000 || 1000"
        );

    }
}
