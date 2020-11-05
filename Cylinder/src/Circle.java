package src;

public class Circle 
{
    private int x;
    private int y;
    private float radius;

    public Circle(){}

    public Circle(int x, int y, float radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public float getRadius()
    {
        return radius;
    }

    public String toString()
    {
        return "Radius: " + radius + "\nPoint: (" + x + "," + y + ")";
    }

    public boolean equals(Object obj)
    {
        boolean ans = false;

        if(obj instanceof Circle)
        {
            Circle circ = (Circle)obj;

            if(this.x == circ.x && this.radius == circ.radius && this.y == circ.y)
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