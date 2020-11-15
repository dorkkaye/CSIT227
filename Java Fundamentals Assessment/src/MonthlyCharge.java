import java.util.*;

public class MonthlyCharge 
{
    public static void main(String[] args)
    {
        //Input
        double previousBalance; 
        double additionalCharges;   

        //Compute
        double interest;        //Assume 0 if prevBalance is 0 but 0.02 if > 0 of the prevBalance + additional charge
        double totalNewBalance; //Prevbalance + additional charge + interest
        double minimumPayment;

        Scanner sc = new Scanner(System.in);

        previousBalance = sc.nextDouble();
        additionalCharges = sc.nextDouble();

        if (previousBalance == 0)
            interest = 0;
        else 
            interest = (previousBalance + additionalCharges) * 0.02;

        totalNewBalance = previousBalance + additionalCharges + interest;

        if (totalNewBalance <= 50)
            minimumPayment = totalNewBalance;
        else if (totalNewBalance > 50 && totalNewBalance <= 300)
            minimumPayment = 50;
        else
            minimumPayment = totalNewBalance * 0.2;

        System.out.printf("Previous Balance: $%.2f\n", previousBalance);
        System.out.printf("Additional Charges: $%.2f\n", additionalCharges);
        System.out.printf("Interest: $%.2f\n\n", interest);
        System.out.printf("New Balance: $%.2f\n\n", totalNewBalance);
        System.out.printf("Minimum Payment: $%.2f", minimumPayment);

        sc.close();
    }
}
