import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Déclaration du Scanner
        Scanner scanner = new Scanner(System.in);

        // Création du tableau dans le main afin de l'utiliser dans les autres classes
        // Tableau de 11 lignes dont 1 pour la limite et 20 colonnes dont 2 pour les limites
        int colonne = 22;
        int ligne = 11;
        String[][] tableau = new String[11][colonne];

        for(int i = 0; i < ligne; i++) {
            for (int j = 0; j < colonne; j++) {
                tableau[i][j] = " ";
            }
        }
//
        // Affichage du logo TETRIS en ASCii
        System.out.println("___________     __         .__        \n" +
                "\\__    ___/____/  |________|__| ______\n" +
                "  |    |_/ __ \\   __\\_  __ \\  |/  ___/\n" +
                "  |    |\\  ___/|  |  |  | \\/  |\\___ \\ \n" +
                "  |____| \\____/|__|  |__|  |__/_____/\n" +
                "\n");



        // Début du programme
        System.out.println("Veuillez sélectionner une colonne comprise entre 1 et " + " inclus : ");
        int col = scanner.nextInt();

        // Boucle tant que afin de respecter les limites du tableau
        while (col < 1 || col > 20){
            System.out.println("Erreur, veuillez entrez des valeurs correctes !");
            System.out.println("Veuillez sélectionner une colonne comprise entre 1 et 20: ");
            col = scanner.nextInt();
        }

        Formes.tetriminoS(tableau, 10, col);
        Map.socle(tableau, colonne);
    }
}