public class Calcul
{
	public static void main(String[] args) {
		
		if (args.length == 3)
		{
			int nombre1 = Integer.parseInt(args[0]);
			int nombre2 = Integer.parseInt(args[2]);
			String operateur = args[1];
			float resultat;

			switch (operateur) {
				case "+":
					resultat = nombre1 + nombre2;
					System.out.printf("%d %s %d = %f", nombre1, operateur, nombre2, resultat);
					break;
				case "x":
					resultat = nombre1 * nombre2;
					System.out.printf("%d %s %d = %f", nombre1, operateur, nombre2, resultat);
					break;
				default:
					System.out.println("Operateur inconnu");
			}
		}
		else
		{
			System.out.println("Syntaxe incorrecte...");
		}
	}
}