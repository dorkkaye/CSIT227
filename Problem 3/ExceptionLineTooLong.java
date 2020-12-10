class ExceptionTooLong extends Exception
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ExceptionTooLong()
    {
        super("The strings is too long.");
    }

    public ExceptionTooLong(String message)
    {
        super(message);
    }
}