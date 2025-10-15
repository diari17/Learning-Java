public class Equipe{
    private String nom;
    private int effectif;
    private String coach;
    private int score;
    private int win;
    private int lost;

//constructeur
    public Equipe(){
        this.nom = "";
        this.effectif = 1;
        this.coach = "";
        this.score = 1;
        this.win = 1;
        this.lost = 1;
    }
    public Equipe(String nom, int effectif, String coach, int score, int win, int lost){
        this.nom = nom;
        this.effectif = effectif;
        this.coach = coach;
        this.score = score;
        this.win = win;
        this.lost = lost;
    }

    public int neweffectif(int nbre) {
        return effectif + nbre;
    }
    public void coach(String newcoach){
        this.coach = newcoach;
    }
    public int newscore(int point){
        return score + point;
    }
    public void jeu(int game){
        if (game < 0) {
            lost++;
        } else if (game > 0) {
            win++;
        }
    }
}