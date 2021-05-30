package com.Tp4Ex3.file;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ques6 {
    private double j;

    public Ques6(double att) {
        this.j = att;
    }


    public void multipler(String file){
        int i;

        try {
            FileWriter f=new  FileWriter(file);
            BufferedWriter fichier=new BufferedWriter(f);
            for(i=1;i<=5;i++){
                fichier.newLine();
                fichier.write(i+" "+i*j);
            }
            fichier.close();
            f.close();
        } catch (IOException ex) {
            Logger.getLogger(Ques6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Ques6 reel=new Ques6(0.3);
        reel.multipler("entree.txt");
        Ques6 ree=new Ques6(0.5);

        ree.multipler("sortie.txt");









    }









}



