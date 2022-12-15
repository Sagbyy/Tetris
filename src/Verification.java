public class Verification {


    // Tetrimino I
    public static int verificationTetriminoI(String[][] tab, int col) {

        // Début de la première ligne
        int x = 0;

        // Tant qu'il y a de l'espace dans sa colonne alors elle passe à la ligne suivante
        while (tab[x][col].equals(" ") && x != 10) {
            x++;
        }

        // Boucle pour remonter la ligne au cas où sa largeur fusionne avec une autre forme
        for (int j = 1; j < 4; j++) {
            while (tab[x][col + j].equals("*")) {
                x--;
            }
        }

        // Condition pour éviter la superposition
        if (tab[x][col].equals("*")) {
            x--;
        }

            return x;
        }

    // Tetrimino I Rotation
    public static int verificationTetriminoI1(String[][] tab, int col) {

        // Début de la première ligne
        int x = 0;

        // Tant qu'il y a de l'espace sous la ligne alors elle descend
        while(tab[x][col].equals(" ") && x != 10) {
            x++;
        }

        // Condition pour éviter la superposition
        if (tab[x][col].equals("*")){
            x--;
        }

        return x;
    }

    // Tetrimino O
    public static int verificationTetriminoO(String[][] tab, int col) {

        // Début de la première ligne
        int x = 0;

        // Tant qu'il y a de l'espace dans sa colonne et colonne+1 alors elle passe à la ligne suivante
        while(tab[x][col].equals(" ") && tab[x][col+1].equals(" ") && x != 10) {
            x++;
        }

        // Boucle pour remonter la ligne au cas où sa largeur fusionne avec une autre forme
        for (int j = 0; j < 2; j++) {
            while(tab[x][col + j].equals("*")) {
                x--;
            }
        }

        return x;
    }

    // Tetrimino T
    public static int verificationTetriminoT(String[][] tab, int col) {

        // Début de la première ligne
        int x = 0;

        // Tant qu'il y a de l'espace dans sa ligne alors elle passe à la ligne suivante
        while (tab[x][col].equals(" ") && tab[x][col+2].equals(" ") && x != 10) {
            x++;
        }

        // Boucle pour remonter la ligne au cas où la colonne du mileu se fusionne
        while (tab[x][col + 1].equals("*")) {
            x--;
        }

        return x;
    }

    // Tetrimino T1 rotation 90°
    public static int verificationTetriminoT1(String[][] tab, int col) {

        // Début de la première ligne
        int x = 0;

        // Tant qu'il y a de l'espace sous la ligne alors elle descend
        while(tab[x][col+1].equals(" ") && tab[x][col].equals(" ") && x != 10) {
            x++;
        }

        // Condition pour éviter la superposition
        if (tab[x][col+1].equals("*")){
            x--;
        }

        return x;
    }

    // Tetrimino T2 rotation 180°
    public static int verificationTetriminoT2(String[][] tab, int col) {
        // Début de la première ligne
        int x = 0;

        // Tant qu'il y a de l'espace dans sa colonne alors elle passe à la ligne suivante
        while (tab[x][col].equals(" ") && x != 10) {
            x++;
        }

        // Boucle pour remonter la ligne au cas où sa largeur fusionne avec une autre forme
        for (int j = 0; j < 3; j++) {
            while (tab[x][col + j].equals("*")) {
                x--;
            }
        }

        // Condition pour éviter la superposition de la ligne du dessous
        if (tab[x][col].equals("*") && tab[x][col+2].equals("*")) {
            x--;
        }

        return x;
    }

    // Tetrimino T3 rotation 270°
    public static int verificationTetriminoT3(String[][] tab, int col) {
        // Début de la première ligne
        int x = 0;

        // Tant qu'il y a de l'espace sous la ligne alors elle descend
        while(tab[x][col+1].equals(" ") && tab[x][col].equals(" ") && x != 10) {
            x++;
        }

        // Condition pour éviter la superposition
        if (tab[x][col].equals("*")){
            x--;
        }

        return x;
    }

    // Tetrimino L
    public static int verificationTetriminoL(String[][] tab, int col) {

        // début de la première ligne
        int x = 0;

        //tant qu'il y a de la place sur la ligne la forme descend
        while (tab[x][col].equals(" ") && tab[x][col+1].equals(" ") && tab[x][col+2].equals(" ") && x !=10){
            x++;
        }

        // remonte d'une ligne si une forme est déjà présente à l'emplacement
        while (tab[x][col].equals("*")){
            x--;
        }

        return x;
    }

    // Tetrimino L1 rotation 90°
    public static int verificationTetriminoL1(String[][] tab, int col) {

        int x = 0;

        while (tab[x][col].equals(" ") && tab[x][col+1].equals(" ") && x !=10){
            x++;
        }

        if (tab[x][col].equals("*")){
            x--;
        }

        return x;
    }
}
