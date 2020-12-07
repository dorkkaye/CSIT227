import java.util.*;

public class SentenceCorrect 
{
    public static void main(String[] args) 
    {
        int flag = 0;

        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();

        String firstLetter = test.substring(0, 1).toUpperCase(); //Capitalize first letter
        test = firstLetter.concat(test.substring(1));

        StringBuffer sb = new StringBuffer(test);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        for(int i = 0; i < sb.length(); i++)
        {
            char c = sb.charAt(i);
            if(flag == 1 && Character.isLetter(c))
            {
                sb.setCharAt(i, Character.toUpperCase(c));
                flag = 0;
            }

            if(c == '?' || c == '.' || c == '!')    //Checks characters
                flag = 1;
        }

        System.out.println(sb.toString());

        sc.close();
    }
}