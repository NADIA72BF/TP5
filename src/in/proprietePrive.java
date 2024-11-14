
package in;

public class proprietePrive extends Propriete {
	int nbP;

	proprietePrive(int i,Personne r ,String a, double s , int nbP ) {
		super(i ,r, a, s);
		this.nbP=nbP;
	}
	
	public String toString () {
		System.out.println(super.toString());
		return " nb de pieces : " + nbP  ;
	}

	@Override
	public double calculImpot() {
		double sur=surface/100;
		return 50*sur+10*nbP ;
	}
	

}
