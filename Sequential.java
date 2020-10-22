import java.util.*;

public class Sequential 
{
    public static void main ( String[] args)
    {
        int enrollment = 45; //Per unit
        double miscellaneous = 0.15; //Additional fee
        int blanket = 200;

        Scanner sc= new Scanner(System.in); //Open scanner

        System.out.println("Enter number of units: ");  //Input 
        int UNITS = sc.nextInt();  //Scan

        //Formula
        double enrollmentFee = (UNITS * enrollment);
        double miscellaneousFee = enrollmentFee * miscellaneous;
        double TUITIONFEE = enrollmentFee + miscellaneousFee + blanket;
        
        sc.close(); //Close scanner

        System.out.println("Tuition Fee: " + TUITIONFEE);    //Output
    }
}