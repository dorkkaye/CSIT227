public class TestStudent 
{
    public static void main(String args[])
    {
        StudentName name1 = new StudentName("Yule", "Ato", "Tulin");
        Student s1 = new Student();
        Student s2 = new Student();
        
        System.out.println(s1);
        //System.out.println(s2);
        if(s1.equals(s2))
            System.out.println("Equal");
        else
            System.out.println("Not equals");
    }
}