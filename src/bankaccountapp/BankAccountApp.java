
package bankaccountapp;

import java.util.List;
import java.util.LinkedList;

public class BankAccountApp {

    
    public static void main(String[] args) {
        
        List<Account> accounts = new LinkedList<Account>();
        //put file path here
        String file = "C:\\Users\\bigde\\Documents\\NewBankAccounts.csv";
        //Load Data from CSV file
        List <String[]> newAccountHolders = utilities.CSV.read (file) ;
        
        // Iterate through data of each account holder
        for (String[] accountHolder : newAccountHolders) {
            
            // Extract specific data values and assign to appropriate variables
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            
            // Check for account type, create account type and add it to list of objects
            if (accountType.equals("Savings")){
                accounts.add(new Savings(name, SSN, initDeposit));
            } 
            else if (accountType.equals("Checking")){
                accounts.add(new Checking(name, SSN, initDeposit));
            }
            else{ 
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
       
        }
        
        for (Account acc : accounts) {
            System.out.println("\n********************************");
            acc.showInfo();
        }
        
        /*
        Checking chk1 = new Checking("Tom Wilson", "234867498", 1789);
        
        Savings sav1 = new Savings("Abdallah Salia", "576830456", 6758);
        
        sav1.showInfo();
        System.out.println("**************************");
        chk1.showInfo();
        
        sav1.compound();
        */
        // Read a csv file and generate new accounts based on that data
        
    }
    
}
