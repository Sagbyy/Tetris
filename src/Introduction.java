public class Introduction {
    public static void introduction() {
        // Affichage du logo TETRIS en ASCii
        System.out.println(ConsoleColors.YELLOW +  "___________     __         .__\n" +
                "\\__    ___/____/  |________|__| ______\n" +
                "  |    |_/ __ \\   __\\_  __ \\  |/  ___/\n" +
                "  |    |\\  ___/|  |  |  | \\/  |\\___ \\ \n" +
                "  |____| \\____/|__|  |__|  |__/_____/\n" +
                "\n" + ConsoleColors.RESET);

        System.out.println("Bienvenue sur le monde de tetris, développer par Ayoub et Salah !");
        System.out.println("Les commandes du jeu sont très simple, lorsque vous tomber sur une forme aléatoire, le programme vous demandera une rotation pour la forme. Ensuite il faut choisir avec des nombre entier les numéros de colonne.");
        System.out.println("Mais comment choisir la colonne avec une forme qui mesure plusieurs colonne ? C'est très simple, il s'agit simplement de choisir la colonne de la forme qui est le plus à gauche comme ci-dessous :");
        System.out.println("  \n\n " + ConsoleColors.RED + "*" + ConsoleColors.RESET + "**\n " + ConsoleColors.RED + "* \n\n" + ConsoleColors.RESET);
        System.out.print("Désormais entrer 'GO' pour lancer le jeu ! : ");
    }
}
