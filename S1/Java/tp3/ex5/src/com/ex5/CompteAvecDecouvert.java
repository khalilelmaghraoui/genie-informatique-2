package com.ex5;

public class CompteAvecDecouvert extends Compte {
    private  int decouvertAutorise;

    public CompteAvecDecouvert(String nom, String prenom, int solde, String motDePasse,int decovert) {
        super(nom, prenom, solde, motDePasse);
        this.decouvertAutorise=decovert;
    }
    public void retrait(int somme,String unMot) throws RetraitInterdit {
        if(somme>decouvertAutorise) throw new RetraitInterdit();
        else solde-=somme;
    }

}
