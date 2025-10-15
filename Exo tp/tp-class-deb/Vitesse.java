public class Vitesse {
    private int distance;
    private int temps;

    public Vitesse() {
        this.distance = 1;
        this.temps = 1;
    }

    public Vitesse(int distance, int temps) {
        if (distance <= 0 || temps <= 0 ) {
            throw new IllegalArgumentException("Dimensions invalides : Distance doit être > 0 et temps doit être > 0.");
        }
        this.distance = distance;
        this.temps = temps;
    }
    
    public double metreParSeconde() {
        return (double) distance / temps;
    }

    public double  kilometreParHeure(){
        return ((double)distance / 100) / ((double)temps / 360);
    }

    public int getDistance(){
        return distance;
    }
    public void setDistance(int distance){
        if (distance <= 0) {
            throw new IllegalArgumentException("La distance devrait être supérieure à 0"); 
        }
        this.distance = distance;
    }

        public int getTemps(){
        return temps;
    }
    public void setTemps(int temps){
        if (temps <= 0) {
            throw new IllegalArgumentException("Le temps devrait être supérieure à 0"); 
        }
        this.temps = temps;
    }
}