
package bankaccountapp;

public abstract class Account implements IRate {
<<<<<<< HEAD
    // List of common properties for checkings and savings accounts
    private String name;
    private String SSN;
    private double balance;
    
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;
=======
    // List common properties for checkings and savings accounts
    String name;
    String SSN;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;
>>>>>>> c725ad8ca9b3bd9bd0dd28a2de86f9a09a22760d
    
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
<<<<<<< HEAD
    
    // an abstract method that ensures that all subclasses create a setRate method
    public abstract void setRate();
    
    // Generates last 11 digits of the account number
=======
    public abstract void setRate();
    
>>>>>>> c725ad8ca9b3bd9bd0dd28a2de86f9a09a22760d
    private String setAccountNumber() {
        String SSNLastTwo = SSN.substring(SSN.length()-2, SSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10, 3));
        
        return SSNLastTwo + uniqueID + randomNumber;
    }
    
<<<<<<< HEAD
    // Calculates the interest that results from the base rate and updates balance
=======
>>>>>>> c725ad8ca9b3bd9bd0dd28a2de86f9a09a22760d
    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued interest: $" + accruedInterest);
        printBalance();
    }
<<<<<<< HEAD
    // increases the value of balance to account for deposit
=======
>>>>>>> c725ad8ca9b3bd9bd0dd28a2de86f9a09a22760d
    public void deposit(double amount){
        balance += amount;
        System.out.println("Depositing $" + amount + "....");
        printBalance();
    }
<<<<<<< HEAD
    // decreases the value of balance to account for amount withdrawal
=======
>>>>>>> c725ad8ca9b3bd9bd0dd28a2de86f9a09a22760d
    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawing $" + amount + "....");
        printBalance();
    }
<<<<<<< HEAD
    // decreases amount in account and transfers to a new destination
=======
>>>>>>> c725ad8ca9b3bd9bd0dd28a2de86f9a09a22760d
    public void transfer(String destination, double amount){
        balance -= amount;
        System.out.println("Transferring $" + amount + " to " + destination);
        printBalance();
    }
<<<<<<< HEAD
    // prints current balance
    public void printBalance(){
        System.out.println("Your balance is now: " + balance);
    }
    // prints account information
=======
    public void printBalance(){
        System.out.println("Your balance is now: " + balance);
    }
>>>>>>> c725ad8ca9b3bd9bd0dd28a2de86f9a09a22760d
    public void showInfo(){
        System.out.println(
            "NAME: " + name +
            "\nACCOUNT NUMBER: " + accountNumber +
            "\nBALANCE: $" + balance +
            "\nRATE: " + rate + "%"
        );
    }
}
