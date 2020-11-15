import java.util.*;

public class SalesTaxContribution 
{
    public static void salesTax()
    {
        double price = 0;
        double actualPrice = 0;
        double salesTax = 0;
        double totalActualPrice = 0;
        double totalSalesTax = 0;
        double totalPrice = 0;

        Scanner input = new Scanner(System.in);
        while(price != -1)
        {
            System.out.print("\nInput the tax-inclusive in dollars (or -1 to end): ");
            price = input.nextDouble();
            if(price == -1)
                break;
            else
            {
                actualPrice = price / 1.07;
                salesTax = price - actualPrice;
                System.out.printf("Actual price is: %.2f\nSales tax is: %.2f", actualPrice, salesTax);
                totalActualPrice += actualPrice;
                totalSalesTax += salesTax;
                totalPrice += price;
            }
        }
        System.out.printf("Total price: %.2f\n", totalPrice);
        System.out.printf("Total actual price: %.2f\n", totalActualPrice);
        System.out.printf("Total sales tax: %.2f\n", totalSalesTax);

        input.close();
    }

    public static void main(String p[])
    {
        salesTax();
    }
}
