import java.util.*;

public class Conditional
{
    public static void main ( String[] args)
    {
        int type;   //Appliance sold [1-4]
        float price;   
        double percentage;

        Scanner sc= new Scanner(System.in); 

        System.out.print("Enter appliance type (1-4): ");  
        type = sc.nextInt();    
        System.out.print("Enter sale price: ");   
        price = sc.nextInt();

        sc.close(); 

        switch(type)
        {
            //Type 1
            case 1: 
                percentage = price * 0.07;  //Percentage of the sale
                
                if (percentage > 400)
                    System.out.println("Commision: " + percentage); 
                else
                    System.out.println("Commision: " + 400);    
                break;
            
            //Type 2
            case 2:
                percentage = price * 0.10;  //Percentage of the sale

                if (percentage > 900)
                    System.out.println("Commision: " + 900);    
                else
                    System.out.println("Commision: " + percentage); 
                break;

            //Type 3 
            case 3:
                percentage = price * 0.12;  //Percentage of the sale

                System.out.println("Commision: " + percentage); 
                break;
            
            //Type 4
            case 4:
                System.out.println("Commision: " + 250);    
                break;
            default:
                System.out.println("Please input a valid input.");  //Input is not from 1-4
                break;
        }
    }
}