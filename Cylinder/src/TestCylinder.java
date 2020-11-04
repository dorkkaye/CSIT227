package src;

public class TestCylinder 
{
    // new Circle(new Point(sc.nextInt(), sc.nextInt()), sc.nextFloat());
    public static void main(String[] args)
    {
        Cylinder c = new Cylinder(new Circle(5,5,10.5f),25);
        System.out.println(c);
        System.out.println("Area: "+ c.getArea());
        System.out.println("Volume: "+ c.getVolume());
    }
}
