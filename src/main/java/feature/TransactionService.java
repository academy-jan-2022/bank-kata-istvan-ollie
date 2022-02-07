package feature;

public class TransactionService {

    public Integer deposit(Integer amount, Integer balance) {
        return amount + balance;
    }

    public Integer withdraw(Integer amount, Integer balance) {
        return 0;
    }



}
