public class Verification {


    // Tetrimino I
    public static int verificationTetriminoI(String[][] tab, int col) {

        int x = 0;

        while (tab[x][col] == " " && x != 10) {
            x++;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                while (tab[x][col + j] == "*") {
                    x--;
                }
            }
        }


            if (tab[x][col] == "*") {
                x--;
            }

            return x;
        }

    // Tetrimino I1
    public static int verificationTetriminoI1(String[][] tab, int col) {

        int x = 1;

        while(tab[x][col] == " " && x != 10) {
            x++;

        }

        if (tab[x][col] == "*"){
            x--;
        }

        return x;
    }
}
