import java.util.Scanner;

public class Exo15{
    private double montant;
    private String devise;

    public Exo15(){
        this.montant = 1;
        this.devise = "";
    } 
    public Exo15(double montant, String devise) {
        this.montant = montant;
        this.devise = devise;
    } 

    public double converti() {
        if (devise.equals("C")) {
            return montant / 655.957;
        } else if (devise.equals("E")){
            return montant * 655.957;
        } else {
            System.out.println("Donnez une devise correspondante (C pour CFA, E pour Euro)");
            return 0;
        }
    }

    public double getMontant() {
        return montant;
    } public void setMontant (double montant){
        this.montant = montant;
    }
    public String getDevise() {
        return devise;
    } public void setDevise (String devise){
        this.devise = devise;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Veuillez le montant que vous voulez convertir");
            double montant = scanner.nextDouble();
            System.out.println("Quelle est sa devise (C pour CFA, E pour Euro)?");
            String devise = scanner.next();

            Exo15 convert = new Exo15(montant, devise);
            if (devise.equals("C")) {
                System.out.println("Cela correpond à: " +convert.converti()+ "Euro");
            } else if (devise.equals("E")){
                System.out.println("Cela correpond à: " +convert.converti()+ "Franc CFA.");
            } else {
                System.out.println("Cela ne correspond à aucune valeur");
            }
        } catch (Exception e) {
            System.out.println("Erreur: Assurez vous de mettre une valeur correspondante.");
        }
        scanner.close();
    }
}