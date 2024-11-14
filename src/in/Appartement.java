package in;

public class Appartement extends proprietePrive {
	int numEtage;
	
	Appartement(int i, Personne r, String a, double s,  int nbP ,
		int numEtage) {
		super(i , r, a, s, nbP);
		this.numEtage=numEtage;
	}
	
	public String toString () {
		System.out.println(super.toString());
		return " numero d'Etage : " + numEtage +" ] " ;
	}

}
