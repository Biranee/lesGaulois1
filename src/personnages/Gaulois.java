package personnages;

public class Gaulois {

	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + " « " + texte + " » ");
	}

	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Gaulois cible) {
	    int forceDuCoup = (this.force / 3) * this.effetPotion;
	    System.out.println(nom + " frappe " + cible.nom + " avec une force de " + forceDuCoup + ".");
	    }

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetpotion=" + effetPotion + "]";
	}

	public void frapper(String string) {
		// TODO Auto-generated method stub
		
	}
	
	public void boirePotion(int forcePotion) {
	    if ("Obélix".equals(this.nom)) {
	        System.out.println("Le druide Panoramix : « Non, Obélix !... Tu n'auras pas de potion magique !»");
	    } else {
	        this.effetPotion = forcePotion;
	        System.out.println(this.nom + " boit la potion et sa force devient " + (this.force * this.effetPotion) + ".");
	    }
	}


	public static void Main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);

		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");

		asterix.frapper(minus); // Premier coup
		asterix.frapper(minus); // Deuxième coup
		asterix.frapper(minus);
        asterix.boirePotion(5);
        
        }

	public void parler() {
		// TODO Auto-generated method stub
		
	}

		

}