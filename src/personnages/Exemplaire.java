package personnages;

public class Exemplaire {
	private String cote;
	private boolean disponible = true;
	private boolean consultableEnLigne = true;

	public Exemplaire(String cote) {
		this.cote = cote;
	}

	// Getters
	public String getCote() {
		return cote;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public boolean isConsultableEnLigne() {
		return consultableEnLigne;
	}
}
