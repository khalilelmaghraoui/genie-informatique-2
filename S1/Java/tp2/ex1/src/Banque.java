public class Banque {

    private int NCompte;
    private float solde ;
    private String CIN;

    public Banque(int NCompte, float solde, String CIN) {
        this.NCompte = NCompte;
        this.solde = solde;
        this.CIN = CIN;
    }

    public void deposer(float Somme){
        solde +=Somme;
    }
    public void retirer(float Somme ){
        if(Somme <= solde ){
            solde -=Somme;
            System.out.println("votre solde  = " +solde);
        }
        else
            System.out.println("Invalid Number");
    }
    public  float avoirSolde(){
        return solde;
    }
    public  String avoirInf(){
        System.out.println("NCOMOPTE = " + NCompte +
             "\n VOTRE SOLDE =  " + solde +
             " \n votre Cin = " + CIN );

        return CIN;
    }

}

