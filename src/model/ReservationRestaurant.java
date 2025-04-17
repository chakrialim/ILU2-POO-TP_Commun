package model;

public class ReservationRestaurant extends Reservation {
	private int numTable;
	private int numService;

	protected ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
	}

	private String stringNumService() {
		String texte;
		switch (numService) {
		case 1:
			texte = "premier";
			break;

		default:
			texte = "deuxi�me";
		}
		return texte;
	}
	
	@Override
	public String toString() {
		return "Le " + super.getJour()+"/"+super.getMois()+"\nTable "+numTable+" pour le "+stringNumService()+" service." ;
	}

}
