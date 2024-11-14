package in;


public class Lotissement implements GestionPropriete{
	
	protected Propriete [] tabProp;
	protected int nombre;
	
	Lotissement(int capacite){
		if(capacite<MAX_PROPRIETES) {
			this.tabProp = new Propriete [capacite];
			this.nombre=0;
		}
		else {
			System.out.println("le nb depasse la capacite ");
		}
	} 


	@Override
	public void afficherProprietes() {
		for(int i=0 ; i<nombre ; i++) {
			if(tabProp[i]!=null) {
			System.out.println(tabProp[i].toString());
			System.out.println("valeur des impots a payer : " + tabProp[i].calculImpot()+ " \n ") ;
		}
		}
	}

	@Override
	public boolean ajouter(Propriete p) {
		if(nombre < tabProp.length) {
			tabProp[nombre++]=p;
			return true;
		}
		return false;
	}

	@Override
	public boolean supprimer(Propriete p) {
	    for (int i = 0; i < nombre; i++) {
	        if ( tabProp[i].equals(p)) {
	            for (int j = i; j < nombre - 1; j++) {
	                tabProp[j] = tabProp[j + 1];
	            }
	            tabProp[nombre - 1] = null;
	            nombre--; 
	            return true; 
	        }
	    }
	    return false; 
	}



	Propriete getpropriétéByIndice (int i) {
		Propriete p=null;
		for(int j=0;j<tabProp.length;j++) {
			if(i==j) {
				p=tabProp[j];
				break;
			}
		}
		return p;
	}
	int getnbPièces() {
		int nbPP=0;
		for(int j=0;j<tabProp.length;j++) {
			if (tabProp[j] instanceof proprietePrive) {
				nbPP += ((proprietePrive) tabProp[j]).nbP;
			}
		}
		return nbPP;
	}
}
