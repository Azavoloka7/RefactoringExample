package firstExample;

public class TransactionProcessor {
    public static void processTransaction(Account account, Transaction transaction) {
        String description = transaction.getDescription();
        double amount = transaction.getAmount();

        if (description.equals("Deposit")) {
            account.deposit(amount);
        } else if (description.equals("Withdrawal")) {
            account.withdraw(amount);
        }
    }
}
