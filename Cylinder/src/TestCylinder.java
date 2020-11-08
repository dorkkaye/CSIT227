public class TestCylinder 
{
    public static void main(String[] args)
    {
        //Test 1
        Cylinder c = new Cylinder();
        c.setCircle(10,20,4.5f); 
        c.setHeight(10);
        System.out.printf("Radius: %.2f\n", c.getCircle().getRadius());
        System.out.println("Point: " + c.getCircle().getCenter());
        System.out.printf("Height: %.2f\n", c.getHeight());

        /*OUTPUT
        Radius: 4.50
        Point: (10,20)
        Height: 10.00*/

        //Test 2
        Cylinder c1 = new Cylinder(new Circle(5,5,10.5f),25);
        System.out.println(c1);
        System.out.println("Area: "+ c1.getArea());
        System.out.println("Volume: "+ c1.getVolume());

        /*OUTPUT
        Radius: 10.50
        Point: (5,5)
        Height: 25.00
        Area: 2342.06
        Volume: 8659.01*/

        //Equality test
        if(c.equals(c1))
            System.out.println("Equal");
        else
            System.out.println("Not equals");
    }
}
