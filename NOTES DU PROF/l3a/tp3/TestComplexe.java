public class TestComplexe
{
	public static void main(String[] args)
	{
		Complexe c1 = new Complexe();
		Complexe c2 = new Complexe(3, 0);
		Complexe c3 = new Complexe(0, 5);
		Complexe c4 = new Complexe(-3, 5);
		Complexe c5 = new Complexe(3, -5);
		Complexe c6 = new Complexe(0, -5);
		Complexe c7 = new Complexe(3, 5);

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		System.out.println("c6 = " + c6);
		System.out.println("c7 = " + c7);
	}
}