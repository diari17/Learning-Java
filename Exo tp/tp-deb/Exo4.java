import java.util.Scanner;
public class Exo4{
    private int distance;
    private int temps;

    public Exo4(){
        this.distance = 1;
        this.temps = 1;
    }

    public Exo4(int distance, int temps){
        if (distance <= 0 || temps <= 0) {
            throw new IllegalArgumentException("Donnez des valeurs > 0");
        }
        this.distance = distance;
        this.temps = temps;
    }
    public double vitesse(){
        return distance / temps;
    }

    public int getDistance(){
        return distance;
    } public void setDistance(int distance){
        this.distance = distance;
    }

    public int getTemps(){
        return temps;
    } public void setTemps(int temps){
        this.temps = temps;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        try {
            System.out.println("Donnez la distance parcourue: ");
        int distance = scanner.nextInt();
        System.out.println("Donnez le temps: ");
        int temps = scanner.nextInt();

        Exo4 vite = new Exo4(distance, temps);
        System.out.println("La vitesse est de: " + vite.vitesse());
        } catch (Exception e) {
        }
        scanner.close();
    }


}