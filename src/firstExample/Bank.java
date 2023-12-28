package firstExample;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Customer> customers;
    private Map<String, Account> accounts;

    public Bank() {
        this.customers = new HashMap<>();
        this.accounts = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountId(), account);
    }

    public Customer getCustomerById(String customerId) {
        return customers.get(customerId);
    }

    public Account getAccountById(String accountId) {
        return accounts.get(accountId);
    }
}
