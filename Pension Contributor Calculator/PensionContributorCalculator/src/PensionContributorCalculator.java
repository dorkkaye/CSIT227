import java.util.*;

public class PensionContributorCalculator 
{
    public static void pensionCalculator(double salary, int age)
    {
        double employeeContributions = 0;
        double employerContributions = 0;
        double totalContributions = 0;
        double rateEmployee = 0;
        double rateEmployer = 0;

        //Ceiling
        if(salary > 6000)
            salary = 6000;

        //Tabulation
        if(age <= 55)
        {
            rateEmployee = 0.2;
            rateEmployer = 0.17;
        }
        else if(age > 55 && age <= 60)
        {
            rateEmployee = 0.13;
            rateEmployer = 0.13;
        }
        else if(age > 60 && age <= 65)
        {
            rateEmployee = 0.075;
            rateEmployer = 0.09;
        }
        else 
        {
            rateEmployee = 0.05;
            rateEmployer = 0.075;
        }
        
        employeeContributions = salary * rateEmployee;
        employerContributions = salary * rateEmployer;
        totalContributions = employeeContributions + employerContributions;

        System.out.printf("The employee contribution: %.2f\n", employeeContributions);
        System.out.printf("The employer contribution: %.2f\n", employerContributions);
        System.out.printf("The total contribution: %.2f\n", totalContributions);
    }

    public static void main(String[] args)  
    {
        int age;
        double salary;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the mothly salary: $");
        salary = input.nextDouble();
        System.out.print("Input age: ");
        age = input.nextInt();
        
        pensionCalculator(salary, age);

        input.close();
    }
}
