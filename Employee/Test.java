public class Test 
{
    public static void main(String[] args)
    {
        //Ungraded exercise test
        /*Person p;

        p = new Student();  //Creating object Student using reference p of Person
        p.display();    /*: Calls display of Students
                          : Displays Student*/

        /*p = new Employee(); //Creating object Employee using reference p of Person
        p.display();*/    /*: Calls display of Employee
                          : Displays "Employee"*/

        //Inheritance test
        /*Student s = new Student();
        System.out.println(s);*/
        //s.display();

        //Overriding test
        /*Square s = new Square();
        System.out.println(s);
        System.out.println(s.getArea());*/

        //Polymorphism test
        Shape s[] = new Shape[3];
        Square s1 = new Square();
        Rectangle r = new Rectangle();
        Shape shape = new Shape("Nothing");
        
        s[0] = s1;
        s[1] = r;
        s[2] = shape;

        for(int x = 0; x < s.length; x++)
        {
            System.out.println(s[x]);
            System.out.println(s[x].getArea());
        }
    }
}