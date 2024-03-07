package personnages;

import java.util.Random;

public class Druide {

	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public void preparerPotion() {
		Random random = new Random(); // Crée un nouvel objet Random
		forcePotion = effetPotionMin + random.nextInt(effetPotionMax - effetPotionMin + 1);
		if (forcePotion > 7) {
			System.out.println("J'ai préparé une super potion de force " + forcePotion + ".");
		} else {
			System.out.println(
					"Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion + ".");
		}
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";

	}

	public void booster(Gaulois gaulois) {
		if ("Obélix".equals(gaulois.getNom())) {
			System.out.println("Non, Obélix !... Tu n’auras pas de potion magique !");
		} else {
			gaulois.boirePotion(forcePotion);
			System.out.println("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
		}
	}

	public static void main(String[] args) {
		Druide panoramix = new Druide("panoramix", 5, 10); // Crée le druide Panoramix avec des valeurs de potion entre
															// 5 et 10

		// Teste la méthode preparerPotion plusieurs fois
		for (int i = 0; i < 5; i++) { // Lancer le test 5 fois pour voir la variabilité de la force de la potion
			panoramix.preparerPotion();
		}
	}

	public void parler() {
		// TODO Auto-generated method stub
		
	}

	

}
