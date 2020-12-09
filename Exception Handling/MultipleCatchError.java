public class MultipleCatchError 
{
    public static void main(String args[])
    {
        try 
        {
			int a = Integer.parseInt(args [0]);
			int b = Integer.parseInt(args [1]);
			System.out.println(a/b);
        } 
        catch (Exception ex) {} 
        catch (ArrayIndexOutOfBoundsException e) {}
	}
}

