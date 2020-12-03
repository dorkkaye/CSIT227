import java.util.*;

public class MatchString 
{
    public static String match(String phrase, String pattern)
    {
        String newText = "";

        String[] text = phrase.split("[\\s,]+");    //Whitespace and comma
        String[] part = phrase.split(" ");
        String[] patternPart = pattern.split(" ");

        for(int i = 0; i < text.length; i++)
        {
            if(text[i].equals(patternPart[0]))
                newText = newText.concat(part[i].toUpperCase() + " ");
            else
                newText = newText.concat(part[i] + " ");
        }
        
        return newText;
    }

    public static int countOccurrence(String phrase, String pattern)
    {
        int count = 0;

        String[] text = phrase.split("[\\s,]+");    //Whitespace and comma
        String[] patternPart = pattern.split(" ");

        for(int i = 0; i < text.length; i++)
        {
            if(text[i].equals(patternPart[0]))
                count++;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String phrase = sc.nextLine();
        String pattern = sc.next();

        String stringNew = match(phrase, pattern);
        int count = countOccurrence(phrase, pattern);

        System.out.println("New text: " + stringNew);
        System.out.println("\nNumber of occurrence: " + count);

        sc.close();
    }
}