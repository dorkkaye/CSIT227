public class DivByZero
{
    public static void main(String args[])
    {
        try
        {
            System.out.println(3/0);
            System.out.println("Pls. print me.");
        }
        catch(ArithmeticException exc)
        {
            System.out.println("Divisor was 0.");
        }
        catch(ArrayIndexOutOfBoundsException exc2)
        {
            System.out.println("Missing argument.");
        }

        System.out.println("After exception.");
    }
}