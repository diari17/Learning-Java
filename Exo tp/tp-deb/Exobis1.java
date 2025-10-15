import java.util.Scanner;
public class Exobis1 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Donnez la longueur des côtés: ");
        int cote = sc.nextInt();

        int perimetre = cote * 4;
        int surface = cote * cote;

        System.out.println("Le périmètre est de : " + perimetre + "m.");
        System.out.println("La surface est de : " + surface+ "m²");
    }
}