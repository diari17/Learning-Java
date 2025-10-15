import java.util.Scanner;

public class TestGestionStock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre maximum de produits en stock : ");
        int maxStock = scanner.nextInt();
        GestionStock gestionStock = new GestionStock(maxStock);

        System.out.print("Entrez le nombre de produits à ajouter : ");
        int nombreProduits = scanner.nextInt();
        scanner.nextLine(); // Consommer la ligne restante

        for (int i = 0; i < nombreProduits; i++) {
            System.out.println("Produit " + (i + 1) + " :");

            System.out.print("Nom : ");
            String nom = scanner.nextLine();

            System.out.print("Prix unitaire : ");
            double prixUnitaire = scanner.nextDouble();

            System.out.print("Quantité : ");
            int quantite = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne restante

            Produit produit = new Produit(nom, prixUnitaire, quantite);
            gestionStock.ajouterProduit(produit);
        }

        System.out.println("\nListe des produits saisis :");
        gestionStock.listerProduit();

        scanner.close();
    }
}
