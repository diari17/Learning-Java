import java.util.Arrays;

public class exo {

    // 1. Fonction pour remplir les éléments d’un tableau
    static void saisir(int[] t) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            System.out.print("Entrez un entier pour l'indice " + i + ": ");
            t[i] = scanner.nextInt();
        }
    }

    // 2. Fonction pour sommer les éléments du tableau
    static int somme(int[] t) {
        int somme = 0;
        for (int val : t) {
            somme += val;
        }
        return somme;
    }

    // 3. Fonction pour trouver le maximum des éléments du tableau
    static int maximum(int[] t) {
        int max = t[0];
        for (int val : t) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    // 4.Fonction pour trouver la différence entre le maximum et le minimum
    static int delta(int[] t) {
        int max = t[0];
        int min = t[0];
        for (int val : t) {
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }
        return max - min;
    }

    // 5. Fonction pour trier les éléments du tableau avec l'algorithme Bubble Sort
    static void bubble(int[] t) {
        int n = t.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (t[j] > t[j + 1]) {
                    // Échanger les éléments
                    int temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }
            }
        }
    }

    // 6. Fonction pour vérifier l'égalité des tableaux
    static boolean egalite(int[] t1, int[] t2) {
        if (t1.length != t2.length) {
            return false;
        }
        for (int i = 0; i < t1.length; i++) {
            if (t1[i] != t2[i]) {
                return false;
            }
        }
        return true;
    }

    // 7. Fonction pour vérifier l'équivalence des tableaux
    static boolean equivalence(int[] t1, int[] t2) {
        int[] sortedT1 = t1.clone();
        int[] sortedT2 = t2.clone();
        Arrays.sort(sortedT1);
        Arrays.sort(sortedT2);
        return Arrays.equals(sortedT1, sortedT2);
    }

    // 8. Fonction main pour tester toutes les fonctions
    public static void main(String[] args) {
        // Déclaration des tableaux
        int[] t1 = new int[5];
        int[] t2 = { 4, 2, 5, 1, 3 };

        // Test de la fonction saisir
        System.out.println("Remplir le tableau t1 :");
        saisir(t1);

        // Test de la fonction somme
        System.out.println("Somme des éléments de t1 : " + somme(t1));

        // Test de la fonction maximum
        System.out.println("Maximum des éléments de t1 : " + maximum(t1));

        // Test de la fonction delta
        System.out.println("Delta (max - min) des éléments de t1 : " + delta(t1));

        // Test de la fonction bubble
        bubble(t1);
        System.out.println("Tableau t1 après tri avec Bubble Sort : " + Arrays.toString(t1));

        // Test de la fonction egalite
        System.out.println("Égalité entre t1 et t2 : " + egalite(t1, t2));

        // Test de la fonction equivalence
        System.out.println("Équivalence entre t1 et t2 : " + equivalence(t1, t2));
    }
}
