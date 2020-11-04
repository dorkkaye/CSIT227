//import java.util.*;

public class Circle 
{
    private Point center;
    private float radius;

    public Circle()
    {
        this(new Point(0,0), 0);
    }

    public Circle(Point center, float radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public void setCenter(Point center)
    {
       this.center = center;
    }

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public Point getCenter()
    {
        return center;
    }

    public float getRadius()
    {
        return radius;
    }

    public String toString()
    {
        return "Radius: " + radius + "\nPoint: (" + center.getX() + "," + center.getY() + ")";
    }

    public boolean equals(Object obj)
    {
        boolean ans = false;

        if(obj instanceof Circle)
        {
            Circle circ = (Circle)obj;

            if(this.center.getX() == circ.center.getX() && this.radius == circ.radius && this.center.getY() == circ.center.getY())
                ans = true;
        }

        return ans;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
}