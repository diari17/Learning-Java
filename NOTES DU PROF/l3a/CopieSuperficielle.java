public class CopieObjet
{
	public static void main(String[] args)
	{
		Point p1 = new Point(3, 2);
		// Point p2 = p1; // copie de la référence de l'objet, pas de l'objet
		Point p2 = new Point(p1); // copie de l'objet en utilisant un constructeur de recopie

		System.out.println("============================");
		System.out.println("Avant modification");
		System.out.println("============================");
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);

		p2.deplacer(5, 9);

		System.out.println("============================");
		System.out.println("Après modification");
		System.out.println("============================");
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
	}
}