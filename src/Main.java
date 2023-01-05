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

        while(!response.equals("GO") && !response.equals("go")) {
            System.out.println("\nTu ne veux pas jouer serieux ?");
            System.out.print("Allez lance le jeu avec 'GO' : ");
            response = scanner.nextLine();
        }

        // Saut de ligne pour épurer le texte
        System.out.println();

        // Appel la class DemandeForme avec sa fonction principale()
        DemandeForme.principale(Array.ARRAY, Array.COLONNEARRAY);
    }
}