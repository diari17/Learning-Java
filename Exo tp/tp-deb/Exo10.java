import java.util.Scanner;
public class Exo10{
    private int a;
    private int b;

    public Exo10(){
        this.a = 1;
        this.b = 1;
    } public Exo10(int a, int b){
        this.a = a;
        this.b = b;
    }

    public double moya() {
        return (a + b) / 2;
    }
    public double moyg() {
        return Math.sqrt(a*b);
    }
    public double diff() {
        return moya() - moyg();
    }

    public int getA(){
        return a;
    } public void setA(int a) {
        this.a = a;
    }
    public int getB(){
        return b;
    } public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Veuillez donner la valeur de a: ");
            int a = scanner.nextInt();
            System.out.print("Veuillez donner la valeur de b: ");
            int b = scanner.nextInt();

            Exo10 difference = new Exo10(a, b);
            System.out.println("La différence entre la moyenne arithmétique et la moyenne géométrique de deux réels: " +a+ " et " +b+ " est de: " +difference.diff());
        } catch (Exception e) {
        } finally {
        }
    }
}