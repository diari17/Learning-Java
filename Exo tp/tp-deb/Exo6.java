import java.util.Scanner;
public class Exo6{
    private String choix;
    private int montant;

    public Exo6(){
        this.choix = "";
        this.montant = 1;
    }
    public Exo6(String choix, int montant){
        this.choix= choix;
        this.montant = montant;
    }

    public double converti() {
        if ("oui".equalsIgnoreCase(choix)) {
            System.out.println("Vous convertissez de l'euro vers du franc");
            return montant * 655.957;
        } else if ("non".equalsIgnoreCase(choix)) {
            System.out.println("Vous convertissez du franc vers de l'euro");
            return montant / 655.957;
        } else {
            System.out.println("Choix invalide");
            return 0;
        }
    }

    public String getChoix(){
        return choix;
    } public void setChoix(String choix){
        this.choix = choix;
    }
    public int getMontant(){
        return montant;
    } public void setMontant(int montant){
        this.montant = montant;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Voudrez vous convertir de l'euro vers du franc?");
            String choix = scanner.nextLine();
            System.out.println("Veuillez donner le montant");
            int montant = scanner.nextInt();

            Exo6 convert = new Exo6(choix, montant);
            System.out.printf("On aura alors: %.2f%n ", convert.converti());
        } catch (Exception e) {
        }
        scanner.close();
    }

}