package model;

public abstract class EntiteReservable <T extends Formulaire>{
	CalendrierAnnuel calendrier;
	int identification;
	
	public int getIdentification() {
		return identification;
	}
	
	public void setCalendrier(CalendrierAnnuel calendrier) {
		this.calendrier = calendrier;
	}
	
	public boolean estLibre(T formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return calendrier.estLibre(jour, mois);
	}
	
	public abstract boolean compatible(T formulaire);
//	{
//		int jour = formulaire.getJour();
//		int mois = formulaire.getMois();
//		return calendrier.reserver(jour, mois);
//	}
//	
	public abstract Reservation reserver(T formulaire);
//	{
//		Reservation nvRes = null;
//		int jour = formulaire.getJour();
//		int mois = formulaire.getMois();
//		if (compatible(formulaire)) {
//			nvRes = new Reservation(jour, mois);
//		}
//		return nvRes;
//	}
	
	
}
