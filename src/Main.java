import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Main {
    public static void main(String[] args) {
        int totalMots = 0;
        int totalLignes = 0;

        try {
            // Ouvrir le fichier (placez-le dans le dossier du projet)
            File file = new File("texte.txt");
            Scanner fileScanner = new Scanner(file);

            // Lire ligne par ligne
            while (fileScanner.hasNextLine()) {
                String ligne = fileScanner.nextLine();
                totalLignes++;

                // Ignorer les lignes vides
                if (!ligne.trim().isEmpty()) {
                    // Découper la ligne en mots (1+ espaces comme délimiteur)
                    String[] mots = ligne.trim().split("\\s+");
                    totalMots += mots.length;
                }
            }

            fileScanner.close();

            // Afficher les résultats
            System.out.println("=== Résultats ===");
            System.out.println("Lignes lues   : " + totalLignes);
            System.out.println("Total de mots : " + totalMots);

        } catch (FileNotFoundException e) {
            System.out.println("Erreur : fichier 'texte.txt' introuvable.");
            System.out.println("Vérifiez son emplacement dans le projet.");
        }
    }
}