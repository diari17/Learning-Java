import java.util.Scanner;
public class TestDessin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Entrez la longueur du rectangle : ");
            int longueur = scanner.nextInt();

            System.out.print("Entrez la largeur du rectangle : ");
            int largeur = scanner.nextInt();

            System.out.print("Entrez le nombre de lignes du triangle : ");
            int nombreLignes = scanner.nextInt();

            Dessin dessin = new Dessin(longueur, largeur, nombreLignes);
            System.out.println("\nRectangle Plein :");
            dessin.rectanglePlein();

            System.out.println("\nRectangle Creux :");
            dessin.rectangleCreux();

            System.out.println("\nTriangle Isocèle :");
            dessin.triangleIsocele();
            
        } catch (IllegalArgumentException e) {
                System.out.println("Erreur : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}