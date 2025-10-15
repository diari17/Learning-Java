import java.util.Scanner;
public class Exo12 {
    private String plat;
    public Exo12() {
        this.plat = "";
    } 
    public Exo12(String plat) {
        this.plat = plat;
    }

    public int prix() {
        if ("Yassa".equalsIgnoreCase(plat)) {
            return 2000;
        } else if ("Mafé".equalsIgnoreCase(plat)){
            return 1500;
        } else if ("Thièbou Dieun".equalsIgnoreCase(plat)) {
            return 1000;
        } else {
            System.out.println("Nous n'avons pas ce plat");
        }
        return 0;
    }

    public String getPlat() {
        return plat;
    } public void setPlat(String plat) {
        this.plat = plat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Quel plat voudrez vous mangez: ");
            String plat = scanner.nextLine();

            Exo12 resto = new Exo12(plat);
            System.out.println("Le prix de votre plat est de: " +resto.prix());
        } catch (Exception e) {
        } scanner.close();
    }
}