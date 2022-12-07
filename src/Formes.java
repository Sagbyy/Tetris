public class Formes {

    // Tetrimino I
    public static void tetriminoI(String[][] tab, int x, int y) {
        for (int i = 0; i < 4; i++) {
            tab[x][y] = "*";
            y++;
        }
    }



    // Tetrimino O
        public static void tetriminoO(String[][] tab, int x, int y) {
            for (int i = 0; i < 2; i++) {
                tab[x][y+1] = "*";
                for (int j = 0; j < 2; j++) {
                    tab[x][y] = "*";
                }
                x--;
        }
    }

    // Tetrimino T
    public static void tetriminoT(String[][] tab, int x, int y) {
        for (int i = 0; i < 1; i++) {
            tab[x][y+1] = "*";
            for (int j = 0; j < 3; j++) {
                tab[x-1][y] = "*";
                y++;
            }
        }
    }

    // Tetrimino L
    public static void tetriminoL(String[][] tab, int x, int y) {
        for (int i = 0; i < 1; i++) {
            tab[x][y] = "*";
            for (int j = 0; j < 3; j++) {
                tab[x-1][y] = "*";
                y++;
            }
        }
    }

    // Tetrimino J
    public static void tetriminoJ(String[][] tab, int x, int y) {
        for (int i = 0; i < 1; i++) {
            tab[x][y + 2] = "*";
            for (int j = 0; j < 3; j++) {
                tab[x - 1][y] = "*";
                y++;
            }
        }
    }

    // Tetrimino Z
    public static void tetriminoZ(String[][] tab, int x, int y) {
        for (int i = 0; i < 2;  i++) {
            tab[x-1][y] = "*";
            y++;
        }
        y--;
        for (int j = 0; j < 2; j++) {
            tab[x][y] = "*";
            y++;
            }

        }

    // Tetrimino S
    public static void tetriminoS(String[][] tab, int x, int y) {
        for (int i = 0; i < 2;  i++) {
            tab[x][y] = "*";
            y++;
        }
        y--;
        for (int j = 0; j < 2; j++) {
            tab[x-1][y] = "*";
            y++;
        }
    }
}

