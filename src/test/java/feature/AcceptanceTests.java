package feature;

import org.junit.jupiter.api.Test;

public class AcceptanceTests {

    @Test
    void account_prints_balance(){
        var account = new Account();
        account.deposit(500);
        account.withdraw(100);
        account.deposit(200);
        account.printStatement();

    }
}
