
public class Rectangle {
    private int longueur;
    private int largeur;

    // Constructeur par défaut : initialise avec des dimensions 1x1
    public Rectangle() {
        this.longueur = 1;
        this.largeur = 1;
    }

    // Constructeur avec paramètres : vérifie les contraintes avant d'initialiser
    public Rectangle(int longueur, int largeur) {
        if (longueur <= 0 || largeur <= 0 || largeur >= longueur) {
            throw new IllegalArgumentException("Dimensions invalides : longueur doit être > 0 et largeur doit être > 0 et < longueur.");
        }
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Méthode qui retourne le périmètre du rectangle
    public int perimetre() {
        return 2 * (longueur + largeur);
    }

    // Méthode qui retourne la surface du rectangle
    public int surface() {
        return longueur * largeur;
    }

    // Getter pour longueur
    public int getLongueur() {
        return longueur;
    }

    // Setter pour longueur avec contrainte
    public void setLongueur(int longueur) {
        if (longueur <= 0 || largeur >= longueur) {
            throw new IllegalArgumentException("Longueur doit être > 0 et supérieure à largeur.");
        }
        this.longueur = longueur;
    }

    // Getter pour largeur
    public int getLargeur() {
        return largeur;
    }

    // Setter pour largeur avec contrainte
    public void setLargeur(int largeur) {
        if (largeur <= 0 || largeur >= longueur) {
            throw new IllegalArgumentException("Largeur doit être > 0 et inférieure à longueur.");
        }
        this.largeur = largeur;
    }
}