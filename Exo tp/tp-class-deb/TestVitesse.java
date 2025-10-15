import java.util.Scanner;

public class TestVitesse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez la distance courue en métre: ");
            int distance = scanner.nextInt();
            System.out.print("Entrez le temps en seconde: ");
            int temps = scanner.nextInt();

            Vitesse rect = new Vitesse(distance, temps);
            System.out.println("\nVitesse : Distance : " + rect.getDistance() + "m, Temps : " + rect.getTemps() + "s");
            System.out.println("Distance m/s : " + rect.metreParSeconde());
            System.out.println("Distance km/h : " + rect.kilometreParHeure());
        } catch (IllegalArgumentException e) {
                System.out.println("Erreur : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}