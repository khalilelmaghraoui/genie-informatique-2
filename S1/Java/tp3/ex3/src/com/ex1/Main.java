package com.ex1;

public class Main {

    public static void main(String[] args) throws PilePlien, PileVide {
	// write your code here
        Pile p = new Pile();
        try {
            p.empiler("hhh");
            p.depiler();
            p.depiler();
            System.out.println("est aller");

        } catch (PileVide | PilePlien e) {
           e.printStackTrace();
       }

    }
}
