import java.util.Scanner;
public class Exo18 {

     public void verifcode() {
        System.out.println("Code correct !");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int code;

        try {

            do {
                System.out.println("Veuillez saisir le code: ");
                code = scanner.nextInt();
                if (code != 1234) {
                    System.out.println("Réessayer vous n'avez pas la bonne combinaison.");
                } 
                
            } while (code != 1234);

            Exo18 pin = new Exo18();
            pin.verifcode();

        } catch (Exception e) {
            System.out.println("Erreur : Entrez un code numérique valide.");
        } finally {
            scanner.close();
        }
        
    }
}