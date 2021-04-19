package com.company.tp2;

public class Taquin {

    Noeud etatInitial;
    Noeud etatSolution;


    public Taquin(int[][] etatInitial, int[][] etatSolution) {
        this.setEtatInitial(etatInitial);
        this.setEtatSolution(etatSolution);
    }

    /**
     * Return etatInitial
     *
     * @return etatInitial
     */
    public Noeud getEtatInitial() {
        return this.etatInitial;
    }

    /**
     * Set etatInitial
     *
     * @param etat
     */
    public void setEtatInitial(int[][] etat) {
        this.etatInitial = new Noeud(etat);
    }

    /**
     * Return etatSolution
     *
     * @return etatSolution
     */
    public Noeud getEtatSolution() {
        return this.etatSolution;
    }

    /**
     * Set etatSolution
     *
     * @param etat
     */
    public void setEtatSolution(int[][] etat) {
        this.etatSolution = new Noeud(etat);
    }
}
