package com.Tp4Ex3;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    //Ecrire un programme en java permettant de lire les données stockées
    // dans un fichier "file/entree.txt", et les copier dans un fichier de sortie
    // "file/sortie.txt", selon ou ligne par ligne.
    public static void  copyByLine(String entreeFile , String Soritefile) throws IOException{
        File file = new File("C:\\Users\\KURAPIKA.dll\\Desktop\\gi2\\S1\\Java\\tp4\\ex3\\src\\com\\Tp4Ex3\\file\\"+entreeFile);
        Scanner scanner = new Scanner(file);
        String transfer = "";
        while(scanner.hasNextLine()){
            transfer = transfer.concat(scanner.nextLine()+"\n");
        }
        FileWriter fileWriter =new FileWriter("C:\\Users\\KURAPIKA.dll\\Desktop\\gi2\\S1\\Java\\tp4\\ex3\\src\\com\\Tp4Ex3\\file\\"+Soritefile);
        fileWriter.write(transfer);
        fileWriter.close();

    }
    //Ecrire un programme en java permettant de lire les données stockées
    // dans un fichier "file/entree.txt", et les copier dans un fichier de sortie
    // "file/sortie.txt", selon ou char by char
    public static void copyByChar(String entreeFile , String Soritefile) throws IOException{
        File file = new File("C:\\Users\\KURAPIKA.dll\\Desktop\\gi2\\S1\\Java\\tp4\\ex3\\src\\com\\Tp4Ex3\\file\\"+entreeFile);
        FileReader fileReader = new FileReader(file);

        FileWriter fileWriter =new FileWriter("C:\\Users\\KURAPIKA.dll\\Desktop\\gi2\\S1\\Java\\tp4\\ex3\\src\\com\\Tp4Ex3\\file\\"+Soritefile);
        int c;
        while((c=fileReader.read())!=-1) {
            fileWriter.write(c);
        }
        fileWriter.close();

    }
    //2. Écrire un programme qui liste en fenêtre console le contenu d’un fichier texte en en numérotant les lignes.
    public static void numLine(String txt_file) throws IOException , InputMismatchException {


        File file = new File("C:\\Users\\KURAPIKA.dll\\Desktop\\gi2\\S1\\Java\\tp4\\ex3\\src\\com\\Tp4Ex3\\file\\"+txt_file);
       Scanner scanner = new Scanner(file);
       int i=0;
       while (scanner.hasNextLine()){

           System.out.println( i +","+scanner.nextLine());
           i++;
       }

    }
    //3. Écrivez un programme Java pour trouver le mot le plus long dans un fichier texte

    public static String  FindLondWord(String txt_file) throws IOException{

        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File("C:\\Users\\KURAPIKA.dll\\Desktop\\gi2\\S1\\Java\\tp4\\ex3\\src\\com\\Tp4Ex3\\file\\"+txt_file));


        while (sc.hasNext()) {
            current = sc.next();            if (current.length() > longest_word.length()) {
                longest_word = current;
            }

        }
        System.out.println("\n"+longest_word+"\n");
        return longest_word;

    }
    //12. Écrire un programme réalisant l'écriture d'un tableau de String dans un fichier texte.
    public static void  StringArrayFile(String txt_file) throws IOException{
     //   12. Écrire un programme réalisant l'écriture d'un tableau de String dans un fichier texte.
        FileWriter writer = new FileWriter("C:\\Users\\KURAPIKA.dll\\Desktop\\gi2\\S1\\Java\\tp4\\ex3\\src\\com\\Tp4Ex3\\file\\"+txt_file);
        String arr[] = { "class", "java", "method", "string", "IO", "file", "void", "Exception", "static" };
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            writer.write(arr[i] + "-");
        }
        writer.close();

    }
//11. Ecrire un programme permettant de remplacer aléatoirement un de ses caractères par « ! ».
    public  static void replaceRandom(String txt_file) throws IOException {
        File file = new File("C:\\Users\\KURAPIKA.dll\\Desktop\\gi2\\S1\\Java\\tp4\\ex3\\src\\com\\Tp4Ex3\\file\\" + txt_file);

        RandomAccessFile out = new RandomAccessFile("txt_file", "rw");

            out.seek((long) (Math.random() * out.length()));
            out.write('!');
            out.close();


        }
//5. Écrire un programme Java permettant d’ajouter le texte à la fin d’un fichier existant.
    public static void AjoutEnFin(String file,String text) throws IOException{
        FileWriter fw = null;
        BufferedWriter ecrire = null;

        fw = new FileWriter(file,true);
        ecrire = new BufferedWriter(fw);

        ecrire.newLine();
        ecrire.write(text);

        System.out.println("the text is well copyed");
        ecrire.close();
        fw.close();
    }
 //9. Écrire un programme permettant à partir d’un fichier
 // texte contenant des lignes, de créer un fichier de sortie qui pour
 // chaque ligne du fichier d’entrée, écrit dans le fichier de sortie
 // la longueur de celle-ci.
    public static void calculerLesLines(String entree, String sortie) {
        try {

            FileReader file = new FileReader(entree);
            BufferedReader reader = new BufferedReader(file);
            FileWriter output = new FileWriter(sortie);
            BufferedWriter writer = new BufferedWriter(output);
            String data;
            int i = 1;
            while((data = reader.readLine()) != null){
                System.out.println("Line "+ i + ": " + data.length());
                writer.write("Line  "+ i + ": " + data.length() + "\n");
                i++;
            }
            System.out.println("fin ");
            reader.close();
            writer.close();
            file.close();
        }catch(EOFException e) {
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {}
    }



    public static void main(String[] args) throws IOException{
//        copyByLine("entree.txt","sortie.txt");
//        System.out.println("the file is well coped");
//
//        copyByChar("entree.txt","sortie2.txt");\
      //  numLine("entree.txt");
        String longestWord= FindLondWord("sortie2.txt");

        StringArrayFile("test.txt");


    }
}
