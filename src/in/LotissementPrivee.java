package in;

public class LotissementPrivee extends Lotissement {

	LotissementPrivee(int capacite) {
		super(capacite);
	}
	
	@Override
	public boolean ajouter(Propriete p) { 
		if (p instanceof proprietePrive && nombre < tabProp.length) {
        tabProp[nombre++] = p;
        return true;
    }
    return false; 
	}
	
	@Override
	Propriete getpropriétéByIndice (int i) {
		Propriete p=null;
		for(int j=0;j<tabProp.length;j++) {
			if(i==j && tabProp[i] instanceof proprietePrive ) {
				p=tabProp[j];
				break;
			}
		}
		return p;
	}
	
	 @Override
	 public int getnbPièces() {
	        int nbPP = 0;
	        for (int j = 0; j < nombre; j++) {
	            if (tabProp[j] instanceof proprietePrive) {
	                nbPP += ((proprietePrive) tabProp[j]).nbP;
	            }
	        }
	        return nbPP;
	}
		
}
