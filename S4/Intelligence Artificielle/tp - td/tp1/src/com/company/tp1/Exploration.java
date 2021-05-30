package com.company.tp1;



import java.util.ArrayList;


public class Exploration {

    public Exploration() {

    }

    public ArrayList<Node>rechercher(Node racine){

        ArrayList<Node> OPEN=new ArrayList<Node>();

        ArrayList<Node> CLOSED=new ArrayList<Node>();

        ArrayList<Node> chemin=new ArrayList<Node>();

        Node currentNode;

        boolean solutionTrouve=false;
        while(!solutionTrouve && OPEN.size()>0) {
            currentNode=OPEN.get(0);
            CLOSED.add(currentNode);
            OPEN.remove(0);
            currentNode.developper();


            for(int i=0;i<currentNode.fils.size();i++) {

                Node currentFils=currentNode.fils.get(i);

                if(currentFils.estBut()) {
                    solutionTrouve=true;
                    System.out.println("Goal Found");
                    i=currentNode.fils.size();
                    chemin=construireChemin(currentFils);

                    for(int j=chemin.size()-1;j>=0;j--)
                    {	System.out.println("===>");
                        chemin.get(j).affiche(currentNode);


                    }
                }
                else if(!contient(OPEN,currentFils) && !contient(CLOSED,currentFils)) {
                    OPEN.add(currentFils);
                }
            }

        }

        return chemin;

    }
    public static boolean contient(ArrayList<Node> list, Node node) {
        boolean contient=false;
        for(int i=0;i<list.size();i++)
            if(list.get(i).memeEtat(node)) {
                contient=true;
                i=list.size();
            }
        return contient;
    }
    public static ArrayList<Node> construireChemin(Node node) {
        Node currentNode=node;
        ArrayList<Node> chemein=new ArrayList<Node>();
        chemein.add(currentNode);
        while(currentNode.fils!=null) {
            currentNode=currentNode.fils;
            chemein.add(currentNode);
        }
        return chemein;
    }
}
