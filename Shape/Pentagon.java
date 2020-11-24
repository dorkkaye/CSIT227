public abstract class Pentagon extends Shape
{
    private int sides;
    
    public Pentagon()
    {
        super("");
    }

    public Pentagon(String name, int sides)
    {
        super(name);
        this.sides = sides;
    }
}
