package com.Collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

	// write your code here
        SortedSet<Produit> produits = new TreeSet<Produit>();
        produits.add(new Produit("Iphone 12 " , 120100));
        produits.add(new Produit("Iphone  " , 991100));
        produits.add(new Produit("Iphone 12 max " , 12000));

        for (Produit p : produits
             ) {
            System.out.println(p.toString());

        }
        // tri selon le designiation
        SortedSet<Produit> set2 = new TreeSet<>(new Comparator<Produit>() {
            @Override
            public int compare(Produit o1, Produit o2) {
                return o1.getDesign().compareTo(o2.getDesign());
            }
        });
        set2.addAll(produits);

        for (Produit p : set2
        ) {
            System.out.println(p.toString());

        }

    }

}
