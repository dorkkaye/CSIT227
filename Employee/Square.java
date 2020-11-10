public class Square extends Shape
{
    private int sides;

    public Square()
    {
        super("Square");
        sides = 4;
    }

    public double getArea()
    {
        return sides * sides;
    }

    public String toString()
    {
        return super.toString() + " " + sides;
    }
}