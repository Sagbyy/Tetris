import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Déclaration du Scanner
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        // Création du tableau
        Array.createArray();

        // Affichage du menu d'introduction
        Introduction.introduction();

        // Variable de la reponse de l'utilisateur
        String response = scanner.nextLine();

        while(!response.equals("GO")) {
            System.out.println("\nTu ne veux pas jouer serieux ?");
            System.out.print("Allez lance le jeu avec 'GO' : ");
            response = scanner.nextLine();
        }

        DemandeForme.princpale(Array.ARRAY, Array.COLONNEARRAY);
    }
}