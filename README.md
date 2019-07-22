## Bank-Management-System-Application
This appplication:
  - extracts user information(name, SSN, account type, initial deposit) from a .csv file
  - Organizes user accounts with proper data structures
  - creates methods to manage both savings and checking accounts:
      deposit()
      withdraw()
      transfer()
      showInfo()
  - Generates an 11-digit account number (1 or 2 depending on account type, last two digits of SSN, unique 5-digit number and random 3-   digit number)
<br/><br/>
Savings account holders get a safety deposit box identified by a 3-digit number and accessed by a 4-digit number
<br/><br/>
Checking account holders recieve a debit card with  12-digit number and a 4-digit access code
<br/><br/>
Both account types utilize an interface that determines the base interest rate
