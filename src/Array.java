public class Array {
    public static final int LIGNEARRAY = 11;
    public static final String[][] ARRAY = new String[LIGNEARRAY][Introduction.numberColumn];

    public static void createArray() {
        // Création du tableau
        //  de 11 lignes dont 1 pour la limite du sol et 20 colonnes dont 2 pour les limites sur les côtés

        // Remplissage du tableau
        for (int i = 0; i < LIGNEARRAY; i++) {
            for (int j = 0; j < Introduction.numberColumn; j++) {
                ARRAY[i][j] = " ";
            }
        }
    }
}
