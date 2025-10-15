import java.util.Scanner;
public class Exo16 {
    private double moyenne;

    public Exo16() {
        this.moyenne = 1;
    }

    public Exo16(double moyenne) {
        this.moyenne = moyenne;
    }

    public void apprecie(){
        if (moyenne >= 0 && moyenne < 10) {
            System.out.println("FAIBLE");
        } else if (moyenne >= 10 && moyenne < 14){
            System.out.println("MOYEN");
        } else if (moyenne >= 14 && moyenne < 17){
            System.out.println("BON");
        } else if (moyenne >= 17 && moyenne < 20){
            System.out.println("MOYEN");
        } else {
            System.out.println("Donnez un chiffre compris entre 0 et 20");
        }
    }

    public double getMoyenne() {
        return moyenne;
    }
    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Veuillez donner la moyenne: ");
            double moyenne = scanner.nextDouble();

            Exo16 appreciation = new Exo16(moyenne);
            appreciation.apprecie();
        } catch (Exception e) {
            System.out.println("Veuillez entre une valeur valide.");
        } 
    }
}