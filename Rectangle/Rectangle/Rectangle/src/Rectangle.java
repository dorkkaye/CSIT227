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
    
    public boolean equals(Object obj)
    {
        boolean ans = false;

        if(obj instanceof Rectangle)
        {
            Rectangle r = (Rectangle)obj;

            if(this.upperLeft.getX() == r.upperLeft.getX() && this.lowerRight.getX() == r.lowerRight.getX() 
                && this.upperLeft.getY() == r.upperLeft.getY() && this.lowerRight.getY() == r.lowerRight.getY())
                ans = true;
        }

        return ans;
    }

    public double length()  //x axis
    {
        double length = 0;
        double left;
        double right;

        //Possible cases: area is not given
        if(upperLeft.getX() < 0 && lowerRight.getX() > 0)
        {
            left = upperLeft.getX() * (-1);
            
            length = left + lowerRight.getX();
        }
        else if(upperLeft.getX() > 0 && lowerRight.getX() > 0)
        {
            if(upperLeft.getX() > lowerRight.getX())
                length = upperLeft.getX() - lowerRight.getX();
            else
                System.out.println("Invalid coordinates."); //Not forming rectangle 
        }
        else if(upperLeft.getX() < 0 && lowerRight.getX() < 0)
        {
            left = upperLeft.getX() * (-1);
            right = lowerRight.getX() * (-1);

            if(left > right)
                length = left - right;
            else
                System.out.println("Invalid coordinates."); //Not forming rectangle
        }
        else
            System.out.println("Invalid coordinates."); //Not forming rectangle

        return length;
    }

    public double width()   //y axix
    {
        double width = 0;
        double left;
        double right;

        //Possible cases: area is not given
        if(upperLeft.getY() > 0 && lowerRight.getY() < 0)
        {
            right = lowerRight.getY() * (-1);

            width = upperLeft.getY() + right;
        }
        else if(upperLeft.getY() > 0 && lowerRight.getY() > 0)
        {
            if(upperLeft.getY() > lowerRight.getY())
                width = upperLeft.getY() - lowerRight.getY();
            else
                System.out.println("Invalid coordinates."); //Not forming rectangle
        }
        else if(upperLeft.getY() < 0 && lowerRight.getY() < 0)
        {
            left = upperLeft.getY() * (-1);
            right = lowerRight.getY() * (-1);

            if(left < right)
                width = right - left;
            else
                System.out.println("Invalid coordinates."); //Not forming rectangle
        }
        else
            System.out.println("Invalid coordinates."); //Not forming rectangle

        return width;
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
