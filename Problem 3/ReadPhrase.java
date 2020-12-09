import java.util.*;

public class ReadPhrase 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        try
        {
            String phrase = sc.nextLine();

            if(phrase.length() > 80)
                throw new ExceptionTooLong("The strings is too long.");
            else 
                System.out.println(phrase);
        }
        catch(ExceptionTooLong e)
        {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}