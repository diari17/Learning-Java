import java.util.Arrays;

public class GestionStock {
    private Produit[] produits;
    private int nombreProduits;
    private int maxStock;

    public GestionStock(int maxStock) {
        this.maxStock = maxStock;
        this.produits = new Produit[maxStock];
        this.nombreProduits = 0; 
    }

    public void ajouterProduit(Produit p) {
        if (nombreProduits < maxStock) {
            produits[nombreProduits++] = p;
        } else {
            System.out.println("Le stock est plein, impossible d'ajouter le produit.");
        }
    }

    public void supprimerProduit(Produit p) {
        for (int i = 0; i < nombreProduits; i++) {
            if (produits[i] != null && produits[i].getNom().equals(p.getNom())) {
                produits[i] = null; // Supprimer en mettant null à la position
                System.out.println("Produit supprimé : " + p.getNom());
                return;
            }
        }
        System.out.println("Produit non trouvé dans le stock.");
    }

    public void listerProduit() {
        Produit[] produitsNonNuls = Arrays.stream(produits)
                                          .filter(p -> p != null)
                                          .toArray(Produit[]::new);

        // Utiliser getPrixU() au lieu de getPrixUnitaire()
        Arrays.sort(produitsNonNuls, (p1, p2) -> Double.compare(p1.getPrixU(), p2.getPrixU()));

        System.out.println("Liste des produits triés par prix croissant :");
        for (Produit produit : produitsNonNuls) {
            System.out.println(produit);
        }
    }
}
