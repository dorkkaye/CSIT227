public class Rectangle extends Shape
{
    private int length;
    private int width;
    
    public Rectangle()
    {
        super("");
    }

    public Rectangle(String name, int length, int width)
    {
        super(name);
        this.width = width;
        this.length = width;
    }

    public double computeArea()
    {
        return length * width;
    }
}
