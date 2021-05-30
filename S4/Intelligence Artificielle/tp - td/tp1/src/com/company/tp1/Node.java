package com.company.tp1;

import java.util.ArrayList;

public class Node {

    int[] state;
    /// ={{8, 1, 4}, {0, 3, 5}, {7, 6,2}}
    ArrayList<Node> nodeArrayList;
    Node fils;


    public Node(int [] etat) {
        this();
        setState(etat);

    }

    public  Node() {

    }

    public Node(int[] state, ArrayList<Node> nodeArrayList, Node fils) {
        this.state = state;
        this.nodeArrayList = nodeArrayList;
        this.fils = fils;
    }

    public boolean estBut(){
        for (int i=0;i<8 ;i++){
            if(this.state[i]==i) return true;
            else {
               break;
            }
        }
    return true;
    }
    public int[] getState() {
        return state;
    }

    public void setState(int[] state) {
        this.state = state;
    }

    public ArrayList<Node> getNodeArrayList() {
        return nodeArrayList;
    }

    public void setNodeArrayList(ArrayList<Node> nodeArrayList) {
        this.nodeArrayList = nodeArrayList;
    }

    public Node getFils() {
        return fils;
    }

    public void setFils(Node fils) {
        this.fils = fils;
    }


    public boolean memeEtat(Node a){
        if(this.state== a.state){
            return true;
        }
        else return false;
    }
    public  void affiche(Node node)
    {
        for (int i = 0; i < 7; i++) {
            System.out.print(node.state[i] + " ");
        }

    }

    public void enBas(int i){
        int tmp;
               if (i<6){
                   tmp = state[i];
                   state[i]=state[i+3];
                   state[i+3]=state[i];
               }
               else {
                   System.out.println("no move");
               }
           }
    public void aDroite(int i){
        if(i%3 < 2){
            this.state[i] = this.state[i + 1];
            this.state[i + 1] = 0;
        }
        else {
            System.out.println("no move");
        }
    }

    public void enHaut(int i){
        int tmp;

            if (i>2){
                tmp = state[i];
                state[i]=state[i-3];
                state[i-3]=state[i];
            }
            else {
                System.out.println("no move");
            }

    }
    public void aGauche(int i){
        if(i%3 > 0){
            this.state[i] = this.state[i - 1];
            this.state[i - 1] = 0;
        }
        else {
            System.out.println("no move");
        }

    }
    public int indexOfZero(Node node){
        int index = -1;
        for (int i=0 ; i<node.state.length ; i++)
        {
            if (node.state[i]==0){
                index=i;
                break;
            }

        }
        return index;
    }

    public ArrayList<Node> developper(){

        ArrayList<Node> filsNode = new ArrayList<Node>();
        Node fils = new Node();


        int i = indexOfZero(this);

                this.aGauche(i);
        filsNode.add(this);
                this.enBas(i);
        filsNode.add(this);
                this.enHaut(i);
        filsNode.add(this);
                this.aDroite(i);
        filsNode.add(this);




        return filsNode;

    }



}
