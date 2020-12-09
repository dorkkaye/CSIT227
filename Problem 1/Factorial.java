import java.util.*;

public class Factorial
{
    public static void main(String args[]) throws NegativeException
    {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        
        try
        {
            int number = sc.nextInt();

            //Negative inputs
            if(number < 0)
            {
                throw new NegativeException("Invalid Input");
            } 
            else
            {
                for(int i = 1; i <= number; i++)
                    factorial = factorial * i;
            }
            
            System.out.println(factorial);                  
        }
        catch(InputMismatchException e)
        {
            System.out.println("InputMismatchException");
        }
        catch(NegativeException e2)
        {
            System.out.println(e2.getMessage());
        }
    }
}

/*  INPUT   OUTPUT
      5      120
      w     InputMismatchException
     -5      Invalid Input
*/