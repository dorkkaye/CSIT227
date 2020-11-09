public class Test 
{
    public static void main(String[] args)
    {
        Person p;

        p = new Student();  //Creating object Student using reference p of Person
        p.display();    /*: Calls display of Students
                          : Displays Student*/

        p = new Employee(); //Creating object Employee using reference p of Person
        p.display();    /*: Calls display of Employee
                          : Displays "Employee"*/
    }
}
