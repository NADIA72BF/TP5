
package in;

import java.util.Objects;

public abstract class Propriete {
	protected int id;
	protected Personne responsable ;
	protected String adresse;
	protected double surface;
	
	Propriete(int id,Personne r ,String a, double s ){
		this.id=id;
		adresse=a;
		surface=s;
		responsable=r;
	}
	public String toString () {
		return "la propriete n "+ id +"[ adresse : " + adresse + ", surface : " +
				surface + ", \n le responsable : " + responsable ;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Personne getResponsable() {
		return responsable;
	}
	public void setResponsable(Personne responsable) {
		this.responsable = responsable;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propriete other = (Propriete) obj;
		return Objects.equals(adresse, other.adresse) && id == other.id
				&& Objects.equals(responsable, other.responsable)
				&& Double.doubleToLongBits(surface) == Double.doubleToLongBits(other.surface);
	}
	public double getSurface() {
		return surface;
	}
	public void setSurface(double surface) {
		this.surface = surface;
	}
	public abstract double calculImpot();
	
}
