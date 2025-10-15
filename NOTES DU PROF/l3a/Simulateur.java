class Simulateur
{
	public static void main(String[] args)
	{
		Bulle samaBulle = new Bulle();
		// samaBulle.couleur = "VERT";
		samaBulle.changerCouleur("VERT");
		
		Bulle.forme = "SPHERIQUE"; // samaBulle.forme = "SPHERIQUE";
		Bulle.taille = 120; // samaBulle.taille = 120;
		samaBulle.abscisse = 250;
		samaBulle.ordonnee = 105;

		System.out.println("================================");
		System.out.println("Informations sur la bulle 1 (avant)");
		System.out.println("Couleur  : " + samaBulle.couleur);
		System.out.println("Forme 	 : " + samaBulle.forme);
		System.out.println("Taille 	 : " + samaBulle.taille);
		System.out.println("Abscisse : " + samaBulle.abscisse);
		System.out.println("Ordonnee : " + samaBulle.ordonnee);
		System.out.println("================================");

		Bulle beneenBulle = new Bulle();
		beneenBulle.couleur = "ROUGE";
		Bulle.forme = "CIRCULAIRE"; // beneenBulle.forme = "CIRCULAIRE";
		Bulle.taille = 150; // beneenBulle.taille = 150;
		// Bulle.augmenterTaille(10);
		beneenBulle.abscisse = 497;
		beneenBulle.ordonnee = 659;

		System.out.println("================================");
		System.out.println("Informations sur la bulle 1");
		System.out.println("Couleur  : " + samaBulle.couleur);
		System.out.println("Forme 	 : " + samaBulle.forme);
		System.out.println("Taille 	 : " + samaBulle.taille);
		System.out.println("Abscisse : " + samaBulle.abscisse);
		System.out.println("Ordonnee : " + samaBulle.ordonnee);
		System.out.println("================================");

		System.out.println("Informations sur la bulle 2");
		System.out.println("Couleur  : " + beneenBulle.couleur);
		System.out.println("Forme 	 : " + beneenBulle.forme);
		System.out.println("Taille 	 : " + beneenBulle.taille);
		System.out.println("Abscisse : " + beneenBulle.abscisse);
		System.out.println("Ordonnee : " + beneenBulle.ordonnee);
		System.out.println("================================");
	}
}