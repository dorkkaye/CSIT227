public class Circle 
{
    private Point center;
    private float radius;
    private int x;
    private int y;

    public Circle(){}

    public Circle(Point center, float radius)
    {
        this.center = center;
        this.radius = radius;
    }

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
	
	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

    public void setCenter(int x, int y)
    {
       this.x = x;
       this.y = y;
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
        StringBuffer sb = new StringBuffer();

        sb.append(String.format("Radius: %.2f", radius));
        if(this.center == null)
            sb.append("\nPoint: (" + x + "," + y + ")");
        else
            sb.append("\nPoint: (" + center.getX() + "," + center.getY() + ")");

		return sb.toString();
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