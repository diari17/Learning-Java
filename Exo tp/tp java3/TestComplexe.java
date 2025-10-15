import java.util.Scanner;

public class TestComplexe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la partie réelle : ");
        double partieReelle = scanner.nextDouble();
        System.out.print("Entrez la partie imaginaire : ");
        double partieImaginaire = scanner.nextDouble();

        Complexe c4 = new Complexe(partieReelle, partieImaginaire);
        System.out.println("Votre nombre complexe est : " + c4);

        // Opérations sur le nombre saisi
        System.out.println("Ajout de c1 à votre nombre : " + c4.ajouter(c1));
        System.out.println("Soustraction de c2 à votre nombre : " + c4.soustraire(c2));

        scanner.close();
    }
}
