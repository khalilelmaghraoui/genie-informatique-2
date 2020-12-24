package com.set;

import java.util.*;
public class GestionSetEtudiant {
	private static Set<Etudiant>set=new HashSet<>();
	public static void main(String[] args) {
		
		/*Etudiant e1=new Etudiant("aa","aaaa",1);
		Etudiant e2=new Etudiant("bb","bbbb",2);
		Etudiant e3=new Etudiant("cc","cccc",3);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e1);
		set.add(e2);
		set.add(e3);*/
		
		set.add(new Etudiant("aa","aaaaaa",1));
		set.add(new Etudiant("bb","bbbbbb",2));
		set.add(new Etudiant("cc","cccccc",3));
		set.add(new Etudiant("aa","aaaaaa",1));
		set.add(new Etudiant("bb","bbbbbb",2));
		set.add(new Etudiant("cc","cccccc",3));
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Etudiant etud=(Etudiant)it.next();
			System.out.println(etud.toString());
		}

	}

}
