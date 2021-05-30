package exe6;

public class Materiel implements Produit{
	
	private String designation;
	private float prixUnitaire;
	private float quantite;
	
		
	public Materiel(String designation, float prixUnitaire, float quantite) {
		super();
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
	}
	public String getDesignation() {
		return designation;
	}
	public float getPrixUnitaire () {
		return prixUnitaire;
	}
	public float getQuantité() {
		return quantite;
	}
	public char getNature() {
		return 'M';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
