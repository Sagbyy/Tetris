public class Formes {

    // Tetrimino I
    public static void tetriminoI(String[][] tab, int x, int y) {
        for (int i = 0; i < 4; i++) {
            tab[x][y] = ConsoleColors.CYAN +  "*" + ConsoleColors.RESET;
            y++;
        }
    }

    // Tetrimino I rotation
    public static void tetriminoI1(String[][] tab, int x, int y) {
        for (int i = 0; i < 4; i++) {
            tab[x][y] = ConsoleColors.CYAN +  "*" + ConsoleColors.RESET;
            x--;
        }
    }


    // Tetrimino O
        public static void tetriminoO(String[][] tab, int x, int y) {
            for (int i = 0; i < 2; i++) {
                tab[x][y+1] = ConsoleColors.YELLOW_BRIGHT +  "*" + ConsoleColors.RESET;
                for (int j = 0; j < 2; j++) {
                    tab[x][y] = ConsoleColors.YELLOW_BRIGHT +  "*" + ConsoleColors.RESET;
                }
                x--;
        }
    }


    // Tetrimino T
    public static void tetriminoT(String[][] tab, int x, int y) {
        for (int i = 0; i < 1; i++) {
            tab[x][y+1] = ConsoleColors.PURPLE +  "*" + ConsoleColors.RESET;
            for (int j = 0; j < 3; j++) {
                tab[x-1][y] = ConsoleColors.PURPLE +  "*" + ConsoleColors.RESET;
                y++;
            }
        }
    }
    //Tetrmino T rotation 90
    public static void tetriminoT1(String[][] tab, int x, int y) {
        for (int i = 0; i < 1; i++) {
            tab[x-1][y] = ConsoleColors.PURPLE +  "*" + ConsoleColors.RESET;
            for (int j = 0; j < 3; j++) {
                tab[x][y+1] = ConsoleColors.PURPLE +  "*" + ConsoleColors.RESET;
                x--;
            }
        }
    }
    //Tetrmino T rotation 180
    public static void tetriminoT2(String[][] tab, int x, int y) {
        for (int j = 0; j < 1; j++) {
            tab[x - 1][y + 1] = ConsoleColors.PURPLE +  "*" + ConsoleColors.RESET;
            for (int i = 0; i < 3; i++) {
                tab[x][y] = ConsoleColors.PURPLE +  "*" + ConsoleColors.RESET;
                y++;
            }
        }
    }
    // Tetrimino T rotation 270
    public static void tetriminoT3(String[][] tab, int x, int y) {
        for (int i = 0; i < 1; i++) {
            tab[x-1][y+1] = ConsoleColors.PURPLE +  "*" + ConsoleColors.RESET;
            for (int j = 0; j < 3; j++) {
                tab[x][y] = ConsoleColors.PURPLE +  "*" + ConsoleColors.RESET;
                x--;
            }
        }
    }



    // Tetrimino L
    public static void tetriminoL(String[][] tab, int x, int y) {
        for (int i = 0; i < 1; i++) {
            tab[x][y] = ConsoleColors.YELLOW +  "*" + ConsoleColors.RESET;
            for (int j = 0; j < 3; j++) {
                tab[x-1][y] = ConsoleColors.YELLOW +  "*" + ConsoleColors.RESET;
                y++;
            }
        }
    }

    // Tetrimino L rotation 90°
    public static void tetriminoL1(String[][] tab, int x, int y) {
        tab[x-2][y] = ConsoleColors.YELLOW +  "*" + ConsoleColors.RESET;
        for (int i = 0; i < 3; i++) {
            tab[x-i][y+1] = ConsoleColors.YELLOW +  "*" + ConsoleColors.RESET;
        }
    }

    // Tetrimino L rotation 180°
    public static void tetriminoL2(String[][] tab, int x, int y) {
        for (int i = 0; i < 3; i++) {
            tab[x][y] = ConsoleColors.YELLOW +  "*" + ConsoleColors.RESET;
            y++;
        }
        y--;
        tab[x-1][y] = ConsoleColors.YELLOW +  "*" + ConsoleColors.RESET;
    }

    // Tetrimino L rotation 270°
    public static void tetriminoL3(String[][] tab, int x, int y) {
        for (int i = 0; i < 3; i++) {
            tab[x][y] = ConsoleColors.YELLOW +  "*" + ConsoleColors.RESET;
            x--;
        }
        x++;
        tab[x][y+1] = ConsoleColors.YELLOW +  "*" + ConsoleColors.RESET;
    }



    // Tetrimino J
    public static void tetriminoJ(String[][] tab, int x, int y) {
        for (int i = 0; i < 1; i++) {
            tab[x][y + 2] = ConsoleColors.CYAN +  "*" + ConsoleColors.RESET;
            for (int j = 0; j < 3; j++) {
                tab[x - 1][y] = ConsoleColors.CYAN +  "*" + ConsoleColors.RESET;
                y++;
            }
        }
    }


    // Tetrimino J rotation 90°
    public static void tetriminoJ1(String[][] tab, int x, int y) {
        tab[x][y] = ConsoleColors.CYAN +  "*" + ConsoleColors.RESET;
        y++;
        for (int i = 0; i < 3; i++) {
            tab[x][y] = ConsoleColors.CYAN +  "*" + ConsoleColors.RESET;
            x--;
        }
    }


    // Tetrimino J rotation 180°
    public static void tetriminoJ2(String[][] tab, int x, int y) {
        tab[x-1][y] = ConsoleColors.CYAN +  "*" + ConsoleColors.RESET;
        for (int i = 0; i < 3; i++) {
            tab[x][y] = ConsoleColors.CYAN +  "*" + ConsoleColors.RESET;
            y++;
        }
    }


    // Tetrimino J rotation 270°
    public static void tetriminoJ3(String[][] tab, int x, int y) {
        for (int i = 0; i < 3; i++) {
            tab[x][y] = ConsoleColors.CYAN +  "*" + ConsoleColors.RESET;
            x--;
        }
        x++;
        tab[x][y+1] = ConsoleColors.CYAN +  "*" + ConsoleColors.RESET;
    }




    // Tetrimino Z
    public static void tetriminoZ(String[][] tab, int x, int y) {
        for (int i = 0; i < 2;  i++) {
            tab[x-1][y] = ConsoleColors.RED +  "*" + ConsoleColors.RESET;
            y++;
        }
        y--;
        for (int j = 0; j < 2; j++) {
            tab[x][y] = ConsoleColors.RED +  "*" + ConsoleColors.RESET;
            y++;
            }

        }

    // Tetrimino Z rotation 90°
    public static void tetriminoZ1(String[][] tab, int x, int y) {
        for (int i = 0; i < 2; i++) {
            tab[x][y] = ConsoleColors.RED +  "*" + ConsoleColors.RESET;
            x--;
        }
        x++;
        y++;
        for (int i = 0; i < 2; i++) {
            tab[x][y] = ConsoleColors.RED +  "*" + ConsoleColors.RESET;
            x--;
        }
    }

    // Tetrimino S
    public static void tetriminoS(String[][] tab, int x, int y) {
        for (int i = 0; i < 2;  i++) {
            tab[x][y] = ConsoleColors.GREEN +  "*" + ConsoleColors.RESET;
            y++;
        }
        y--;
        for (int j = 0; j < 2; j++) {
            tab[x-1][y] = ConsoleColors.GREEN +  "*" + ConsoleColors.RESET;
            y++;
        }
    }

    // Tetrimino S rotation 90°
    public static void tetriminoS1(String[][] tab, int x, int y) {
        for (int i = 0; i < 2;  i++) {
            tab[x][y] = ConsoleColors.RED +  "*" + ConsoleColors.RESET;
            x--;
        }
        y++;
        x++;
        for (int j = 0; j < 2; j++) {
            tab[x][y] = ConsoleColors.RED +  "*" + ConsoleColors.RESET;
            x--;
        }
    }
}

