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
        if()
    }
}
