package com.company.tp2;

import java.util.ArrayList;

public class Noeud implements Cloneable,Comparable {
    int g;
    int h;
    int f;
    int[][] etat;
    Noeud parent;
    ArrayList<Noeud> fils;

    /**
     * Constructor
     *
     * @param state
     */
    public Noeud(int[][] state) {
        this.setEtat(state);
        this.fils = new ArrayList<Noeud>();
    }

    /**
     * Constructor
     *etat
     * @param
     */
    public Noeud(Noeud etat) {
        this.setEtat(etat.getEtat());
        this.setParent(etat.getParent());
        this.setG(etat.getG());
        parent=null;
        this.fils = new ArrayList<Noeud>();
    }

    /**
     * Constructor
     */
    public Noeud() {
        this.setG(0);
        this.setH(0);
        this.setF(0);
        this.setParent(this);
        this.fils = new ArrayList<Noeud>();
    }

    /**
     * g�n�rer les successeurs
     */
    public ArrayList<Noeud> developper(Noeud solution) {
        int i = 0;
        int n = 0;

        // Chercher l'emplacement de 0 dans le tableau

        for (i = 0; i < this.etat.length; i++) {
            for (n = 0; n < this.etat[i].length; n++) {
                if (this.etat[i][n] == 0) {
                    n=this.etat[i].length;
                    i=this.etat.length;
                }
            }
        }
// g�n�ration des successeurs
         enHaut(i,n, solution);
         enBas(i,n, solution);
         aGauche(i,n, solution);
         aDroite(i,n, solution);

        return fils;
    }
public void enHaut(int i,int n, Noeud solution){
	// Verifier si la case vide peut �tre d�plc�e en Haut
    if ((i - 1) >= 0) {
        // dupliquer l'objet courant
        Noeud f =  this.dupliquer();
        // les deplacements
        f.etat[i][n] = this.etat[i - 1][n];
        f.etat[i - 1][n] = 0;
        f.setG(f.getG() + 1);// ajouter 1 � g car chaque action coute 1

        // Calculer h

            f.setH(calculerH1(f, solution));

            // calculer F
        f.setF(calculerF(f.getG(), f.getH()));
        f.parent=this;
        fils.add(f);// Ajouter le noeud � la liste des successeurs
    }
}
//******************* faire le mouvement en bas ***********************************//
public void enBas(int i,int n, Noeud solution){

        if (i +2 <=2){
            Noeud f = this.dupliquer();
            f.etat[i][n] = this.etat[i+1][n];
            f.etat[i+1][n] = 0;
            f.setG(f.getG() + 1);// ajouter 1 � g car chaque action coute 1

            // Calculer h

            f.setH(calculerH1(f, solution));

            // calculer F
            f.setF(calculerF(f.getG(), f.getH()));
            f.parent=this;
            fils.add(f);// Ajouter le noeud � la liste des successeurs

        }
}
//******************* faire le mouvement  � gauche ***********************************//
public void aGauche(int i,int n, Noeud solution){

        if(n>0){
            Noeud f = this.dupliquer();
            f.etat[i][n] = this.etat[i][n-1];
            f.etat[i][n-i] =0;
            f.setG(f.getG() + 1);// ajouter 1 � g car chaque action coute 1

            // Calculer h

            f.setH(calculerH1(f, solution));

            // calculer F
            f.setF(calculerF(f.getG(), f.getH()));
            f.parent=this;
            fils.add(f);// Ajouter le noeud � la liste des successeurs



        }
}
//******************* faire le mouvement  � droite ***********************************//
public void aDroite(int i,int n, Noeud solution){
    if(n<0){
        Noeud f = this.dupliquer();
        f.etat[i][n] = this.etat[i][n+1];
        f.etat[i][n+i] =0;
        f.setG(f.getG() + 1);// ajouter 1 � g car chaque action coute 1

        // Calculer h

        f.setH(calculerH1(f, solution));

        // calculer F
        f.setF(calculerF(f.getG(), f.getH()));
        f.parent=this;
        fils.add(f);// Ajouter le noeud � la liste des successeurs



    }
	}
    /**
     * Convertir un �tat en un String
     */
    @Override
    public String toString() {
        String string = "g:" + g + " , h: " + h  + " ,F="+(g+h) + "\n";
        string += "-------------\n";

        for (int i = 0; i < this.etat.length; i++) {
            string += "| ";
            for (int n = 0; n < this.etat[i].length; n++) {
                string += this.etat[i][n] + ((this.etat[i][n] > 9) ? " | " : "  | ");
            }
            string += "\n";
        }
        string += "-------------\n";

        return string;
    }


    /**
     * Calculer f
     */
    private static int calculerF(int g, int h) {
        return g + h;
    }

    /**
     * Calculer l'heuristique : nombre de cases mal plac�es
     *
     *
     */
    public static int calculerH1(Noeud noeudCourant, Noeud solution) {
        int h=0;
        for(int i = 0;i < 3 ;i++) {
            for(int j = 0;i < 3 ;j++) {
                if(noeudCourant.etat[i][j]!=solution.etat[i][j])
                    h++;
            }
        }

       return h;
    }

    /**
     * dupliquer un noueud
     *
     *
     */
    public Noeud dupliquer() {
        Noeud taquinstate = new Noeud(this);

        int[][] state = new int[this.getEtat().length][this.getEtat().length];

        // copier manuelement la matrice
        for (int i = 0; i < this.getEtat().length; i++) {
            for (int n = 0; n < this.getEtat()[i].length; n++) {
                state[i][n] = this.getEtat()[i][n];
            }
        }

        taquinstate.setEtat(state);

        return taquinstate;
    }

    /**
     * Comparer 2 etats du taquin
     *
     *
     */
    @Override
    public boolean equals(Object object) {
        if (object != null && object instanceof Noeud) {
            Noeud noeud = (Noeud) object;

            // Comparer deux �tats
            for (int i = 0; i < this.etat.length; i++) {
                for (int n = 0; n < this.etat[i].length; n++) {
                    if (this.etat[i][n] != noeud.etat[i][n]) {
                        return false;
                    }
                }
            }

            return true;
        }

        return false;
    }
//-----Comparer deux noeud en utilisant F--------------
	public int compareTo(Object o) {
		if(	this.getF()<((Noeud) o).getF())
			return -1;
			else if (this.getF()>((Noeud) o).getF())
				return 1;
			else return 0;
	}

    /**
     * Return g
     *
     * @return g
     */
    public int getG() {
        return this.g;
    }

    /**
     * Set g
     *
     * @param g
     */
    public void setG(int g) {
        this.g = g;
    }

    /**
     * Return h
     *
     * @return h
     */
    public int getH() {
        return this.h;
    }

    /**
     * Set h
     *
     * @param h
     */
    public void setH(int h) {
        this.h = h;
    }

    /**
     * Return f
     *
     * @return f
     */
    public int getF() {
        return this.f;
    }

    /**
     * Set f
     *
     * @param f
     */
    public void setF(int f) {
        this.f = f;
    }

    /**
     * Return state
     *
     * @return state
     */
    public int[][] getEtat() {
        return this.etat;
    }

    /**
     * Set state
     *
     * @param state
     */
    public void setEtat(int[][] state) {
        this.etat = state;
    }

    /**
     * Return parent
     *
     * @return parent
     */
    public Noeud getParent() {
        return this.parent;
    }

    /**
     * Set parent
     *
     * @param parent
     */
    public void setParent(Noeud parent) {
        this.parent = parent;
    }



}
