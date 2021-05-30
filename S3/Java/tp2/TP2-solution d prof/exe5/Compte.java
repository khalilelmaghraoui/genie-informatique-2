package exe5;

public class Compte {
	private int numCompte;
	private float solde;	
	//Personne personne;
	
	
	public Compte(int numCompte, float solde) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		//this.personne = personne;
	}


	public int getNumCompte() {
		return numCompte;
	}


	public float getSolde() {
		return solde;
	}


	/*public Personne getPersonne() {
		return personne;
	}*/


	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}


	public void setSolde(float solde) {
		this.solde = solde;
	}


	/*public void setPersonne(Personne personne) {
		this.personne = personne;
	}
*/
	public String getInf() {
		return " "+numCompte+" "+solde;
	}

	public static void main(String[] args) {
		/*Compte compte=new Compte(12,1548f, new Personne("ali",12548));
		System.out.println(compte.getInf());*/
		
		// TODO Auto-generated method stub

	}

}
