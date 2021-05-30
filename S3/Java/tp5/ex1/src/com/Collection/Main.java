package com.Collection;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> intNbr = new ArrayList<>();

       // intCopy.add(11111);
        intNbr.add(12);
        intNbr.add(13);
        intNbr.add(1);
        intNbr.add(11);
        intNbr.add(10);
//        Collections.sort(intNbr);
        printList(intNbr);

        intNbr.add(4,1100);
        intNbr.add(2,123);

        printList(intNbr);
        List<Integer> intCopy = new LinkedList<>(intNbr);
        intCopy.add(2,1);
        intCopy.add(1,13);
        printList(intCopy);
        intCopy.clear();
        printList(intCopy);

        List<Integer> vector= new Vector<>(intNbr);
        vector.add(0);
        vector.add(0);
        vector.add(0);
        vector.add(0);
        printList(vector);
    }
    public static void printList(List<Integer> list){
//        for (Integer list1 : list) {
//            System.out.println(list1);
//
//        }
        System.out.println(list);
        System.out.println("========================================");
    }
}
