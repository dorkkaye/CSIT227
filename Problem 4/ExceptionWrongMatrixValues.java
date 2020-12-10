class ExceptionWrongMatrixValues extends Exception
{
    /**
     * 
     */
     
     private static final long serialVersionUID = 1L;
     
     public ExceptionWrongMatrixValues()
     {
         super("ExceptionWrongMatrixValues");
     }
     
     public ExceptionWrongMatrixValues(String message)
     {
         super(message);
     }
}