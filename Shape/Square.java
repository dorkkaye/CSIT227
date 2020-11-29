public class Square extends Shape
{
    private int side;
    
    public Square()
    {
        super("");
    }

    public Square(String name, int side)
    {
        super(name);
        this.side = side;
    }

    public double computeArea()
    {
        return side * side;
    }
}