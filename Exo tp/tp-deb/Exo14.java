import java.util.Scanner;
public class Exo14{
    private int mois;

    public Exo14() {
        this.mois = 1;
    } public Exo14(int mois) {
        this.mois = mois;
    }
    public void choix(){
        if (mois < 1 || mois > 12) {
            System.out.println("Le chiffre ne correspond à aucun mois.");
        } else if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
            System.out.println("Le mois comprend 31 jours.");
        } else if (mois == 2) {
            System.out.println("Le mois compte 28 ou 29 jours.");
        } else {
            System.out.println("Le mois compte 30 jours.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Veuillez donner un chiffre: ");
            int mois = scanner.nextInt();

            Exo14 calendar = new Exo14(mois);
            calendar.choix();
        } catch (Exception e) {
             System.out.println("Erreur de saisie. Veuillez entrer un nombre entier.");
        } scanner.close();
    }
}