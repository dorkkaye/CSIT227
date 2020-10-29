public class Rectangle 
{
    //Coordinates
    private Point upperLeft; 
    private Point lowerRight;

    public Rectangle(){}

    public Rectangle(Point upperLeft, Point lowerRight)
    {
        this.upperLeft = upperLeft;
        this.lowerRight = lowerRight;
    }

    public void setUpperLeft(Point upperLeft)
    {
        this.upperLeft = upperLeft;
    }

    public void setLowerRight(Point lowerRight)
    {
        this.lowerRight = lowerRight;
    }

    public Point getUpperLeft()
    {
        return upperLeft;
    }

    public Point getLowerRight()
    {
        return lowerRight;
    }

    public double length()  //x axis
    {
        return area() / width();
    }

    public double width()   //y axix
    {
        return area() / length();
    }

    public double area()
    {
        return this.length() * this.width();
    }

    public double perimeter()
    {
       return 2 * (this.length() + this.width());
    }
}
