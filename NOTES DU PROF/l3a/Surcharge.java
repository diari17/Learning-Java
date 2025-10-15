public class Surcharge
{
	public static double somme(double nombre1, double nombre2)
	{
		System.out.println("Appel de la méthode 1");
		return nombre1 + nombre2;
	}
	public static double somme(double nombre1, double nombre2, double nombre3)
	{
		System.out.println("Appel de la méthode 2");
		return nombre1 + nombre2 + nombre3;
	}

	public static void main(String[] args)
	{
		System.out.println("3 + 8 = " + somme(3, 8));
		System.out.println("3 + 8 + 2 = " + somme(3, 8, 2));
	}
}