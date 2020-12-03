import java.util.*;

public class SentenceCorrect 
{
    public static void main(String[] args) 
    {
        int tag = 0;

        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();

        String firstLetter = test.substring(0, 1).toUpperCase(); //Capitalize first letter
        test = firstLetter.concat(test.substring(1));

        StringBuffer sb = new StringBuffer(test);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        for(int i = 0; i < sb.length(); i++)
        {
            char c = sb.charAt(i);
            if(tag == 1 && Character.isLetter(c))
            {
                sb.setCharAt(i, Character.toUpperCase(c));
                tag = 0;
            }

            if(c == '?' || c == '.' || c == '!')
                tag = 1;
        }

        System.out.println(sb.toString());

        sc.close();
    }
}

/**
after a train crashed, every single person died. who survived?all of the couples.
After a train crashed, every single person died. Who survived?All of the couples.
turn us on our backs and open up our stomachs, and you will be the wisest but at the start a lummox. what are we? books.
Turn us on our backs and open up our stomachs, and you will be the wisest but at the start a lummox. What are we? Books.
help! help! it's an emergency. 
Help! Help! It's an emergency. 
 */