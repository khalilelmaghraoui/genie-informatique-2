package com.Tp4Ex3.file;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//10. Écrire un programme permettant de
// numéroter les lignes d’un fichier. Si le fichier
// de sortie s’appelle a.txt, celui de sortie s’appellera
// a-num.txt. Le nom du fichier d’entrée sera demandé à l’utilisateur.

public class ques10 {
    public static void Ecrire(String file,String [] tab){
        try {
            FileWriter filewriter=new FileWriter(file);
            for(String i:tab){
                filewriter.write(" "+i);
            }

            filewriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ques10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        String [] tab={"ensah","ecole","hoceima"};

        ques10.Ecrire("Ecrire.txt",tab);



    }









}





