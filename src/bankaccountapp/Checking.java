
package bankaccountapp;

public class Checking extends Account {
    // List properties specific to a Checking account
<<<<<<< HEAD
    private int debitCardNumber;
    private int debitCardPIN;
=======
    int debitCardNumber;
    int debitCardPIN;
>>>>>>> c725ad8ca9b3bd9bd0dd28a2de86f9a09a22760d
    
    // Constructor to initialize checking account properties
    public Checking(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setDebitCard();
        
    }
    
// List any methods specific to the checking account    
    @Override
    public void setRate(){
        rate = getBaseRate() * 0.15;
    }
    
    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        debitCardPIN = (int)(Math.random() * Math.pow(10, 4));
    };
    

    public void showInfo(){
        System.out.println("ACCOUNT TYPE: Checking" );
        super.showInfo();
        System.out.println(
                " Your Checking Account Features" +
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card Pin: " + debitCardPIN
        );
    }
}
