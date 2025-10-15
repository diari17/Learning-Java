import java.util.Scanner;
public class Exo8{
    private int total;

    public Exo8(){
        this.total = 1;
    } 
    public Exo8(int total){
        this.total = total;
    }

    public int heure() {
        return total / 3600;
    } 
    public int minute() {
        int restem = total % 3600;
        return restem / 60;
    }
    public int seconde() {
        int restem = total % 3600;
        int restes = restem % 60;
        return restes;
    }

    public int getTotal(){
        return total;
    } public void setTotal(int total) {
        this.total = total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Veuillez donnez le nombre total de secondes: ");
            int total = scanner.nextInt();

            Exo8 convert = new Exo8(total);
            System.out.println("Vous avez pour: " +total+ "s: " +convert.heure()+ "h " +convert.minute()+ "mn et " +convert.seconde()+ "s");
        } catch (Exception e) {
        }
        scanner.close();
    }
}