import java.util.Scanner;
public class Exo1 {
    private int cote;

    public Exo1(){
        this.cote = 1;
    }

    public Exo1(int cote) {
        if (cote <= 0) {
            throw new IllegalArgumentException("Donnez une valeur > 0");            
        }
        this.cote = cote;
    }

    public int perimetre() {
        return 4 * cote;
    }

    public int surface() {
        return cote * cote;
    }

    public int getCote (){
        return cote;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Donnez la longueur des côtés: ");
            int cote = scanner.nextInt();

            Exo1 carre = new Exo1(cote);

            System.out.println("Le périmètre : " + carre.perimetre());
            System.out.println("Surface : " + carre.surface());
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}