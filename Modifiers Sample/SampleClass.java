public class SampleClass
{
    static int num = 10;
    static int num2;

    static
    {
        num2 = num * 2;
    }

    public static void display()   //Non-static method accessing a static variable
    {
        System.out.println(num);
    }

    public static void main(String[] args)
    {
        display();  //Calling a static method without creating an object
        System.out.println(num);    //Can be accessed without creating an object
        System.out.println(num2);   //displays 20
    }
}