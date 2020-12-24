package com.list;

import java.util.*;
public class GestionPersonnes {
	private static List<Personne>liste=new LinkedList<>();
	
	public static void main(String[] args) {
		liste.add(new Personne("aa","aaaaaaaaaa",45));
		liste.add(new Personne("dd","ddddd",35));
		liste.add(new Personne("cc","cccccccccc",55));
		liste.add(new Personne("cc","cccccccccc",55));
		
		for(Personne p:liste) {
			System.out.println(p.toString());
		}
		
		//Collections.sort(liste); // redefinir la methode compareTo(Personne p) dans Personne (implements Comparable<Personne>)
		System.out.println("apres le tri");
		Collections.sort(liste, Personne.comparatorNom);
		//liste.sort(Personne.comparatorNom); //correcte
		/*
		for(Personne p:liste) {
			System.out.println(p.toString());
		}*/
		Iterator it=liste.iterator();
		while(it.hasNext()) {
			Personne p=(Personne)it.next();
			System.out.println(p.toString());
		}
		
	}

}
