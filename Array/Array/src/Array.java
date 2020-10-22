import java.util.*;

public class Array 
{
    public static void main ( String[] array)
    {
        int size = 10, count = 0;
        int[] gross = new int[size];  //Declare and assign size
        double[] salary = new double[size];

        Scanner sc = new Scanner(System.in);

        for(int i = 0, j = 1; i < 10; i++, j++)
        {
            System.out.print("Input gross of salesperson " + j + ": ");
            gross[i] = sc.nextInt();

            salary[i] = (gross[i] * 0.09) + 200;

            //Tally salaries > 500
            if (salary[i] > 500)
                count++;
        }

        System.out.println("Number of salesperson who earned more than 500: " + count);

        sc.close();
    }
}