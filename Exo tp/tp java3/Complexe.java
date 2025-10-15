public class Complexe {
    private double partieReelle;
    private double partieImaginaire;

    public Complexe(){
        this.partieReelle = 0;
        this.partieImaginaire = 0;
    }
    public Complexe(double partieReelle, double partieImaginaire){
        this.partieReelle = partieReelle;
        this.partieImaginaire = partieImaginaire;
    }
    public Complexe(Complexe c) {
        this.partieReelle = c.partieReelle;
        this.partieImaginaire = c.partieImaginaire;
    }

    public double getPartieReelle() {
        return partieReelle;
    }
    public void setPartieReelle(double partieReelle) {
        this.partieReelle = partieReelle;
    }

    public double getPartieImaginaire() {
        return partieImaginaire;
    }
    public void setPartieImaginaire(double partieImaginaire) {
        this.partieImaginaire = partieImaginaire;
    }

    public Complexe ajouter(Complexe c) {
        return new Complexe(
                this.partieReelle + c.partieReelle,
                this.partieImaginaire + c.partieImaginaire
        );
    }

    public Complexe soustraire(Complexe c) {
        return new Complexe(
                this.partieReelle - c.partieReelle,
                this.partieImaginaire - c.partieImaginaire
        );
    }

    public String toString() {
        return partieReelle + (partieImaginaire >= 0 ? " + " : " - ") +
                Math.abs(partieImaginaire) + " * i";
    }
}