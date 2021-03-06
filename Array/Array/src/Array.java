import java.util.*;

public class Array 
{
    public static void main ( String[] array)
    {
        int size = 10, count = 0;
        
        //Declare and assign size
        int[] gross = new int[size];    //Per week
        double[] salary = new double[size];

        Scanner sc = new Scanner(System.in);

        for(int i = 0, j = 1; i < gross.length; i++, j++)
        {
            System.out.print("Input gross of salesperson " + j + ": ");
            gross[i] = sc.nextInt();

            salary[i] = (gross[i] * 0.09) + 200;

            //Tally salaries > 500
            if (salary[i] > 500)
                count++;
        }

        sc.close();

        System.out.println("\nNumber of salesperson who earned more than 500: " + count);
    }
}