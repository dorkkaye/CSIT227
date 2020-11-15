import java.util.*;

public class EqualNotEqual 
{
    public static void main (String[] args)
    {
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 == num2)
            System.out.println("Equal");
        else
            System.out.println("Not equal");

        input.close();
    }
}
