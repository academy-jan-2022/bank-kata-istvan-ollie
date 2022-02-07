package feature;

public class TransactionService {

    public Integer deposit(Integer amount, Integer balance) {
        var newBalance = balance + amount;
        return newBalance;
    }

    public Integer withdraw(Integer amount, Integer balance) {
        return balance - amount;
    }

}
