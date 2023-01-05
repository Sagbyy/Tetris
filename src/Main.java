public class Main {
    public static void main(String[] args) {

        // Affichage du menu d'introduction
        Introduction.introduction();

        // Création du tableau
        Array.createArray();

        // Saut de ligne pour épurer le texte
        System.out.println();

        // Appel la class DemandeForme avec sa fonction principale()
        DemandeForme.principale(Array.ARRAY);
    }
}