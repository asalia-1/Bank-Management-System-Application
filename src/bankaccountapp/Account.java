
package bankaccountapp;

public abstract class Account implements IRate {
    // List of common properties for checkings and savings accounts
    private String name;
    private String SSN;
    private double balance;
    
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;
    
    // Constructor to set base properties and initialize account
    public Account(String name, String SSN, double initDeposit){
        this.name = name;
        this.SSN = SSN;
        balance = initDeposit;
        
        index++;
        this.accountNumber = setAccountNumber();
        
        setRate();
    }
    
    
    // List common methods
    
    // an abstract method that ensures that all subclasses create a setRate method
    public abstract void setRate();
    
    // Generates last 11 digits of the account number
    private String setAccountNumber() {
        String SSNLastTwo = SSN.substring(SSN.length()-2, SSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10, 3));
        
        return SSNLastTwo + uniqueID + randomNumber;
    }
    
    // Calculates the interest that results from the base rate and updates balance
    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued interest: $" + accruedInterest);
        printBalance();
    }
    // increases the value of balance to account for deposit
    public void deposit(double amount){
        balance += amount;
        System.out.println("Depositing $" + amount + "....");
        printBalance();
    }
    // decreases the value of balance to account for amount withdrawal
    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawing $" + amount + "....");
        printBalance();
    }
    // decreases amount in account and transfers to a new destination
    public void transfer(String destination, double amount){
        balance -= amount;
        System.out.println("Transferring $" + amount + " to " + destination);
        printBalance();
    }
    // prints current balance
    public void printBalance(){
        System.out.println("Your balance is now: " + balance);
    }
    // prints account information
    public void showInfo(){
        System.out.println(
            "NAME: " + name +
            "\nACCOUNT NUMBER: " + accountNumber +
            "\nBALANCE: $" + balance +
            "\nRATE: " + rate + "%"
        );
    }
}
