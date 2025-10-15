public class Regex
{
	public static void main(String[] args)
	{
		String nameRegex = "[A-Z][a-z]+";
		// String ageRegex = "[1-9][0-9]*";

		String nom1 = "Ly";
		String nom2 = "Ndiaye";
		String nom3 = "Lay32";

		System.out.println("nom1 est correcte : " + nom1.matches(nameRegex));
		System.out.println("nom2 est correcte : " + nom2.matches(nameRegex));
		System.out.println("nom3 est correcte : " + nom3.matches(nameRegex));
	}
}