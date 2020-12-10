class ExceptionWrongMatrixDimension extends Exception
{
    /**
     * 
     */
     
     private static final long serialVersionUID = 1L;
     
     public ExceptionWrongMatrixDimension()
     {
         super("ExceptionWrongMatrixDimension");
     }
     
     public ExceptionWrongMatrixDimension(String message)
     {
         super(message);
     }
}