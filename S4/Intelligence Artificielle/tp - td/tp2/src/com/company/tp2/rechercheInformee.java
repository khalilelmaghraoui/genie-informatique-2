package com.company.tp2;



import java.util.ArrayList;


public class rechercheInformee {

    /**
     * @param r�soudre le taquin
     * @param en       utilisant A* avec l'heuristique suivante :h1= nombre de pi�ces mal plac�e
     * @param
     */
    public static void aEtoile(Taquin taquin) {

        ArrayList<Noeud> chemin = new ArrayList<Noeud>();
        // La liste OPEN
        ArrayList<Noeud> OPEN = new ArrayList<Noeud>();
        //
        ArrayList<Noeud> CLOSED = new ArrayList<Noeud>();
        ArrayList<Noeud> sucesseurs = new ArrayList<Noeud>();
        final long tempsDebut = System.currentTimeMillis();// pour calculer le temps n�cessaire � la r�solution du taquin
        final long tempsFin;                                    // Ce temps est n�cessaire pour comparer  deux heuristiques

        // initialiser la liste OPEN par l'etat initial
        Noeud n = new Noeud(taquin.getEtatInitial());
        n.setH(taquin.getEtatInitial().calculerH1(taquin.getEtatInitial(), taquin.getEtatSolution()));
        OPEN.add(n);
        // Algorithme A*
        int c = 0;



    }

	public static ArrayList<Noeud> construireChemin(Noeud noeud) {
		Noeud noeudCourant=noeud;
		ArrayList<Noeud> chemein=new ArrayList<Noeud>();
		chemein.add(noeudCourant);
		while(noeudCourant.parent!=null) {
			noeudCourant=noeudCourant.parent;
			chemein.add(noeudCourant);
		}
		return chemein;
	}
}
