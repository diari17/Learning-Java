class Bulle
{
	private String couleur;
	private static String forme = "CIRCULAIRE";
	private static int taille = 150;
	private float abscisse, ordonnee;

	public Bulle() {
		// this.abscisse = 15;
	}

	public Bulle(float abscisse, float ordonnee)
	{
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}


	public Bulle(String couleur, float abscisse, float ordonnee)
	{
		this(abscisse, ordonnee);
		this.setCouleur(couleur);
		// abscisse = abscisse;
		// ordonnee = ordonnee;
	}

	public boolean deplacer(float abscisse, float ordonnee)
	{
		if (abscisse != this.abscisse || ordonnee != this.ordonnee)
		{
			this.abscisse = abscisse;
			this.ordonnee = ordonnee;

			return true;
		}

		return false;
	}

	public void changerCouleur(String couleur)
	{
		this.setCouleur(couleur);
	}

	public static void augmenterTaille(int facteur)
	{
		taille += facteur;
	}

	public String getCouleur()
	{
		return this.couleur;
	}

	public void setCouleur(String couleur)
	{
		if (couleur.equals("VERT") || couleur.equals("JAUNE") || couleur.equals("ROUGE"))
		{
			this.couleur = couleur;
		}
		else
		{
			System.err.println("Erreur : couleur incorrecte");
		}
	}
}