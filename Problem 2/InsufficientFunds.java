class InsufficientFunds extends Exception 
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public InsufficientFunds()
    {
        super("Insufficient funds");
    }

    public InsufficientFunds(String message)
    {
        super(message);
    }
}