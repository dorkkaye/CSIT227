package src;

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

    public float getHeight()
    {
        return height;
    }

    public String toString()
    {
        return "Radius: " + circle.getRadius() + "\nPoint: (" + circle.getX() + "," + circle.getY() + ")\nHeight: " + height;
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

    public double getArea()
    {
        return 2 * (circle.getArea()) + 2 * Math.PI * circle.getRadius() + height;
    }

    public double getVolume()
    {
        return (circle.getArea()) * height;
    }
}