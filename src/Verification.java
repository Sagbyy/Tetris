public class Verification {


    // Tetrimino I
    public static int verificationTetriminoI(String[][] tab, int col) {

        // Début de la première ligne
        int x = 0;

        // Tant qu'il y a de l'espace dans sa colonne alors elle passe à la ligne suivante
        while (tab[x][col] == " " && x != 10) {
            x++;
        }

        // Boucle pour remonter la ligne au cas où sa largeur fusionne avec une autre forme
        for (int j = 1; j < 4; j++) {
            while (tab[x][col + j] == "*") {
                x--;
            }
        }

        // Condition pour éviter la superposition
        if (tab[x][col] == "*") {
            x--;
        }

            return x;
        }

    // Tetrimino I Rotation
    public static int verificationTetriminoI1(String[][] tab, int col) {

        // Début de la première ligne
        int x = 0;

        // Tant qu'il y a de l'espace sous la ligne alors elle descend
        while(tab[x][col] == " " && x != 10) {
            x++;
        }

        // Condition pour éviter la superposition
        if (tab[x][col] == "*"){
            x--;
        }

        return x;
    }

    // Tetrimino O
    public static int verificationTetriminoO(String[][] tab, int col) {

        // Début de la première ligne
        int x = 0;

        // Tant qu'il y a de l'espace dans sa colonne et colonne+1 alors elle passe à la ligne suivante
        while(tab[x][col] == " " && tab[x][col+1] == " " && x != 10) {
            x++;
        }

        // Boucle pour remonter la ligne au cas où sa largeur fusionne avec une autre forme
        for (int j = 0; j < 2; j++) {
            while(tab[x][col + j] == "*") {
                x--;
            }
        }

        return x;
    }

    public static int verificationTetriminoT(String[][] tab, int col) {

        int x = 0;

        while (tab[x][col] == " " && tab[x + 1][col] == " " && tab[x][col + 2] == " " && x != 10) {
            x++;
        }

        for (int i = 0; i < 3; i++) {
            while (tab[x][col+i] == "*") {
                x--;
            }
        }
        return x;
    }



}
