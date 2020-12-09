public class Account
{
    private String accntNumber;
    private String accntName;
    private double balance;
    
    public Account(){}

    public Account(String num, String name, double bal)
    {
        accntNumber = num;
        accntName = name;
        balance = bal;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void withdraw(double amount)
    {
        try
        {
            if(balance < amount)
                throw new InsufficientFunds("Insufficient: Insufficient funds.");
            else 
                balance -= amount;
        }
        catch(InsufficientFunds e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String args[])
    {
        Account account = new Account("Acct-001","Juan dela Cruz", 5000.0);
        account.withdraw(5500.0);
        System.out.println("Balance: "+account.getBalance());

        Account account1 = new Account("Acct-001","Juan dela Cruz", 5000.0);
        account1.withdraw(500.0);
        System.out.println("Balance: "+account1.getBalance());
    }
}