import java.util.Scanner;
public class Exo19 {
    
    public void verifpin() {
        System.out.println("Téléphone déverrouillé.");
    }

    public void verifpuk() {
        System.out.println("Vous avez trouvé la bonne combinaison du code puk.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codepin;
        int codepuk;

        try {
            Exo19 code = new Exo19();

            for (int i = 0; i < 3; i++) {
                System.out.println("Veuillez saisir un code PIN: ");
                codepin = scanner.nextInt();

                if (codepin == 1234) {  // Si le code PIN est correct
                    code.verifpin();
                    return; // On quitte le programme après le déverrouillage
                } else {
                    System.out.println("Code PIN incorrect. Veuillez réessayer.");
                }

                // Après trois échecs, on passe au code PUK
                if (i == 2) {
                    // Boucle pour les trois tentatives de PUK
                    for (int j = 0; j < 3; j++) {
                        System.out.println("Veuillez donner le code PUK: ");
                        codepuk = scanner.nextInt();

                        if (codepuk == 4567) {  // Si le code PUK est correct
                            code.verifpuk();
                            return; // On quitte le programme après le déverrouillage
                        } else {
                            System.out.println("Code PUK incorrect. Veuillez réessayer.");
                        }
                    }
                    // Après trois tentatives de PUK échouées
                    System.out.println("Téléphone bloqué.");
                    return;
                }
            }
        } 
        catch (Exception e) {
            System.out.println("Erreur : Entrez un code numérique valide.");
        } 
        finally {
            scanner.close();
        }
    }
}