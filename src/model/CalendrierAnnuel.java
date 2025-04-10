package model;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12];

	public CalendrierAnnuel() {
		calendrier[0] = new Mois("Janvier", 31);
		calendrier[1] = new Mois("Fevrier", 28);
		calendrier[2] = new Mois("Mars", 31);
		calendrier[3] = new Mois("Avril", 30);
		calendrier[4] = new Mois("Mai", 31);
		calendrier[5] = new Mois("Juin", 30);
		calendrier[6] = new Mois("Juillet", 31);
		calendrier[7] = new Mois("Aout", 31);
		calendrier[8] = new Mois("Septembre", 30);
		calendrier[9] = new Mois("Octobre", 31);
		calendrier[10] = new Mois("Novembre", 30);
		calendrier[11] = new Mois("Decembre", 31);
		
	}
	
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	public boolean reserver(int jour, int mois) {
		boolean result = false;
		if(estLibre(jour, mois)) {
			calendrier[mois-1].reserver(jour);
			result = true;
		}
		return result;
	}
	
	private static class Mois{
		private String nom;
		private boolean[] jours;
		
		public Mois (String nom, int nbJours) {
			this.nom = nom;
			jours = new boolean[nbJours];
			for (int i = 0; i < jours.length; i++) {
				jours[i] = true;
				
			}
			
		}
		
		public boolean estLibre(int jour) {
			return jours[jour-1];
		}
		
		public void reserver(int jour) {
			jours[jour-1] = false;
		}
	}
	
	
	
	
	
	
}
