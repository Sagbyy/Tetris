public class Map {

    public static void socle(String[][] tableau, int colonne) {

        // Saut de ligne pour séparer le texte qu'il y aura au-dessus
        System.out.println();

        // Créer un tableau avec "|" aux extremiter et avec les données du tableau au milieu
        for (int x = 0; x < tableau.length; x++) {
            System.out.print("|");
            for (int y = 0; y < tableau[x].length ; y++) {
                // Ajoute les données du tableau entre les extremiter "|"
                System.out.print(tableau[x][y]);
            }
            System.out.println("|");
        }

        // Le fond du tableau
        System.out.print(" ");
        for (int i = 0; i < colonne; i++) {
            System.out.print("‾");
        }
        System.out.println("\n");
    }
}
