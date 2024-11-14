package in;

public class villa extends proprietePrive {
	boolean avecPiscine;
	
	villa(int i ,Personne r, String a, double s,  int nbP ,
		boolean avecPiscine ) {
		super(i , r, a, s, nbP);
		this.avecPiscine= avecPiscine;
	}
	
	public String toString () {
		System.out.println(super.toString());
		return " piscine : " + avecPiscine ;
	}
	
	
	public double calculImpot() {
		double d = super.calculImpot();
		if(avecPiscine) {
			return d+200;
		}
		else {
			return d;
		}
	}

}
