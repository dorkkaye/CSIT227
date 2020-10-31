import java.util.*;

public class Cylinder 
{
    private Circle circle;
    private float height;

    public Cylinder(){}

    public Cylinder(Circle circle, float height)
    {
        this.circle = circle;
        this.height = height;
    }

    public void setCircle(Circle circle)
    {
        this.circle = circle;
    }

    public void setHeight(float height)
    {
        this.height = height;
    }

    public Circle getCircle()
    {
        return circle;
    }

    public float height()
    {
        return height;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();

        sb.append(circle);
        sb.append("\nHeight: " + height);
        sb.append("\nArea of the cylinder: " + areaCylinder());
        sb.append("\nVolume of the cylinder: " + volume());

        return sb.toString();
    }

    public boolean equals(Object obj)
    {
        boolean ans = false;

        if(obj instanceof Cylinder)
        {
            Cylinder cy = (Cylinder)obj;

            if(this.circle == cy.circle && this.height == cy.height)
                ans = true;
        }

        return ans;
    }

    public double areaCylinder()
    {
        return 2 * circle.areaCircle() + 2 * Math.PI * circle.getRadius() + height; 
    }

    public double volume()
    {
        return circle.areaCircle() * height;
    }

    // new Circle(new Point(sc.nextInt(), sc.nextInt()), sc.nextFloat());
    public static void main(String[] args)
    {
        Cylinder cy = new Cylinder();

        Scanner sc = new Scanner(System.in);

        System.out.print("Cylinder circle and height: ");
        cy = new Cylinder(new Circle(new Point(sc.nextInt(), sc.nextInt()), sc.nextFloat()), sc.nextFloat());

        System.out.println(cy);

        sc.close();
    }
}