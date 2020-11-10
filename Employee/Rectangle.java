public class Rectangle extends Shape
{
    private int length;
    private int width;

    public Rectangle()
    {
        super("Rectangle");
        length = 3;
        width = 3;
    }

    public double getArea() //Sample of overriding
    {
        return length * width;
    }

    public String toString()
    {
        return super.toString() + " " + length + " " + width;
    }
}