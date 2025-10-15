public class Table{
    private String materiau;
    private String forme;
    private int capacite;
    
    public Table(){
        this.materiau = "";
        this.forme= "";
        this.capacite = 1;
    }
    public Table(String materiau, String forme, int capacite){
        this.materiau = materiau;
        this.forme= forme;
        this.capacite = capacite;
    }

    public void ajuster(int newCapacite){
        this.capacite += newCapacite;
    }
}