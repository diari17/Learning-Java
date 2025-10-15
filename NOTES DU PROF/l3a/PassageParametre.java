public class PassageParametre
{
	public static void incrementer(int nombre, int valeur)
	{
		nombre += valeur;
	}

	public static void deplacer(Point p, int x, int y)
	{
		// p = new Point(14, 2);
		p.deplacer(x, y);
	}

	public static void main(String[] args)
	{
		int samaVar = 12;
		System.out.println("Avant, samaVar = " + samaVar);
		incrementer(samaVar, 3);
		System.out.println("Après, samaVar = " + samaVar);

		Point samaPoint = new Point(3, 2);
		System.out.println("Avant, samaPoint = " + samaPoint);
		deplacer(samaPoint, 4, 1);
		System.out.println("Après, samaPoint = " + samaPoint);
	}
}