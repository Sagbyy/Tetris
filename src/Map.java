public class Map {

    public static void socle(String[][] tableau) {

        // Le socle dépendera de la taille choisit par le joueur
        for (int x = 0; x < tableau.length; x++) {
            System.out.print("|");
            for (int y = 0; y < tableau[x].length ; y++) {
                System.out.print(tableau[x][y]);
            }
            System.out.println("|");
        }

        // Le fond du socle
        System.out.print(" ");
        for (int i = 0; i < 20; i++) {
            System.out.print("‾");
        }
    }
}
