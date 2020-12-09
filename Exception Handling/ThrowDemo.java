public class ThrowsDemo 
{
    public static void main(String args[]) 
    {
        try 
        {
			ThrowingClass.meth();
        } 
        catch (ClassNotFoundException e) 
        {
			System.out.println(e);
		}
	}
}

public class ThrowDemo 
{
    public static void main(String args[])
    {
		String input = "invalid input";
        try 
        {
            if (input.equals("invalid input")) 
            {
				throw new RuntimeException("throw demo");
            } 
            else 
            {
				System.out.println(input);
            }
            
			System.out.println("After throwing");
        } 
        catch (RuntimeException e) 
        {
			System.out.println("Exception caught:" + e);
		}
	}
}



