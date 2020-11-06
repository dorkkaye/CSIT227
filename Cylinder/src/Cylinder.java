public class Cylinder 
{
    private Circle circle = new Circle();
    private float height = 0;

    public Cylinder(){}

    public Cylinder(Circle circle, float height)
    {
        this.circle = circle;
        this.height = height;
    }

    public Cylinder(Point center, float radius, float height)
    {
        circle = new Circle(center, radius);
        this.height = height;
    }

    public void setCircle(Circle circle)
    {
        this.circle = circle;
    }

    public void setCircle(int x, int y, float radius)
    {
        this.circle.setCenter(x, y);
        this.circle.setRadius(radius);
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
        StringBuffer sb = new StringBuffer();

        sb.append(String.format("%s\nHeight: %.2f", circle, height));

		return sb.toString();
    }

    public boolean equals(Object obj)
    {
        boolean ans = false;

        if(obj instanceof Cylinder)
        {
            Cylinder cy = (Cylinder)obj;

            if(this.circle.getCenter().getX() == cy.circle.getCenter().getX() && this.circle.getCenter().getY() == cy.circle.getCenter().getY() 
                && this.circle.getRadius() == cy.circle.getRadius() && this.height == cy.height)
                ans = true;
        }

        return ans;
    }

    public double getArea()
    {
        double temp = 2 * (circle.getArea()) + 2 * Math.PI * circle.getRadius() * height;   //Formula
        double area = Math.round(temp * 100.0) / 100.0; //2 decimal points
        
        return area;
    }

    public double getVolume()
    {
        double temp = (circle.getArea()) * height;  //Formula
        double volume = Math.round(temp * 100.0) / 100.0;   //2 decimal points

        return volume;
    }
}