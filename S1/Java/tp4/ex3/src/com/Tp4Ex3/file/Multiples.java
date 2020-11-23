package com.Tp4Ex3.file;



import java.io.*;
import java.util.Scanner;

public class Multiples {

    private double number;

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public Multiples() {
    }

    public void Remplissant(String file,double n) {
        FileWriter fw = null;
        BufferedWriter ecrire = null;
        this.number = n;
        try {
            fw = new FileWriter(file);
            ecrire = new BufferedWriter(fw);
            Scanner sc = new Scanner(System.in);
            int m=0;
            double x=0;
            System.out.print("saisir nombres de multiples :");
            m = sc.nextInt();
            for(int i=1; i<=m; i++) {
                x=i*n;
                System.out.println(i+" "+x);
                String s=Integer.toString(i);
                String c=Double.toString(x);
                ecrire.write(s);
                ecrire.write("\t");
                ecrire.write(c);
                ecrire.newLine();
            }

            sc.close();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                ecrire.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
