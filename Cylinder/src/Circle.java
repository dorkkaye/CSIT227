public class Circle 
{
    private Point center = new Point();
    private float radius;

    public Circle(){}

    public Circle(Point center, float radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public Circle(int x, int y, float radius)
    {
        this.center.setX(x);
        this.center.setY(y);
        this.radius = radius;
    }

    public void setCenter(int x, int y)
    {
       this.center.setX(x);
       this.center.setY(y);
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
        sb.append("\nPoint: (" + center.getX() + "," + center.getY() + ")");

		return sb.toString();
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