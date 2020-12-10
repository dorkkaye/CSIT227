class NegativeException extends Exception 
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public NegativeException()
    {
        super("Invalid Input");
    }
 
    public NegativeException(String message)
    {
        super(message);
    }
}
