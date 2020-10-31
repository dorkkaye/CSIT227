import java.util.*;

public class Circle 
{
    private Point center;
    private float radius;

    public Circle(){}

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
        StringBuffer sb = new StringBuffer();

        sb.append("Circle center: " + center);
        sb.append("\nCircle radius: " + radius);
        sb.append("\nArea of the circle: " + areaCircle());
        sb.append("\nCircumference of the circle: " + circumference());

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

    public double areaCircle()
    {
        return Math.PI * radius * radius;
    }

    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args)
    {
        Circle circ = new Circle();
        Circle circ2 = new Circle(new Point(1, 2), 2);

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Circle center and radius: ");
        circ = new Circle(new Point(sc.nextInt(), sc.nextInt()), sc.nextFloat());

        System.out.println(circ);

        if(circ.equals(circ2))
            System.out.println("Equals");
        else
            System.out.println("Not equals");

        sc.close();
    }
}