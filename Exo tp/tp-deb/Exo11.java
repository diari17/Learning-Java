import java.util.Scanner;
public class Exo11{
    private int age;
    public Exo11(){
        this.age = 1;
    } public Exo11(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    } public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Veuillez donner votre age: ");
            int age = scanner.nextInt();

            if (age < 18) {
                System.out.println("vous êtes mineur");
            } else {
                System.out.println("vous êtes majeur");
            }
        } catch (Exception e) {
        }
        scanner.close();
    }
}