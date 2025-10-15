public  class Dessin {
    private int longueur;
    private int largeur;
    private int nombreLignes;

    public Dessin() {
        this.longueur = 1;
        this.largeur = 1;
        this.nombreLignes = 1;
    }

    public Dessin(int longueur, int largeur, int nombreLignes) {
        if (longueur <= 0 || largeur <= 0 || largeur >= longueur || nombreLignes <= 0) {
            throw new IllegalArgumentException("Dimensions invalides : longueur doit être > 0 et largeur doit être > 0 et < longueur.");
        }
        this.longueur = longueur;
        this.largeur = largeur;
        this.nombreLignes = nombreLignes;
    }

    public void rectanglePlein() {
        for (int i = 0; i < largeur; i++) {
            for (int j = 0; j < longueur; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rectangleCreux() {
        for (int i = 0; i < largeur; i++) {
            for (int j = 0; j < longueur; j++) {
                if (i == 0 || i == largeur - 1 || j == 0 || j == longueur - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }

    public void triangleIsocele() {
        for (int i = 0; i < nombreLignes; i++) {
            for (int j = 0; j < nombreLignes - i - 1; j++) {
                System.out.print(" ");
            }
        
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
     
    }
}