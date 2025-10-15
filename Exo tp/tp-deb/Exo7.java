import java.util.Scanner;
public class Exo7{
    private int vitessekh;

    public Exo7(){
        this.vitessekh = 1;
    }
    public Exo7(int vitessekh){
        this.vitessekh = vitessekh;
    }

    public double vitessems(){
        return (vitessekh * 1000) / 360;
    }

    public int getVitessekh(){
        return vitessekh;
    } public void setVitessekh(int vitessekh){
        this.vitessekh = vitessekh;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("La vitesse en km/h est de: " );
            int vitessekh = scanner.nextInt();

            Exo7 vitesse = new Exo7(vitessekh);
            System.out.println("La vitesse en m/s de: " +vitessekh+ "Km/H est de: " +vitesse.vitessems()+ "m/s");
        } catch (Exception e) {
        } scanner.close();
    }
}