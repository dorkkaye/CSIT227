import java.util.*;

public class Factorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        
        //try
        //{
            int number = sc.nextInt();

            for(int i = 1; i <= number; i++)
                factorial = factorial * i;

            System.out.println(factorial);
       /* }
        catch(InputMismatchException input)
        {
            System.out.println(input.toString());
        }*/

        sc.close();
    }
}

/*  INPUT   OUTPUT
      5      120
      w     InputMismatchException
    -5      Invalid Input
*/