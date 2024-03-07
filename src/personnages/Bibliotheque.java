package personnages;

public class Bibliotheque {
	
	private  Ouvrage[] fonds;
	private int nbOuvrages=0;
	public Bibliotheque(int nbMaxOuvrages) {
		fonds = new Ouvrage[nbMaxOuvrages];
	}
	public Ouvrage[] getFonds() {
		return fonds;
	}
	public int getNbOuvrages() {
		return nbOuvrages;
	}
}
	