public class PasssageArgument
{
	public static void main(String[] args)
	{
		System.out.println("Nombre d'arguments fourni : " + args.length);

		for (int i = 0; i < args.length; i++)
		{
			System.out.println("Argument N°" + (i + 1) + " : " + args[i]);
		}
	}
}