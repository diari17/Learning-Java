import java.util.Scanner;
public class Exo2 {
    private int base;
    private int hauteur;

    public Exo2() {
        this.base = 1;
        this.hauteur = 1;
    }

    public Exo2(int base, int hauteur) {
        if (base <= 0 || hauteur <= 0) {
            throw new IllegalArgumentException("La base ou la hauteur doivent être > 0");
        }
        this.base = base;
        this.hauteur = hauteur;
    }

    public double surfarce(){
        return (base * hauteur) / 2;
    }

    public int getBase(){
        return base;
    }
    public void setBase(int base){
        this.base = base;
    }

    public int getHauteur() {
        return hauteur;
    }
    public void setHauteur(int hauteur){
        this.hauteur = hauteur;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Donnez la longueur de la base de votre triangle: ");
            int base = scanner.nextInt();
            System.out.println("Donnez la hauteur de votre triangle: ");
            int hauteur = scanner.nextInt();

            Exo2 triangle = new Exo2(base, hauteur);
            System.out.println("La surface de votre triangle est de: " +triangle.surfarce()); 
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
        scanner.close();
    }
}