import java.util.Scanner;
public class Exo5 {
    private double  prixht;

    public Exo5(){
        this.prixht = 1;
    }
    public Exo5(double prixht){
        this.prixht = prixht;
    }

    public double prix(){
        return (prixht * 18.5 / 100) + prixht;
    }

    public double getPrixht(){
        return prixht;
    } public void setPrixht(double prixht){
        this.prixht = prixht; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Donnez le prix hors taxe: ");
            double prixht = scanner.nextDouble();

            Exo5 prixt = new Exo5(prixht);
            System.out.printf("Le prix taxé est de: %.2f\n", prixt.prix());
            //le format %.2 ne convient qu'à printf
        } catch (Exception e) {
        }
        scanner.close();
    }
    

}