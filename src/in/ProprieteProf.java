
package in;

public class ProprieteProf extends Propriete {
	int nbE;
	boolean estEtatique;

	ProprieteProf(int i , Personne r, String a, double s,int nbE , 
			boolean estEtatique) {
		super(i , r, a, s);
		this.nbE=nbE;
		this.estEtatique=estEtatique ;
	}
	
	public String toString () {
		System.out.println(super.toString());
		return " nb d'Etage : " + nbE 
				+ " , Etatique : " + estEtatique +" ] " ;
	}

	public double calculImpot() {
		if(estEtatique) {
			return 0;
		}
		else {
			double su=surface/100;
			return 100*su +30*nbE;
		}
	}
	
}
