import java.util.*;

public class Conditional
{
    public static void main ( String[] args)
    {
        int type;   //Appliance sold [1-4]
        float price;   
        double percentage;

        Scanner sc= new Scanner(System.in); //Open scanner

        System.out.println("Enter appliance type (1-4): ");  //Input 
        type = sc.nextInt();    //Scan
        System.out.println("Enter sale price: ");   //input
        price = sc.nextInt();

        sc.close(); //Close scanner

        switch(type)
        {
            case 1:
                percentage = price * 0.07;

                //Type 1
                if (percentage > 400)
                    System.out.println("Commision: " + percentage); //Output
                else
                    System.out.println("Commision: " + 400);    //Output
                break;
            case 2:
                percentage = price * 0.10;

                //Type 2
                if (percentage > 900)
                    System.out.println("Commision: " + 900);    //Output
                else
                    System.out.println("Commision: " + percentage); //Output
                break;
            case 3:
                System.out.println("Commision: " + 0.12); //Type 3 
                break;
            case 4:
                System.out.println("Commision: " + 250);    //Type 4
                break;
            default:
                System.out.println("Please input a valid input.");  //Input is not from 1-4
                break;
        }
    }
}