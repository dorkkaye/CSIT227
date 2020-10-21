package Activities;
import java.util.*;

public class Sequential
{
    public static void main ( String[] args)
    {
        int enrollment = 45; //Per unit
        double miscellaneous = 0.15; //Additional fee
        int blanket = 200;

        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter number of units: ");  //Input 
        int units = sc.nextInt();  //Gets data

        //Formula
        double enrollmentFee = (units * enrollment);
        double miscellaneousFee = enrollmentFee * miscellaneous;
        double tuitionFee = enrollmentFee + miscellaneousFee + blanket;
        
        sc.close(); //Close scanner

        System.out.println("Tuition Fee: " +tuitionFee);
    }
}
