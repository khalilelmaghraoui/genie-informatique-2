package exe1;

public class Banque {
	int NCompte;
    float Solde;
    String CIN;
    @Override
	public String toString() {
		return "Banque [NCompte=" + NCompte + ", Solde=" + Solde + ", CIN=" + CIN + "]";
	}
	public Banque(int NCompte,float Solde,String CIN){
        this.NCompte=NCompte;
        this.Solde=Solde;        
        this.CIN=CIN;
    }
    public int getNCompte(){
        return NCompte;
    }
    public void deposer(float Somme){
        Solde=Solde+Somme;
    }
    public void retirer(float Somme){
        if(Solde<Somme)
                     System.out.println("SOLDE INSUFFISANT");
        else
        Solde=Solde-Somme;
    }
    public float avoirSolde(){
        return Solde;
    }
    public String avoirInf(){
        return("N° carte:"+CIN+ "\nsolde:"+Solde + "NCompte"+NCompte);
   }


}
