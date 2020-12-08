package com.Collection;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Paquet<Integer> paqInteger = new Paquet<Integer>(new Integer[5]);

        paqInteger.add(12);
        paqInteger.add(13);
        paqInteger.add(14);
        paqInteger.add(15);
        paqInteger.add(16);



        System.out.println(paqInteger);

        Iterator<Integer> iterator =paqInteger.iterator() ;
        while(iterator.hasNext()) {
            System.out.println(iterator.next() + "  ");
        }

        System.out.println();
        for (Integer E :paqInteger) {
            System.out.println(E+" ");
        }



    }
}
