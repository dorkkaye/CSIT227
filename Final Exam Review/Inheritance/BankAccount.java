public class BankAccount
{
    private String acctNum;
    private String acctName;
    private double balance;

    public BankAccount(){}

    public BankAccount(String acctNum, String acctName, double balance)
    {
        this.acctNum = acctNum;
        this.acctName = acctName;
        this.balance = balance;
    }

    public void setAccountNumber(String acctNum)
    {
        this.acctNum = acctNum;
    }

    public void setAccountName(String acctName)
    {
        if(acctName.contains(" "))
            this.acctName = acctName;
        else
            this.acctName = "John Doe";
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getAccountNumber()
    {
        return acctNum;
    }

    public String getAccountName()
    {
        return acctName;
    }

    public double getBalance()
    {
        return balance;
    }

    public double deposit(double amount)
    {
        if(amount > 0)
            balance += amount;
        else
            balance += 0;

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
        return  acctNum + ", " + acctName + ", " + balance;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof BankAccount)
        {
            BankAccount b = (BankAccount)obj;

            if(((BankAccount)obj).acctNum.equals(acctNum) && 
                ((BankAccount)obj).acctName.equals(acctName) &&
                this.balance == b.balance)
                    return true;
        }

        return false;
    }
}