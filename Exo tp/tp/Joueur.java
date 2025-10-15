public class Joueur{
    private String nom;
    private String prenom;
    private int age;
    private String poste;
    private int numero;
    private String equipe;
    private int nbrebut;

    public Joueur(){
        this.nom="";
        this.prenom="";
        this.age=1;
        this.poste="";
        this.numero=1;
        this.equipe="";
        this.nbrebut = 1;
    }
    public Joueur(String nom, String prenom, int age, String poste, int numero, String equipe, int nbrebut){
        this.nom= nom;
        this.prenom= prenom;
        this.age= age;
        this.poste= poste;
        this.numero= numero;
        this.equipe= equipe;
        this.nbrebut = nbrebut;
    }

    public void changeposte(String newposte) {
        this.poste = newposte;
    }
    public void changenum(int num) {
        this.numero = num;
    }
    public void changeequipe(String newequipe) {
        this.equipe = newequipe;
    }
    public int but(int but){
        return nbrebut + but;
    }
}