public class TestPoint
{
	public static void main(String[] args)
	{
		Point p1 = new Point(3, 2);
		Point p2 = new Point(3, 2);
		Point p3 = p1;

		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3);
		System.out.println("====================================");
		System.out.println("Comparaison référencielle");
		System.out.println("====================================");
		System.out.println("p1 == p2 : " + (p1 == p2)); // false
		System.out.println("p1 == p3 : " + (p1 == p3)); // true
		System.out.println("p2 == p3 : " + (p2 == p3)); // false
		System.out.println("====================================");
		System.out.println("Comparaison structurelle");
		System.out.println("====================================");
		System.out.println("p1.equals(p2) : " + (p1.equals(p2))); // true
		System.out.println("p1.equals(p3) : " + (p1.equals(p3))); // true
		System.out.println("p2.equals(p3) : " + (p2.equals(p3))); // true
	}
}