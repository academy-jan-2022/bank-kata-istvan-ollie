package feature;

public class TransactionService {

    public Integer deposit(Integer amount, Integer balance) {
        return balance + amount;
    }

    public Integer withdraw(Integer amount, Integer balance) {
        return balance - amount;
    }



}
