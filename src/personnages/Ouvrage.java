package personnages;

public class Ouvrage {
	private static final int nbMaxExemplaires = 50;
	private String titre;
	private String[] auteurs;
	private String editeur;
	private int annee;
	private String numeroISBN;
	private Exemplaire[] exemplaires = new Exemplaire[nbMaxExemplaires];
	private int nbExemplaires = 0;

	public Ouvrage(String titre, String[] auteurs, String editeur, int annee, String numeroISBN) {
		this.titre = titre;
		this.auteurs = auteurs;
		this.editeur = editeur;
		this.annee = annee;
		this.numeroISBN = numeroISBN;
	}

	public void ajouterExemplaire(Exemplaire ex) {
		if (nbExemplaires < nbMaxExemplaires) {
			exemplaires[nbExemplaires++] = ex;
		} else {
			System.out.println("Impossible d'ajouter l'exemplaire : capacité maximale atteinte.");
		}
	}

	public String getTitre() {
		return titre;
	}

	public String[] getAuteurs() {
		return auteurs;
	}
	
	
}
