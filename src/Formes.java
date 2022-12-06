public class Formes {

    public static void barre3(String[][] tab, int x, int y) {
        for (int i = 0; i < 3; i++) {
            tab[x][y] = "*";
            y++;
        }
    }
}
