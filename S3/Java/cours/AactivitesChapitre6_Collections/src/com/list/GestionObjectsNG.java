package com.list;

import java.util.*;

public class GestionObjectsNG {
	private static List liste=new LinkedList();
	public static void main(String[] args) {
		
		liste.add("aa");
		liste.add(1);
		liste.add(new Date());
		liste.add(1.2);
		
		//affichage
		
		for(int i=0;i<liste.size();i++) {
			Object o=liste.get(i);
			System.out.println(o.toString());
		}

	}

}
