import java.util.*;

public class Point
{
	private int x;
	private int y;

	public Point(){}

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
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

	public String toString()
	{
		StringBuffer sb = new StringBuffer();

		sb.append("(" + x + ", " + y + ")");

		return sb.toString();
	}

	public static void main (String[] args)
	{
		Rectangle r = new Rectangle(new Point(), new Point());

		Scanner sc = new Scanner(System.in);

		System.out.print("Upper left and lower right coordinates: ");
		r = new Rectangle(new Point(sc.nextInt(), sc.nextInt()), new Point(sc.nextInt(), sc.nextInt()));

		System.out.println(r);

		sc.close();
	}
	
}