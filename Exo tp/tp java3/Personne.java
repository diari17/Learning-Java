public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String sexe;

    public Personne() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
        this.sexe = "";
    }
    public Personne(String nom, String prenom, int age, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        setSexe(sexe);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge doit être un entier positif.");
        }
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }
    
    public void setSexe(String sexe) {
        if (!sexe.equalsIgnoreCase("M") && !sexe.equalsIgnoreCase("F")) {
            throw new IllegalArgumentException("Le sexe doit être 'M' ou 'F'.");
        }
        this.sexe = sexe;
    }

    public String toString() {
        return "Personne {" + "nom='" + nom + ", prenom='" + prenom + ", age=" + age + ", sexe='" + sexe + '}';
    }

}