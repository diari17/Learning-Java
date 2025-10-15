import java.util.StringTokenizer;

public class Tokenizer
{
	public static void main(String[] args)
	{
		String phrase = "Bonjour tout le monde";
		StringTokenizer mots = new StringTokenizer(phrase, " ");

		System.out.println("Les mots de phrase sont : ");

		while(mots.hasMoreTokens())
		{
			System.out.println(mots.nextToken());
		}
	}
}