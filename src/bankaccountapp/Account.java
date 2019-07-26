
package bankaccountapp;

public abstract class Account implements IRate {
    // List common properties for checkings and savings accounts
    String name;
    String SSN;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;
    
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
    public abstract void setRate();
    
    private String setAccountNumber() {
        String SSNLastTwo = SSN.substring(SSN.length()-2, SSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10, 3));
        
        return SSNLastTwo + uniqueID + randomNumber;
    }
    
    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued interest: $" + accruedInterest);
        printBalance();
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Depositing $" + amount + "....");
        printBalance();
    }
    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawing $" + amount + "....");
        printBalance();
    }
    public void transfer(String destination, double amount){
        balance -= amount;
        System.out.println("Transferring $" + amount + " to " + destination);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is now: " + balance);
    }
    public void showInfo(){
        System.out.println(
            "NAME: " + name +
            "\nACCOUNT NUMBER: " + accountNumber +
            "\nBALANCE: $" + balance +
            "\nRATE: " + rate + "%"
        );
    }
}
