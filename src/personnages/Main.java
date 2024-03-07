// Assurez-vous que ce fichier est placé dans le bon répertoire suivant la structure de votre package
package personnages;

public class Main {
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 5);
        asterix.boirePotion(10); // Supposons que 10 est la force de la potion
        asterix.frapper("un Romain");
    }
}
