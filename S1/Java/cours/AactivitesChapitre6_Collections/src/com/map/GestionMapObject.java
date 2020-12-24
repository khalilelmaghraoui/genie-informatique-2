package com.map;

import java.util.*;

public class GestionMapObject {
	public static Map<String, Etudiant>map=new HashMap<>();
	public static void main(String[] args) {
		map.put("a",new Etudiant("aa","aaaaaa",1));
		map.put("b",new Etudiant("bb","bbbbbb",2));
		map.put("c",new Etudiant("cc","cccccc",3));
		
		Collection<Etudiant> liste=map.values();
		for(Etudiant et:liste) {
			System.out.println(et.toString());
		}

	}

}
