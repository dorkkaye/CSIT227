import java.util.*;

public class IterativeCounter
{
    public static void main(String[] args) throws Exception 
    {
        float grade, sum = 0;
        int unit, unitsTotal = 0;

        Scanner sc = new Scanner(System.in);    

        for(int i = 0, j = 1; i < 7; i++, j++)
        {
            System.out.print("Student grade (" + j + "): "); 
            grade = sc.nextFloat();
            
            System.out.print("Unit for subject " + j + ": ");  
            unit = sc.nextInt();

            sum += grade * unit;    //Sum of subjects per unit
            unitsTotal += unit; //Total units
        }

        float gpa = sum / unitsTotal;   //GPA
        
        System.out.println("GPA: " + gpa);
        if (gpa < 3.0)   
            System.out.println("Student failed");
        else 
            System.out.println("Student passed");

        sc.close(); 
    }
}