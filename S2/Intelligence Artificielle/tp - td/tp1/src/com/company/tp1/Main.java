package com.company.tp1;

public class Main {

    public static void main(String[] args) {


       int[] firstState ={1,0,3,4,5,8,7,2};
        Node node = new Node(firstState);
        Exploration but= new Exploration();
        but.rechercher(node);



    }
}
