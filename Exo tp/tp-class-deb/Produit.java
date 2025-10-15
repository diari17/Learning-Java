public class Produit{
    private String nom;
    private double prixU;
    private int quantite;

    public Produit() {
        this.nom = "";
        this.prixU = 1;
        this.quantite = 1;
    }

    public Produit(String nom, double prixU, int quantite) {
        if (prixU < 0 || quantite < 0 ) {
            throw new IllegalArgumentException("Le prix unitaire et la quantité doivent être >= 0");
        }
        this.nom = nom;
        this.prixU = prixU;
        this.quantite = quantite; 
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixU() {
        return prixU;
    }
    public void setPrixU(double prixU) {
        this.prixU = prixU;
    }

    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}