public class SavingsAccount extends BankAccount
{
    private double interestRate;
    
    public SavingsAccount(){}
    
    public SavingsAccount(String accountNumber, String accountName, double balance, double interestRate)
    {
        super(accountNumber, accountName, balance);
        this.interestRate = interestRate;
    }
    
    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }
    
    public double getInterestRate()
    {
        return interestRate;
    }
    
    public void calculateInterest()
    {
        double temp = this.getBalance() * this.interestRate;
        this.deposit(temp);
    }
    
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        
        sb.append(super.toString());
        sb.append(", " + this.interestRate);
        
        return sb.toString();
    }
    
    public boolean equals(Object obj)
    {
        boolean ans = false;
        
        if(obj instanceof SavingsAccount)
        {
            SavingsAccount savings = (SavingsAccount)obj;
            
            if(super.equals(savings) && this.interestRate == savings.interestRate)
                ans = true;
        }
        
        return ans;
    }
}