public class Array {
    public static final int LIGNEARRAY = 11;
    public static final int COLONNEARRAY = 22;
    public static final String[][] ARRAY = new String[11][COLONNEARRAY];

    public static void createArray() {
        // Création du tableau
        //  de 11 lignes dont 1 pour la limite du sol et 20 colonnes dont 2 pour les limites sur les côtés

        // Remplissage du tableau
        for (int i = 0; i < LIGNEARRAY; i++) {
            for (int j = 0; j < COLONNEARRAY; j++) {
                ARRAY[i][j] = " ";
            }
        }
    }
}
