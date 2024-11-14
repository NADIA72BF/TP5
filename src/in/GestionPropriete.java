package in;

public interface GestionPropriete {
	
	public final int MAX_PROPRIETES =100;
	abstract void afficherProprietes();
	abstract boolean ajouter (Propriete p);
	abstract boolean supprimer (Propriete p);
	
}
