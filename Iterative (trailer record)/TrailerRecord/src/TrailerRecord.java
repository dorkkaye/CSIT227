 import java.util.*;
 
 public class TrailerRecord
 {
     public static void main ( String[] args)
     {
        int team1 = 0, team2 = 0, goal;

         Scanner sc = new Scanner(System.in);

         System.out.println("Goals scored in a soccer match: ");
         goal = sc.nextInt();
 
        while (goal == 1 || goal == 2)
        {
            //Tally scores
            if (goal == 1)
                team1++;
            else if (goal == 2)
                team2++;

            goal = sc.nextInt();
        }

        sc.close();
        
        if (goal == 0)
        {
            //Print total goals each team
            System.out.println("\nTeam 1: " + team1);
            System.out.println("Team 2: " + team2);

            //Compare scores
            if (team1 > team2)
                System.out.println("\nTeam 1 won");
            else if (team1 < team2)
                System.out.println("\nTeam 2 won");
            else 
                System.out.println("\nBoth tied");
        }
        else
             System.out.println("Invalid input");
     }
 }