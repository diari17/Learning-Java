import java.util.Scanner;
public class TestRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        try {
            // Demander les dimensions à l'utilisateur
            System.out.print("Entrez la longueur du rectangle : ");
            int longueur = scanner.nextInt();

            System.out.print("Entrez la largeur du rectangle : ");
            int largeur = scanner.nextInt();

            // Créer une instance de Rectangle avec les dimensions fournies
            Rectangle rect = new Rectangle(longueur, largeur);
            System.out.println("\nRectangle : Longueur : " + rect.getLongueur() + ", Largeur : " + rect.getLargeur());
            System.out.println("Périmètre : " + rect.perimetre());
            System.out.println("Surface : " + rect.surface());

        } catch (IllegalArgumentException e) {
                System.out.println("Erreur : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}