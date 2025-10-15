import java.util.Scanner;
public class Exo3{
    private int x;
    private int y;
    private int z;

    public Exo3(){
        this.x = 1;
        this.y = 1;
        this.z = 1;
    }

    public Exo3(int x, int y, int z){
        this.x= x;
        this.y = y;
        this.z = z;
    }

    public double moyenne() {
        return (x + y + z) / 3;
    }

    public int getX(){
        return x;
    } public void setX(int x){
        this.x = x;
    }

    public int getY() {
        return y;
    } public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    } public void setZ(int z){
        this.z = z;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Donnez la valeur de x: ");
            int x = scanner.nextInt();
            System.out.println("Donnez la valeur de y: ");
            int y = scanner.nextInt();
            System.out.println("Donnez la valeur de z: ");
            int z = scanner.nextInt();
        
            Exo3 moy = new Exo3(x, y, z);
            System.out.println("La moyenne est de: " + moy.moyenne());
        } catch (Exception e) {
        }
        scanner.close();
    }
}