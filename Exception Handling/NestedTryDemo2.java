public class NestedTryDemo2 
{
    static void nestedTry(String args[]) 
    {
        try 
        {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
				System.out.println(a/b);
        } 
        catch (ArithmeticException e) 
        {
			System.out.println("Div by zero error!");
		}
	}

    public static void main(String args[])
    {
        try 
        {
			nestedTry(args);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
			System.out.println("Need 2 parameters!");
		}
	}
}
