package com.ex5;

public class Main {

    public static void main(String[] args) throws  RetraitInterdit ,CodeIncorrect {
        Compte compte = new Compte("el maghraoui "," khalil",10000,"2020khalil");
        System.out.println("votre nom " + compte.nom + "  votre prenom " + compte.prenom
                   + "  votre solde " + compte.getSolde()
                   + "   votre Mote de Pass " + compte.getMotDePasse()
        );
        compte.somme(500);

//      System.out.println("votre solde " + compte.getSolde());
//      compte.retrait(400,"incorrect");

        compte.retrait(300,"2020khalil");
        System.out.println("votre solde " + compte.solde);



    }
}
