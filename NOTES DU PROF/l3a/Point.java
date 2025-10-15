public class Point
{
	private int x, y;

	public Point() {}

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public Point(Point p)
	{
		this(p.x, p.y);
	}

	public void deplacer(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public String toString()
	{
		return "(" + this.x + ", " + this.y + ")";
		// return String.format("(%d, %d)", this.x, this.y);
	}

	public boolean equals(Point p)
	{
		return (this.x == p.x && this.y == p.y);
	}
}