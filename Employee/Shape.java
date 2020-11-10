/*: Not included in the ungraded exercise
  : Sample overrisding*/

public class Shape 
{
    private String nameShape;

    public Shape(){}

    public Shape(String nameShape)
    {
        this.nameShape = nameShape;
    }

    public double getArea()
    {
        return 0;
    }

    public String toString()
    {
        return nameShape;
    }
}
