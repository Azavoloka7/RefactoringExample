package firstExample;

public class Main {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank();

        // Create accounts
        Account account11 = new Account("A101", 1000);
        Account account12 = new Account("A102",2000);
        Account account21 = new Account("A201", 3000);
        Account account22 = new Account("A202", 500);
        Account account31 = new Account("A301", 4000);
        Account account32 = new Account("A302", 500);
        Account account23 = new Account("A203", 50000);

        // Add accounts to the bank
        bank.addAccount(account11);
        bank.addAccount(account12);
        bank.addAccount(account21);
        bank.addAccount(account22);
        bank.addAccount(account31);
        bank.addAccount(account32);
        bank.addAccount(account23);

        // Create a customer
        Customer customer1 = new Customer("C1", "Victoria Demydovska");
        Customer customer2 = new Customer("C2", "Anatolii Zavoloka");
        Customer customer3 = new Customer("C3", "Robbie Williams");

        // Add the customer to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);

        // Add accounts to the customer
        customer1.addAccount(account11);
        customer1.addAccount(account12);
        customer2.addAccount(account21);
        customer2.addAccount(account22);
        customer2.addAccount(account23);
        
        customer3.addAccount(account31);
        customer3.addAccount(account32);
        
        
        account11.deposit(10000.00);
       
        System.out.println(bank);
        System.out.println(customer2.getName()+" "+ customer2.getAccounts());
        System.out.println(customer1.toString()+ customer1.getAccounts());

        
       
    }
}
