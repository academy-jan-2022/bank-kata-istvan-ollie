package feature;

public class Account implements AccountService {
    private TransactionService transactionService;
    private UserInterface userInterface;
    private Integer balance;

    public Account(TransactionService transactionService, UserInterface userInterface) {
        this.transactionService = transactionService;
        this.userInterface = userInterface;
    }

    public void deposit(int amount) {
        transactionService.deposit(amount, balance);
    }

    public void withdraw(int amount) {
        transactionService.withdraw(amount, 0);
    }

    public void printStatement() {
        userInterface.printline("");
    }
}