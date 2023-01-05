public class Point {
    // Nombre de points gagné
    public static final int POINTS = 50;
    // Variable global du resultat afin de l'utiliser dans le main
    public static int resultat = 0;


    public static void lineDelete(String[][] tab) {

        // Boucle pour parcourirs toutes les lignes du tableau
        for (int x = 0; x < tab.length; x++) {

            // Variable pour compter le nombre d'étoiles sur la ligne
            int cptStar = 0;

            // Boucle pour compter le nombre d'étoiles sur la ligne
            for (int y = 0; y < Array.LIGNEARRAY; y++) {
                if (tab[x][y].equals("*")) {
                    cptStar++;
                }
            }

            // Si la ligne est remplie d'étoiles
            if (cptStar == Array.LIGNEARRAY) {
                // Remplace la ligne complète par des espaces
                for(int y = 0; y < Array.LIGNEARRAY; y++) {
                    tab[x][y] = " ";
                }

                // Sauvegarde dans une variable la ligne vide
                String[] emptyLine = tab[x];

                // Variable qui sauvegarde la position de la ligne afin de remonter au-dessus du tableau
                int backUp = x;

                // Boucle pour remonter la position du "BackUp" tout en haut du tableau et redescendre toutes les autres lignes
                while (backUp > 0) {
                    tab[backUp] = tab[backUp - 1];
                    backUp--;
                }

                // Remplace la première ligne du tableau par la ligne vide
                tab[0] = emptyLine;

                // Rajoute constante points dans le résultat
                resultat = resultat + POINTS;
            }
        }
    }
}
