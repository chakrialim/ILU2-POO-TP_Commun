package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int identificationEntite;

	protected Formulaire(int jour, int mois, int numeroEntite) {
		this.jour = jour;
		this.mois = mois;
		this.identificationEntite = numeroEntite;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getIdentificationEntite() {
		return identificationEntite;
	}

	public void setIdentificationEntite(int numeroEntite) {
		this.identificationEntite = numeroEntite;
	}
}
