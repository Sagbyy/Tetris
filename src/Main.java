import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Déclaration du Scanner
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        // Création du tableau dans le main afin de l'utiliser dans les autres classes
        // Tableau de 11 lignes dont 1 pour la limite et 20 colonnes dont 2 pour les limites
        int colonne = 22;
        int ligne = 11;
        String[][] tableau = new String[11][colonne];

        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < colonne; j++) {
                tableau[i][j] = " ";
            }
        }

        // Affichage du logo TETRIS en ASCii
        System.out.println("___________     __         .__        \n" +
                "\\__    ___/____/  |________|__| ______\n" +
                "  |    |_/ __ \\   __\\_  __ \\  |/  ___/\n" +
                "  |    |\\  ___/|  |  |  | \\/  |\\___ \\ \n" +
                "  |____| \\____/|__|  |__|  |__/_____/\n" +
                "\n");


        // Déclaration de la variable col
        int col;
do {
    // Choisit aléatoirement une formes
//            int f = 1 + (int)(Math.random() * ((6)+1));
    int f = 3;



    // ! Remplacer les if else par un switch
    // choix d'une des 7 formes
    if (f == 1) {
        System.out.println("La forme est la barre. \n\n **** \n\n");
        System.out.print("Appuyez sur 1 pour mettre la barre verticalement\n(sinon 0): ");

        int rotation = scanner.nextInt();

        if (rotation == 1) {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.print("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 20);

            Formes.tetriminoI1(tableau, Verification.verificationTetriminoI1(tableau, col), col);
        } else {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.print("Veuillez sélectionner une colonne comprise entre 0 et 17 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 17);

            Formes.tetriminoI(tableau, Verification.verificationTetriminoI(tableau, col), col);
        }
    } else if (f == 2) {
        System.out.println("La forme est le cube. \n\n **\n ** \n\n");

        // Demande d'une colonne en fonction de la forme
        do {
            System.out.print("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
            col = scanner.nextInt();
        } while (col < 0 || col > 20);

        Formes.tetriminoO(tableau, Verification.verificationTetriminoO(tableau, col), col);
    } else if (f == 3) {
        System.out.println("La forme est le T. \n\n ***\n  * \n\n");
        System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n2 pour tourner la forme de 180°\n3 pour tourner la forme de 270°\n(sinon 0)");

        int rotation = scanner.nextInt();

        if (rotation == 1) {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 20);

            Formes.tetriminoT1(tableau, Verification.verificationTetriminoT(tableau, col), col);
        } else if (rotation == 2) {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 19);

            Formes.tetriminoT2(tableau, 10, col);
        } else if (rotation == 3) {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 20);

            Formes.tetriminoT3(tableau, 10, col);
        } else {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 19);

            Formes.tetriminoT(tableau, 10, col);
        }
    } else if (f == 4) {
        System.out.println("La forme est le L . \n\n ***\n * \n\n");
        System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n2 pour tourner la forme de 180°\n3 pour tourner la forme de 270°\n(sinon 0)");

        int rotation = scanner.nextInt();

        if (rotation == 1) {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 20);

            Formes.tetriminoL1(tableau, 10, col);
        } else if (rotation == 2) {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 19);

            Formes.tetriminoL2(tableau, 10, col);
        } else if (rotation == 3) {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 20);

            Formes.tetriminoL3(tableau, 10, col);
        } else {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 19);

            Formes.tetriminoL(tableau, 10, col);
        }
    } else if (f == 5) {
        System.out.println("La forme est le L inversé. \n\n ***\n   * \n\n");
        System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n2 pour tourner la forme de 180°\n3 pour tourner la forme de 270°\n(sinon 0) ");

        int rotation = scanner.nextInt();

        if (rotation == 1) {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 20);

            Formes.tetriminoJ1(tableau, 10, col);
        } else if (rotation == 2) {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 19);

            Formes.tetriminoJ2(tableau, 10, col);
        } else if (rotation == 3) {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 20);

            Formes.tetriminoJ3(tableau, 10, col);
        } else {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 19);

            Formes.tetriminoJ(tableau, 10, col);
        }
    } else if (f == 6) {
        System.out.println("La forme est le biais. \n\n **\n  ** \n\n");
        System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n(sinon 0)");

        int rotation = scanner.nextInt();

        if (rotation == 1) {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 20);

            Formes.tetriminoZ1(tableau, 10, col);
        } else {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 19);

            Formes.tetriminoZ(tableau, 10, col);
        }
    } else {
        System.out.println("La forme est le biais inversé. \n\n  **\n ** \n\n");
        System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n(sinon 0)");

        int rotation = scanner.nextInt();

        if (rotation == 1) {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 20);

            Formes.tetriminoS1(tableau, 10, col);
        } else {
            // Demande d'une colonne en fonction de la forme
            do {
                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                col = scanner.nextInt();
            } while (col < 0 || col > 19);

            Formes.tetriminoS(tableau, 10, col);
        }
    }

    Map.socle(tableau, colonne);
}while(col != 80);
    }
}