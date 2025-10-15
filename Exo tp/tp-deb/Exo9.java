import java.util.Scanner;
public class Exo9 {
    private int n;
    public Exo9(){
        this.n = 1;
    } public Exo9(int n){
        this.n = n;
    } 
    
    public int somme() {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
           sum += i; 
        }
        return sum;
    }

    public int getN(){
        return n;
    } public void setN(int n) {
        this.n = n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Veuillez donnez un chiffre: ");
            int n = scanner.nextInt();

            Exo9 rect = new Exo9(n);
            System.out.println("La somme des" +n+ "premiers entiers positifs est de: " +rect.somme());
        } catch (Exception e) {
        } scanner.close();

    }
}