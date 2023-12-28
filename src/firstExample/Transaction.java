package firstExample;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private LocalDateTime timestamp;
    private String description;
    private double amount;

    public Transaction(String transactionId, String description, double amount) {
        this.transactionId = transactionId;
        this.timestamp = LocalDateTime.now();
        this.description = description;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}
