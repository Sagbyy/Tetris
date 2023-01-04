import java.util.Scanner;

public class DemandeForme {
    public static void princpale(String[][] tableau, int colonne) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        // Déclaration de la variable col
        int col;

        // Déclaration de la variable d'erreur en false
        boolean error = false;

        // Boucle du jeu
        do {
            // Choisit aléatoirement des formes
//            int f = 1 + (int)(Math.random() * ((7 - 1 + 1) + 1));
int f = 2;
            // Essaye le code pour attraper une erreur
            try {
                // Choix d'une des 7 formes
                // Forme 1 = Tetrimino I
                if (f == 1) {
                    System.out.println("La forme est la barre. " + ConsoleColors.CYAN + "\n\n **** \n\n" + ConsoleColors.RESET);
                    System.out.print("Appuyez sur 1 pour mettre la barre verticalement\n(sinon 0): ");

                    int rotation = scanner.nextInt();

                    // Tetrimino I rotation 90°
                    if (rotation == 1) {
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.print("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 20);

                        Formes.tetriminoI1(tableau, Verification.verificationTetriminoI1(tableau, col), col);

                    } else {
                        // Tetrimino I
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.print("Veuillez sélectionner une colonne comprise entre 0 et 17 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 17);

                        Formes.tetriminoI(tableau, Verification.verificationTetriminoI(tableau, col), col);
                    }

                    // Forme 2 = Tetrimino O
                } else if (f == 2) {
                    System.out.println("La forme est le cube. " + ConsoleColors.YELLOW_BRIGHT + "\n\n **\n ** \n\n" + ConsoleColors.RESET);

                    // Demande d'une colonne en fonction de la forme
                    do {
                        System.out.print("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                        col = scanner.nextInt();
                    } while (col < 0 || col > 20);

                    Formes.tetriminoO(tableau, Verification.verificationTetriminoO(tableau, col), col);

                    // Forme 3 = Tetrimino T
                } else if (f == 3) {
                    System.out.println("La forme est le T. " + ConsoleColors.PURPLE + "\n\n ***\n  * \n\n" + ConsoleColors.RESET);
                    System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n2 pour tourner la forme de 180°\n3 pour tourner la forme de 270°\n(sinon 0)");

                    int rotation = scanner.nextInt();

                    // Tetrimino T rotation 90°
                    if (rotation == 1) {
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 20);

                        Formes.tetriminoT1(tableau, Verification.verificationTetriminoT1(tableau, col), col);

                    } else if (rotation == 2) {
                        // Tetrimino T rotation 180°
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 19);

                        Formes.tetriminoT2(tableau, Verification.verificationTetriminoT2(tableau, col), col);

                    } else if (rotation == 3) {
                        // Tetrimino T rotation 270°
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 20);

                        Formes.tetriminoT3(tableau, Verification.verificationTetriminoT3(tableau, col), col);

                    } else {
                        // Tetrimino T
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 19);

                        Formes.tetriminoT(tableau, Verification.verificationTetriminoT(tableau, col), col);
                    }

                    // Forme 4 = Tetrimino L
                } else if (f == 4) {
                    System.out.println("La forme est le L . " + ConsoleColors.YELLOW_BRIGHT + "\n\n ***\n * \n\n" + ConsoleColors.RESET);
                    System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n2 pour tourner la forme de 180°\n3 pour tourner la forme de 270°\n(sinon 0)");

                    int rotation = scanner.nextInt();

                    // Tetrimino L rotation 90°
                    if (rotation == 1) {
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 20);

                        Formes.tetriminoL1(tableau, Verification.verificationTetriminoL1(tableau, col), col);

                        // Tetrimino L rotation 180°
                    } else if (rotation == 2) {
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 19);

                        Formes.tetriminoL2(tableau, 1, col);

                    } else if (rotation == 3) {
                        // Tetrimino L rotation 270°
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 20);

                        Formes.tetriminoL3(tableau, 10, col);

                    } else {
                        // Tetrimino L
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 19);

                        Formes.tetriminoL(tableau, Verification.verificationTetriminoL(tableau, col), col);
                    }

                    // Tetrimino J
                } else if (f == 5) {
                    System.out.println("La forme est le L inversé. " + ConsoleColors.BLUE + "\n\n ***\n   * \n\n" + ConsoleColors.RESET);
                    System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n2 pour tourner la forme de 180°\n3 pour tourner la forme de 270°\n(sinon 0) ");

                    int rotation = scanner.nextInt();

                    // Tetrimino J rotation 90°
                    if (rotation == 1) {
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 20);

                        Formes.tetriminoJ1(tableau, 10, col);

                    } else if (rotation == 2) {
                        // Tetrimino J rotation 180°
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 19);

                        Formes.tetriminoJ2(tableau, 10, col);

                    } else if (rotation == 3) {
                        // Tetrimino J rotation 270°
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 20);

                        Formes.tetriminoJ3(tableau, 10, col);

                    } else {
                        // Tetrimino J
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 19);

                        Formes.tetriminoJ(tableau, 10, col);
                    }

                    // Tetrimino Z
                } else if (f == 6) {
                    System.out.println("La forme est le biais. " + ConsoleColors.RED + "\n\n **\n  ** \n\n" + ConsoleColors.RESET);
                    System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n(sinon 0)");

                    int rotation = scanner.nextInt();

                    if (rotation == 1) {
                        // Tetrimino Z rotation 90°
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 20);

                        Formes.tetriminoZ1(tableau, Verification.verificationTetriminoZ1(tableau, col), col);

                    } else {
                        // Tetrimino Z
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 19);

                        Formes.tetriminoZ(tableau, Verification.verificationTetriminoZ(tableau, col), col);
                    }

                    // Tetrimino S
                } else {
                    System.out.println("La forme est le biais inversé. " + ConsoleColors.GREEN + "\n\n  **\n ** \n\n" + ConsoleColors.RESET);
                    System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n(sinon 0)");

                    int rotation = scanner.nextInt();

                    if (rotation == 1) {
                        // Tetrimino S rotation 90°
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 20);

                        Formes.tetriminoS1(tableau, Verification.verificationTetriminoS1(tableau, col), col);

                    } else {
                        // Tetrimino S
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > 19);

                        Formes.tetriminoS(tableau, Verification.verificationTetriminoS(tableau, col), col);
                    }
                }

                // Affichage du tableau à jour !
                Map.socle(tableau, colonne);

                // Verifie s'il n'y a aucune ligne remplie d'étoiles
                Point.lineDelete(tableau);

                // Détecte s'il y a une erreur de tableau qui depasse
            } catch (ArrayIndexOutOfBoundsException message) {
                // Si oui envoie message ainsi qu'error se transforme en true
                System.out.println("\nVous avez perdu avec " + ConsoleColors.YELLOW_BOLD + Point.resultat + ConsoleColors.RESET + " point(s) !");
                error = true;
            }

            // Tant qu'error est à false le code se re-lance
        }while(!error);
    }
}
