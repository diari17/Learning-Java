import java.util.Scanner;
public class Exo13 {
    private int mois;
    public Exo13() {
        this.mois = 1;
    }
    public Exo13(int mois) {
        this.mois = mois;
    }

    public String choix() {
        switch (mois) {
            case 1:
                return "Janvier";
            case 2:
                return "Février";
            case 3:
                return "Mars";
            case 4:
                return "Avril";
            case 5:
                return "Mai";
            case 6:
                return "Juin";
            case 7:
                return "Juillet";
            case 8:
                return "Août";
            case 9:
                return "Septembre";
            case 10:
                return "Octobre";
            case 11:
                return "Novembre";
            case 12:
                return "Décembre";
            default:
                return "Ce nombre ne correspond à aucun mois.";
        }
    }
    
    public int getMois() {
        return mois;
    } public void setMois(int mois) {
        this.mois = mois;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Veuillez donner un chiffre: ");
            int mois = scanner.nextInt();

            Exo13 calendar = new Exo13(mois);
            System.out.println("le chiffre: " +mois+ "correspond au mois de: " +calendar.choix());
        } catch (Exception e) {
            System.out.println("Errorrr");
        } scanner.close();
    }
}