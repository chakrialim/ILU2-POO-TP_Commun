package model;

public class FormulaireRestaurant extends Formulaire{
	private int nombrePersonnes;
	private int numService;
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
		super(jour, mois, 0);
		this.nombrePersonnes = nbPersonnes;
		this.numService = numService;
	}
	public int getNombrePersonnes() {
		return nombrePersonnes;
	}
	
	public void setNombrePersonnes(int nombrePersonnes) {
		this.nombrePersonnes = nombrePersonnes;
	}
	
	public int getNumService() {
		return numService;
	}
	
	public void setNumService(int numService) {
		this.numService = numService;
	}
	
	
	@Override
	public String toString() {
		return "Le "+ super.getJour() + "/" + super.getMois() +"\nTable "+super.getIdentificationEntite()+" pour le " + numService + " service.";
	}

	
}
