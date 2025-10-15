import java.util.Scanner;

public class Exo17 {
    private String ope;
    private String restnum;

    public Exo17() {
        this.ope = "";
        this.restnum = "";
    }
    public Exo17(String ope, String restnum) {
        this.ope = ope;
        this.restnum = restnum;
    }

    public void number() {
        if (ope.equals("70")) {
            System.out.println("Vous avez comme opérateur: Expresso.");
        } else if (ope.equals("76")) {
            System.out.println("Vous avez comme opérateur: Free.");
        } else if (ope.equals("77") || ope.equals("78")) {
            System.out.println("Vous avez comme opérateur: Orange.");
        } else {
            System.out.println("Cet opérateur n'existe pas.");
        }
    }

    public String getOpe() {
        return ope;
    }
    public void setOpe(String ope) {
        this.ope = ope;
    }

    public String getRestnum() {
        return restnum;
    }
    public void setRestnum(String restnum) {
        this.restnum = restnum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ope = "";
        String restnum = "";

        try {
            System.out.println("Veuillez les 2° chiffres de votre numéro");
            ope = scanner.next();
            if (ope.length() == 2) {
                System.out.println("Veuillez renseigner le reste de votre numéro.");
                restnum = scanner.next();
                if (restnum.length() == 7) {
                    System.out.println("Votre numéro est le: " +ope+ "" +restnum);
                } else {
                    System.out.println("Erreur : Le code opérateur doit avoir exactement 7 chiffres.");
                }
            } else {
                System.out.println("Erreur : Le code opérateur doit avoir exactement 2 chiffres.");
            }
            
            Exo17 tel = new Exo17(ope, restnum);
            tel.number();
        } catch (Exception e) {
            System.out.println("Errorr: Entrez des données valides.");
        }
        scanner.close();
    }
}