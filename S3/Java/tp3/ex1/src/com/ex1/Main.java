package com.ex1;

import java.util.Objects;

public class Main {

    public static void main(String[] args)  {
	// write your code here
//      int a=5;
//      int b=0;
//
//    int res = a/b; // Exception in thread "main" java.lang.ArithmeticException: / by zero at com.ex1.Main.main(Main.java:10)
//
//        System.out.println("le resultat = " + res);

        int a=5;
        int b=2;
        int res=0;

        try {
             res = a/b;

        }catch (ArithmeticException e){
            if(b==0){
                b=1;
                System.out.println(a/b);

            }
        }
        System.out.println(res);


    }


}
