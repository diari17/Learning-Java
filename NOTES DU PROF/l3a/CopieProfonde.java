public class CopieProfonde
{
	public static void main(String[] args)
	{
		Point centre = new Point(3, 2);

		Cercle c1 = new Cercle(centre, 8);
		Cercle c2 = new Cercle(c1);

		System.out.println("============================");
		System.out.println("Avant modification");
		System.out.println("============================");
		System.out.println("C1 = " + c1);
		System.out.println("C2 = " + c2);

		c2.deplacer(4, 9);

		System.out.println("============================");
		System.out.println("Après modification");
		System.out.println("============================");
		System.out.println("C1 = " + c1);
		System.out.println("C2 = " + c2);
	}
}