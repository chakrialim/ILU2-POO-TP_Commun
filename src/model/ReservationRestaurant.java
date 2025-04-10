package model;

public class ReservationRestaurant extends Reservation {
	private int numTable;
	private int numService;

	protected ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
	}

}
