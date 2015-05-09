import java.util.EventObject;
import java.util.GregorianCalendar;

public class NewTrainingEvent extends EventObject {
	
	private GregorianCalendar date;
	private String nom_sportif;
	private int Creneau;
	
	public NewTrainingEvent(Object arg0, GregorianCalendar date, String nom_sportif, int Creneau){
		super(arg0);
		
		this.date = date;
		this.nom_sportif = nom_sportif;
		this.Creneau = Creneau;
	}

}
