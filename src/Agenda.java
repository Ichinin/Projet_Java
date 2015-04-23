import java.util.ArrayList;

public class Agenda {
	private ArrayList<S�ance>  agenda;
	
	Agenda(){
		agenda = new ArrayList<S�ance>();
	}
	
	void affiche(int i){
		agenda.get(i).affiche();
	}
	
	void add(S�ance s){
		this.agenda.add(s);
	}
	
	S�ance longueseance(){
		int l = this.agenda.size();
		int laplulg = 0;
		for (int i = 0; i < (l-1); i++) {
			if(this.agenda.get(i).getDuree() <this.agenda.get(i+1).getDuree()){
				laplulg = i+1;
			}
		}
		return this.agenda.get(laplulg);
	}
	
	S�ance courteseance(){
		int l = this.agenda.size();
		int pluscrte = 0;
		for (int i = 0; i < (l-1); i++) {
			if(this.agenda.get(i).getDuree() > this.agenda.get(i+1).getDuree()){
				pluscrte= i+1;
			}
		}
		return this.agenda.get(pluscrte);
	}
	
	void distanceDsplne(String type){
		int distance= 0;
		int l = this.agenda.size();
		for (int i = 0; i < l; i++) {
			if(this.agenda.get(i).getType() == type){
				distance += this.agenda.get(i).getDistance();
			}
		}
		
		System.out.println("La dur�e totale parcourue en "+type+ " est de "+distance+" kms.");
	}
}
