
package bankaccountapp;

public class BankAccountApp {

    
    public static void main(String[] args) {
        
        Checking chk1 = new Checking("Tom Wilson", "234867498", 1789);
        
        Savings sav1 = new Savings("Abdallah Salia", "576830456", 6758);
        
        sav1.showInfo();
        System.out.println("**************************");
        chk1.showInfo();
        
        sav1.compound();
        
        // Read a csv file and generate new accounts based on that data
        
    }
    
}
