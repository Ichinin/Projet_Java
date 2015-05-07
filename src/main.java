
public class main {
	static public void main(String [] args){
		Velo v1 = new Velo(28,02,2015,11,30,100,90, 120);
//		v1.affiche();
		
		Course c1 = new Course(1,03,2015,20,00,10,180, "Montagne", "Pluie");
//		c1.affiche();
		
		Course c2 = new Course(3,05,2015,06,30,20,300,"Plage", "Soleil");
		 
		Agenda MyAgenda = new Agenda();
		MyAgenda.add(c1);
		MyAgenda.add(v1);
		MyAgenda.add(c2);
		
		MyAgenda.affiche(1);
		MyAgenda.longueseance().affiche();
		MyAgenda.courteseance().affiche();
		MyAgenda.distanceDsplne("course");
	}
}
