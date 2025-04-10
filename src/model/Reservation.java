package model;

public abstract class Reservation {
	private int jour;
	private int mois;

	protected Reservation(int jour, int mois) {
		super();
		this.jour = jour;
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}
	

}
