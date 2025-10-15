import java.util.Scanner;

public class TestPersonne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Donnez le nom de la personne:");
            String nom = scanner.nextLine();

            System.out.println("Donnez le prénom:");
            String prenom = scanner.nextLine();

            System.out.println("Quel est son âge?");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consomme la fin de ligne après nextInt()
            
            System.out.println("Quel est son sexe? (M/F)");
            String sexe = scanner.nextLine();
            

            Personne rect = new Personne(nom, prenom, age, sexe);
            // on a pas besoin de tout cela System.out.println("Cette personne porte le nom de: " + rect.getNom() + ", son 
            //prénom est: " + rect.getPrenom().... car toString fait le travail à la place
            System.out.println("Information sur la personne: ");
            System.out.println(rect);
      
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}