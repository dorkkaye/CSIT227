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

    public String toString()
	{
		StringBuffer sb = new StringBuffer();

        sb.append("Rectangle coordinates: (" + upperLeft + ", " + lowerRight + ")");
        sb.append("\nLength: " + length());
        sb.append("\nWidth: " + width());
        sb.append("\nArea: " + area());
        sb.append("\nPerimeter: " + perimeter());

		return sb.toString();
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
        return length() * width();
    }

    public double perimeter()
    {
       return 2 * (length() + width());
    }
}
