import java.util.*;

public class FeetToInches 
{
    public static void main (String[] args)
    {
        int feet;
        int inches;
        double centemitre;

        Scanner sc = new Scanner(System.in);

        feet = sc.nextInt();
        inches = sc.nextInt();

        centemitre = (feet * 30.48) + (inches * 2.54);

        System.out.printf("%d feet and %d inches is %.2f in centimetre.", feet, inches, centemitre);

        sc.close();
    }
}
