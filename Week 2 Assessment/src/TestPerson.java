public class TestPerson 
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Kaye", 10, 27, 2000);
        Person p2 = new Person("Kaye", 10, 27, 2000));
        if(p1.equals(p2))
            System.out.println("Equals");
        else
            System.out.println("Not");
    }
}
