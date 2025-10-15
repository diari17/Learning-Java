public class Cercle
{
	private int rayon;
	private Point centre;

	public Cercle(int rayon)
	{
		this(new Point(), rayon);
	}

	public Cercle(Point centre, int rayon)
	{
		this.centre = centre;
		this.setRayon(rayon);
	}

	public Cercle(Cercle c)
	{
		this(new Point(c.centre), c.rayon);
		// this.rayon = c.rayon;
		// this.centre = new Point(c.centre);
	}

	public void setRayon(int rayon)
	{
		if (rayon > 0)
		{
			this.rayon = rayon;
		}
	}

	public void deplacer(int x, int y)
	{
		this.centre.deplacer(x, y);
	}

	@Override
	public String toString()
	{
		return String.format("Cercle de centre %s et de rayon %d", this.centre, this.rayon);
	}
}