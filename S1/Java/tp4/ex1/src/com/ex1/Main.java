package com.ex1;

import java.awt.*;
import java.io.*;

public class Main {

    public static void convertirFichierText(String txt_file , String bin_file) {

        File file = new File("C:\\Users\\KURAPIKA.dll\\Desktop\\New folder (2)\\"+txt_file);
        try {
            //txt file
            FileReader fd =new FileReader(file);
            BufferedReader read = new BufferedReader(fd);

            // bin File
            FileOutputStream rd = new FileOutputStream("C:\\Users\\KURAPIKA.dll\\Desktop\\New folder (2)\\"+bin_file);
           DataOutputStream write = new DataOutputStream(rd);

            // copy content

            String line;
            line=read.readLine();
            while (line!=null){
                write.writeBytes(line);
                line=read.readLine();

            }
            System.out.println("the txt has copyed to bin");

            read.close();
            write.close();

        } catch (FileNotFoundException e) {
  //         TODO Auto-generated catch block
          e.printStackTrace();
      } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void convertionBinToTxt( String bin_file){
        try {
            FileInputStream file= new FileInputStream("C:\\\\Users\\\\KURAPIKA.dll\\\\Desktop\\\\New folder (2)\\"+bin_file);
            BufferedInputStream bis = new BufferedInputStream(file);

            DataInputStream read = new DataInputStream(bis);
            int n=read.available();
            byte [] buffer=new byte[n];
            read.read(buffer);
            for(int i=0;i<n;i++) {
                System.out.print((char)buffer[i]);

            }

            read.close();





        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

       // convertirFichierText("khalil.txt", "khalil.bin");

        convertionBinToTxt("khalil.bin");
    }
    }


