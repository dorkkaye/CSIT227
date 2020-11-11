public class BankAccount
{
    private String accountName;
    private String accountNumber;
    private double balance;
    private String firstName;
    private String lastName;
    
    public BankAccount(){}
    
    public BankAccount(String accountNumber, String accountName, double balance)
    {
        this.accountNumber = accountNumber;
        if(accountName.contains(" "))
            this.accountName = accountName;
        else
            this.accountName = "John Doe";
        this.balance = balance;
    }
    
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    
    public void setAccountName(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void setAccountName(String accountName)
    {
       this.accountName = accountName;
    }
    
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getAccountNumber()
    {
        return accountNumber;
    }
    
    public String getAccountName()
    {
        return accountName;
    }
    
    public double getBalance()
    {
        return balance;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    
    public double deposit(double amount)
    {
        if (amount < 0)
            balance = 0;
        else
            balance += amount;
        
        return balance;
    }
    
    public boolean withdraw(double amount)
    {
        if(balance < amount)
            return false;
        else
            return true;
    }
    
    public void fundTransfer(BankAccount obj, double amount)
    {
        obj.balance += amount;
        this.balance -= amount;
    }
    
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        
        sb.append(accountNumber + ", " + accountName + ", " + this.balance);
        
        return sb.toString();
    }
    
    public boolean equals(Object obj)
    {
        boolean ans = false;
        
        if(obj instanceof BankAccount)
        {
            BankAccount account = (BankAccount)obj;
            
            if(this.firstName.equals(account.firstName) && this.lastName.equals(account.lastName) && this.accountNumber.equals(account.accountNumber) && this.balance == account.balance)
                ans = true;
        }
        
        return ans;
    }
}