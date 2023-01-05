import java.util.Scanner;

public class Introduction {

    public static int numberColumn;

    public static void introduction() {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        // Affichage du logo TETRIS en ASCii
        System.out.println(ConsoleColors.YELLOW +  "___________     __         .__\n" +
                "\\__    ___/____/  |________|__| ______\n" +
                "  |    |_/ __ \\   __\\_  __ \\  |/  ___/\n" +
                "  |    |\\  ___/|  |  |  | \\/  |\\___ \\ \n" +
                "  |____| \\____/|__|  |__|  |__/_____/\n" +
                "\n" + ConsoleColors.RESET);

        System.out.println("Bienvenue dans le monde de tetris, développer par Ayoub et Salah !");
        System.out.println("Les commandes du jeu sont très simple, lorsque vous tomber sur une forme aléatoire, le programme vous demandera une rotation pour la forme. \nEnsuite il faut choisir avec des nombre entier les numéros de colonne. \nL'objectif est de gagner le plus de points en remplissant entièrement des lignes avec les" +
                ConsoleColors.YELLOW + " Tétriminos " +
                ConsoleColors.RESET + ", pour chaque lignes remplis vous gagnerez" +
                ConsoleColors.YELLOW_BOLD + " 50 " +
                ConsoleColors.RESET + "points !\n");
        System.out.println("Mais comment choisir la colonne avec une forme qui mesure plusieurs colonne ? \nC'est très simple, il s'agit simplement de choisir la colonne de la forme qui est le plus à gauche comme ci-dessous :");
        System.out.println("  \n\n " + ConsoleColors.RED + "*" + ConsoleColors.RESET + "**\n " + ConsoleColors.RED + "* \n\n" + ConsoleColors.RESET);
        System.out.print("Désormais entrer 'GO' pour lancer le jeu ! : ");

        // Variable de la reponse de l'utilisateur
        String responseGo = scanner.nextLine();

        while(!responseGo.equals("GO") && !responseGo.equals("go")) {
            System.out.println("\nTu ne veux pas jouer serieux ?");
            System.out.print("Allez lance le jeu avec 'GO' : ");
            responseGo = scanner.nextLine();
        }

        // Choix du nombre de colonnes
        System.out.print("\nChoisissez le nombre de colonne (minimum 11): ");
        numberColumn = scanner.nextInt();

        while(numberColumn < 10) {
            System.out.println("\nNon, désolée mais c'est impossible de choisir " + numberColumn + " colonne(s)");
            System.out.print("Choisissez le nombre de colonne (minimum 11) : ");
            numberColumn = scanner.nextInt();
        }
    }
}
