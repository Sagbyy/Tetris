import java.util.Scanner;

public class DemandeForme {
    public static void principale(String[][] tableau, int colonne) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        // Couleurs des formes
        String color = ConsoleColors.RESET;

        // Affichage du tableau vide
        Map.socle(tableau, colonne, color);

        // Déclaration de la variable col
        int col;

        // Déclaration de la variable rotation
        int rotation;

        // Déclaration de la variable d'erreur en false
        boolean error = false;

        // Boucle du jeu
        do {
            // Choisit aléatoirement des formes
            int f = 1 + (int)(Math.random() * ((7 - 1 + 1) + 1));
//            int f = 1;
            // Essaye le code pour attraper une erreur
            try {
                // Choix d'une des 7 formes
                switch(f){// Forme 1 = Tetrimino I
                    case 1:
                        System.out.println("La forme est la barre. " + ConsoleColors.CYAN + "\n\n **** \n\n" + ConsoleColors.RESET);
                        // Demande si le joueur souhaite tourner la forme
                        do{
                            System.out.print("Appuyez sur 1 pour mettre la barre verticalement\n(sinon 0): ");
                            rotation = scanner.nextInt();
                        }while (rotation!=0 && rotation!=1);

                        // Tetrimino I rotation 90°
                        if (rotation == 1) {
                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.print("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOIROTA + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOIROTA);

                            Formes.tetriminoI1(tableau, VerificationFormes.verificationTetriminoI1(tableau, col), col);

                        } else {
                            // Tetrimino I
                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.print("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOI + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOI);

                            Formes.tetriminoI(tableau, VerificationFormes.verificationTetriminoI(tableau, col), col);
                        }

                        // Couleur de la forme
                        color = ConsoleColors.CYAN;
                        break;

                    case 2:// Forme 2 = Tetrimino O

                        System.out.println("La forme est le cube. " + ConsoleColors.YELLOW_BRIGHT + "\n\n **\n ** \n\n" + ConsoleColors.RESET);
                        // Demande d'une colonne en fonction de la forme
                        do {
                            System.out.print("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOO + " inclus : ");
                            col = scanner.nextInt();
                        } while (col < 0 || col > ParametresFormes.TETRIMINOO);

                        Formes.tetriminoO(tableau, VerificationFormes.verificationTetriminoO(tableau, col), col);

                        // Couleur de la forme
                        color = ConsoleColors.YELLOW_BRIGHT;
                        break;

                    case 3:// Forme 3 = Tetrimino T

                        System.out.println("La forme est le T. " + ConsoleColors.PURPLE + "\n\n ***\n  * \n\n" + ConsoleColors.RESET);
                        // Demande si le joueur souhaite tourner la forme
                        do{
                            System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n2 pour tourner la forme de 180°\n3 pour tourner la forme de 270°\n(sinon 0)");
                            rotation = scanner.nextInt();
                        }while (rotation < 0 || rotation > 3);


                        // Tetrimino T rotation 90°
                        if (rotation == 1) {
                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOTROTA + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOTROTA);

                            Formes.tetriminoT1(tableau, VerificationFormes.verificationTetriminoT1(tableau, col), col);

                        } else if (rotation == 2) {
                            // Tetrimino T rotation 180°
                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOT + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOT);

                            Formes.tetriminoT2(tableau, VerificationFormes.verificationTetriminoT2(tableau, col), col);

                        } else if (rotation == 3) {
                            // Tetrimino T rotation 270°
                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOTROTA + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOTROTA);

                            Formes.tetriminoT3(tableau, VerificationFormes.verificationTetriminoT3(tableau, col), col);

                        } else {
                            // Tetrimino T
                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOT + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOT);

                            Formes.tetriminoT(tableau, VerificationFormes.verificationTetriminoT(tableau, col), col);
                        }

                        // Couleur de la forme
                        color = ConsoleColors.PURPLE;
                        break;

                    case 4:// Forme 4 = Tetrimino L

                        System.out.println("La forme est le L . " + ConsoleColors.YELLOW_BRIGHT + "\n\n ***\n * \n\n" + ConsoleColors.RESET);
                        // Demande si le joueur souhaite tourner la forme
                        do{
                            System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n2 pour tourner la forme de 180°\n3 pour tourner la forme de 270°\n(sinon 0)");
                            rotation = scanner.nextInt();
                        }while (rotation < 0 || rotation>3);


                        // Tetrimino L rotation 90°
                        if (rotation == 1) {
                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOLROTA + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOLROTA);

                            Formes.tetriminoL1(tableau, VerificationFormes.verificationTetriminoL1(tableau, col), col);

                            // Tetrimino L rotation 180°
                        } else if (rotation == 2) {
                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOL + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOL);

                            Formes.tetriminoL2(tableau, VerificationFormes.verificationTetriminoL2(tableau, col), col);

                            // Tetrimino L rotation 270°
                        } else if (rotation == 3) {

                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOLROTA + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOLROTA);

