
package bankaccountapp;

public class Savings extends Account {
    // List any properties specific to saings account
<<<<<<< HEAD
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
=======
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
>>>>>>> c725ad8ca9b3bd9bd0dd28a2de86f9a09a22760d
    
    
    // Constructor to initialize settings for the Savings properties
    public Savings(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
        
        setSafetyDepositBox();
    }
    
    // List any methods specific to savings account
    @Override
    public void setRate(){
        rate = getBaseRate() - 0.25; 
    };
    
    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    };
    
    public void showInfo(){
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println(
                " Your Savings Features" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
}
