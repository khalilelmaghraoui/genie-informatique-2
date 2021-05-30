package com.set;

import java.util.*;
public class GestionSetObject {
	public static Set<String>set=new HashSet<>();
	public static void main(String[] args) {
		set.add("aa");
		set.add("bb");
		set.add("cc");
		set.add("aa");
		set.add("aa");
		set.add("bb");
		set.add("cc");
		set.add("aa");
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			String s=(String)it.next();
			System.out.println(s);
		}
	}

}
