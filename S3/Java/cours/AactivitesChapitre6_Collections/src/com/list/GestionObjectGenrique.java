package com.list;

import java.util.*;

public class GestionObjectGenrique {
	private static List<String> liste=new LinkedList<>();
	public static void main(String[] args) {
		liste.add("aa");
		liste.add("bb");
		liste.add("cc");
		liste.add("aa");
		liste.add("bb");
		liste.add("cc");
		
		for(String s:liste) {
			System.out.println(s);
		}

	}

}
