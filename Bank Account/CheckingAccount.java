public class CheckingAccount extends BankAccount 
{
    private double minimum;
    private double charge;

    public CheckingAccount(){}

    public CheckingAccount(String accountNumber, String accountName, double balance, double minimum, double charge)
    {
        super(accountNumber, accountName, balance);
        this.minimum = minimum;
        this.charge = charge;
    }

    public void setMinimum(double minimum)
    {
        this.minimum = minimum;
    }

    public void setCharge(double charge)
    {
        this.charge = charge;
    }

    public double getMinimum()
    {
        return minimum;
    }

    public double getCharge()
    {
        return charge;
    }

    public void cashCheck(String payee, double amount)
    {
        if(this.getBalance() >= this.minimum && this.getBalance() >= amount)
        {
            double temp = (this.getBalance() - amount) - this.charge;
            this.setBalance(temp);
        }
        else
            this.deposit(0);
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();

        sb.append(super.toString());
        sb.append(", " + this.minimum + ", " + this.charge);

        return sb.toString();
    }

    public boolean equals(Object obj)
    {
        boolean ans = false;
        
        if(obj instanceof CheckingAccount)
        {
            CheckingAccount checking = (CheckingAccount)obj;
            
            if(super.equals(checking) && this.minimum == checking.minimum && this.charge == checking.charge)
                ans = true;
        }
        
        return ans;
    }
}