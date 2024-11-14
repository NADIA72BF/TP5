package in;

public class Fiscalite {
	public static void main(String[] args) {
		Personne p1 = new Personne (144521,"nadia","ben fadhel");
		Personne p2 = new Personne (14545,"eya","aa");
		Personne p3 = new Personne (14789 , "salma" , "bb");
		
		Lotissement l = new Lotissement (10);
		
		l.ajouter(new proprietePrive(1, p1, "Corniche", 350, 4));
        l.ajouter(new villa(2, p2, "Dar Chaabane", 400, 6, true));
        l.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 3));
        l.ajouter(new ProprieteProf(4, p3, "Korba", 1000, 50, true));
        l.ajouter(new ProprieteProf(5, p1, "Bir Bouragba", 2500, 400, false));
        
        System.out.println("Liste des proprietes : \n ");
        l.afficherProprietes();
        
        System.out.println("\nNombre total de pieces pour les proprietes privees : " + l.getnbPièces());
        
        double minImpot = Double.MAX_VALUE;
        proprietePrive proprieteMinImpot = null;
        
        for (int i = 0; i < l.getnbPièces(); i++) {
            Propriete prop = l.getpropriétéByIndice(i);
            if (prop instanceof proprietePrive) {
                double impot = prop.calculImpot();
                if (impot < minImpot) {
                    minImpot = impot;
                    proprieteMinImpot = (proprietePrive) prop;
                }
            }
        }

        if (proprieteMinImpot != null) {
            System.out.println("\nPropriete privee avec le moins d'impots :");
            System.out.println("Proprietaire : " + ((Propriete) proprieteMinImpot).getResponsable().getNom() + " " +
                               proprieteMinImpot.getResponsable().getPrenom());
            System.out.println("Montant des impots : " + minImpot + " DT");
        }
        
        Propriete appartementHammamet = new Appartement(3, p2, "Hammamet", 1200, 8, 3);
        l.supprimer(appartementHammamet);
        
        System.out.println("\nListe des proprietes apres suppression de l'appartement à Hammamet :");
        l.afficherProprietes();
        
        System.out.println("\n********************\n");
        Lotissement lt= new LotissementPrivee(10);
        
        lt.ajouter(new proprietePrive(1, p1, "Corniche", 350, 4));
        lt.ajouter(new villa(2, p2, "Dar Chaabane", 400, 6, true));
        lt.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 3));
        
        System.out.println("liste de it (le lotissement privee : \n ");
        lt.afficherProprietes();

        System.out.println("\nNombre total de pieces pour les proprietes privees : " + lt.getnbPièces());
        proprietePrive prop = (proprietePrive) lt.getpropriétéByIndice(1);
        System.out.println("\nDetails de la propriete privee a l'indice 1 : \n");
        System.out.println(prop.toString());
	}
}
