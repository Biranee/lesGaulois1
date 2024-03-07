package personnages;

public class Romain {

	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	public String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
	    this.force -= forceCoup; // Simulez la diminution de la résistance en fonction de la force du coup
	    if (this.force <= 0) {
	        System.out.println("Le romain " + nom + " : « J'abandonne...»");
	    } else {
	        System.out.println("Le romain " + nom + " : « Aïe»");
	    }
	}


	public void frapper(String string) {
		// TODO Auto-generated method stub
		
	}

}
