package com.company.Nomenclature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


 // Exercice 2 :
 // lors la representation d'une objet avec la methode  toString on peut avoir des erreurs d'exuction car on peut trouve pleusieurs pieces dans la nomenclature


public class Nomenclature {
    private String nom;
    LinkedList<Piece> list = new LinkedList<Piece>();

    public void ajouter(Piece piece){
        list.add(piece);
    }

    public Nomenclature() {
    }

    public Nomenclature(String nom, LinkedList<Piece> list) {
        this.nom = nom;
        this.list = list;
    }

    @Override
    public String toString() {
        System.out.println("      \"Nomenclature{\" +\n" +
            "                        \"nom='\" + nom + '\\'' +" +
            "");
        for (Piece piece : list
             ) {

            try {
                return


                        ", list=" + piece +
                        '}';
            }
            catch (Exception exception ){
                System.out.println(" exception  ");

            }

        }

        return "=================";

    }

    public boolean recherche(int reference){

        for (Piece e : list
             ) {
            //changer le nomes d variables
            if(e.idReference == reference)
            {
                return true;
            }
            else return false;

        }
        return false;

    }
    // had l methode rah sahla , ana ma3rftch kifach strutre li dayr nta f ex1 eliha madertoch

    public void afficherPieceComposite(Piece piece){




    }
    // had l methode rah sahla , ana ma3rftch kifach strutre li dayr nta f ex1 eliha madertoch

    public void  remove(Piece piece){
        if (){
            piece.remove();
        }
        else {
            System.out.println("on peut pas supprimer la piece");
        }
    }
    // methode dans mainPiece

    public void menu(){
        System.out.println("menu");
        System.out.println("" +
            "1-Nouvelle nomenclature\n" +
            "2-Ajouter une piece sans ces composants\n" +
            "3-Afficher la nomenclature\n" +
            "4-Liste les pieces de meme d´enomination\n" +
            "5-Ajouter un composant `a une pi`ece\n" +
            "6-Afficher tous les d´etails d’une piece\n" +
            "7-Supprimer une piece");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String n = reader.readLine();
            switch (n){
                case "1":
                    new Nomenclature();
                    break;
                case "2":
                    toString();
                    break;
                case  "3":






            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

