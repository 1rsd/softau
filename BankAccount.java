package Task1SoftkaU;
/**
 * Task week 1 Sofka U
 * Class 3: Bank Account
 */
public class BankAccount {
    private int accountNumber; //Number of bank account
    public double wage; //wage in the bank account
    protected boolean activated; //Status from this bank account
    public BankAccount(int accountNumber, double wage, boolean activated) {
         /**
         * This is the constructor for the object fruit. It incomes the variables from various types as int, double
         * and boolean
         */
        setAccountNumber(accountNumber);
        this.wage = wage;
        setActivated(activated);
    }
    /**
     * In this section we've the set and get methods. It's necessary for asign and obtain the information
     * from this variables
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public boolean getActivated() {
        return activated;
    }
    public void setActivated(boolean activated) {
        this.activated=activated;
    }
    //main method
    public static void main(String[] args) {
        BankAccount b= new BankAccount(500, 50000d, true);
        System.out.println("Account number: "+b.getAccountNumber());
        System.out.println("Wage Account: $"+b.wage);
        System.out.println("Status: "+b.getActivated());

    }
}
