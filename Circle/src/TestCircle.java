public class TestCircle 
{
    public static void main(String[] args)
    {
        //Test 1
        Circle c = new Circle();
        System.out.println(c);
        c.setRadius(25);
        c.setCenter(4,5);
        System.out.println(c);

        /*OUTPUT:
        Radius: 0.00
        Point: (0,0)
        Radius: 25.00
        Point: (4,5)*/

        //Test 2
        Circle circle  = new Circle(new Point(1,2),4.5f);
        System.out.println(circle);

        /*OUTPUT:
        Radius: 4.50
        Point: (1,2)*/

        //Test 3
        Circle circle1 = new Circle (10,20,11.5f);
        System.out.println(circle1);

        /*OUTPUT
        Radius: 11.50
        Point: (10,20)*/

        //Test 4
        Circle c1 = new Circle(10,20,5);
        System.out.printf("Area: %.2f\n",c1.getArea());
        System.out.printf("Circumference: %.2f",c1.getCircumference());

        /*OUTPUT
        Area: 78.54
        Circumference: 31.42*/
    }
}