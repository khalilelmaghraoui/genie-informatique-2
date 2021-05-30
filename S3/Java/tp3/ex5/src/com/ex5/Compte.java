package com.ex5;

public class Compte {
    String nom ;
    String prenom;
    int solde ;
    String motDePasse;

    public Compte(String nom, String prenom, int solde, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.solde = solde;
        this.motDePasse = motDePasse;
    }
    public void somme(int some){
        this.solde+=some;

    }
    public void retrait(int somme , String motDePasse) throws CodeIncorrect ,RetraitInterdit {
        if (!this.motDePasse.equals(motDePasse)) throw new CodeIncorrect();
        else {
            if (this.solde < somme) throw new RetraitInterdit();
            else
                this.solde-=somme;
        }
        }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}


