import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    /**
     * Constructor.
     * @param name name of owner
     * @param accountCategory type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        Bank.setTotalAccounts(Bank.getTotalAccounts() + 1);
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * Gets accountBalance.
     * @return returns accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * Sets accountBalance.
     * @param amount amount to set account balance to.
     */
    public void setAccountBalance(final double amount) {
        accountBalance = amount;
    }
    /**
     * Gets ownerName.
     * @return returns ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     * Sets ownerName.
     * @param name new account name.
     */
    public void setOwnerName(final String name) {
        ownerName = name;
    }
}