import java.util.GregorianCalendar;


public class Natation extends Séance {
		private GregorianCalendar date; 
		int duree;
		private String Type = "";
		private int distance;
		String _n = System.getProperty("line.separator");
		
		public Natation(int jour, int mois, int annee, int heure, int minute){
			date = new GregorianCalendar(annee, mois, jour, heure, minute, 0 );
		}
		public Natation(int jour, int mois, int annee, int heure, int minute, int duree, int distance){
			this(jour, mois, annee, heure, minute);
			this.duree = duree;
			this.distance = distance;
		}
		

		public GregorianCalendar getDate() {
			return date;
		}
		public void setDate(GregorianCalendar date) {
			this.date = date;
		}

		public int getDuree() {
			return duree;
		}
		public void setDuree(int duree) {
			this.duree = duree;
		}
		public int getDistance() {
			return distance;
		}
		public void setDistance(int distance) {
			this.distance = distance;
		}
		public String getType() {
			return  Type;
		}
		public void setType(String type) {
			Type = type;
		}

		public void affiche(){
			// Je te laisse t'occuper de l'affichage de la date System.out.println("SÃ©ance du " + this.date.get(GregorianCalendar.DAY_OF_MONTH) + "/" + this.date.get(GregorianCalendar.MONTH) + "/"+ this.date.get(GregorianCalendar.YEAR) +" de type natation :");
			System.out.println("Distance totale parcourue : "+this.distance+" m.");
			System.out.println("Duree : "+this.duree + " minutes.");
			System.out.println("Type de nage : "+this.Type+".");
		}
		
		
	}