                            Formes.tetriminoL3(tableau, VerificationFormes.verificationTetriminoL3(tableau, col), col);

                            // Tetrimino L
                        } else {

                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOL + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOL);

                            Formes.tetriminoL(tableau, VerificationFormes.verificationTetriminoL(tableau, col), col);
                        }

                        // Couleur de la forme
                        color = ConsoleColors.YELLOW;
                        break;

                    case 5:// Forme 5 = Tetrimino J

                        System.out.println("La forme est le L inversé. " + ConsoleColors.BLUE + "\n\n ***\n   * \n\n" + ConsoleColors.RESET);
                        // Demande si le joueur souhaite tourner la forme
                        do{
                            System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n2 pour tourner la forme de 180°\n3 pour tourner la forme de 270°\n(sinon 0) ");
                            rotation = scanner.nextInt();
                        }while (rotation < 0 || rotation > 3);


                        // Tetrimino J rotation 90°
                        if (rotation == 1) {
                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOJROTA + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOJROTA);

                            Formes.tetriminoJ1(tableau, VerificationFormes.verificationTetriminoJ1(tableau, col), col);

                            // Tetrimino J rotation 180°
                        } else if (rotation == 2) {

                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOJ + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOJ);

                            Formes.tetriminoJ2(tableau, VerificationFormes.verificationTetriminoJ2(tableau, col), col);

                            // Tetrimino J rotation 270°
                        } else if (rotation == 3) {

                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOJROTA + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOJROTA);

                            Formes.tetriminoJ3(tableau, VerificationFormes.verificationTetriminoJ3(tableau, col), col);

                            // Tetrimino J
                        } else {

                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et " + ParametresFormes.TETRIMINOJ + " inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > ParametresFormes.TETRIMINOJ);

                            Formes.tetriminoJ(tableau, VerificationFormes.verificationTetriminoJ(tableau, col), col);
                        }

                        // Couleur de la forme
                        color = ConsoleColors.BLUE;
                        break;

                    case 6:// Tetrimino Z

                        System.out.println("La forme est le biais. " + ConsoleColors.RED + "\n\n **\n  ** \n\n" + ConsoleColors.RESET);
                        // Demande si le joueur souhaite tourner la forme
                        do{
                            System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n(sinon 0)");
                            rotation = scanner.nextInt();
                        }while (rotation != 0 && rotation != 1);


                        if (rotation == 1) {
                            // Tetrimino Z rotation 90°
                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > 20);

                            Formes.tetriminoZ1(tableau, VerificationFormes.verificationTetriminoZ1(tableau, col), col);

                        } else {
                            // Tetrimino Z
                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > 19);

                            Formes.tetriminoZ(tableau, VerificationFormes.verificationTetriminoZ(tableau, col), col);
                        }

                        // Couleur de la forme
                        color = ConsoleColors.RED;
                        break;

                    case 7:// Tetrimino S
                        System.out.println("La forme est le biais inversé. " + ConsoleColors.GREEN + "\n\n  **\n ** \n\n" + ConsoleColors.RESET);
                        do{
                            System.out.println("Appuyez sur:\n1 pour tourner la forme de 90°\n(sinon 0)");
                            rotation = scanner.nextInt();
                        }while (rotation!=0 && rotation!=1);



                        if (rotation == 1) {
                            // Tetrimino S rotation 90°
                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 20 inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > 20);

                            Formes.tetriminoS1(tableau, VerificationFormes.verificationTetriminoS1(tableau, col), col);

                        } else {

                            // Demande d'une colonne en fonction de la forme
                            do {
                                System.out.println("Veuillez sélectionner une colonne comprise entre 0 et 19 inclus : ");
                                col = scanner.nextInt();
                            } while (col < 0 || col > 19);

                            Formes.tetriminoS(tableau, VerificationFormes.verificationTetriminoS(tableau, col), col);
                        }

                        // Couleur de la forme
                        color = ConsoleColors.GREEN;
                        break;
                }

                // Affichage du tableau à jour !
                Map.socle(tableau, colonne, color);

                // Couleurs des formes
                color = ConsoleColors.RESET;

                // Verifie s'il n'y a aucune ligne remplie d'étoiles
                Point.lineDelete(tableau);

                // Détecte s'il y a une erreur de tableau qui depasse
            } catch (Exception message) {
                // Si oui envoie message ainsi qu'error se transforme en true
                System.out.println("\nVous avez perdu avec " + ConsoleColors.YELLOW_BOLD + Point.resultat + ConsoleColors.RESET + " point(s) !");
                error = true;
            }
            // Tant qu'error est à false le code se re-lance
        }while(!error);
    }
}
