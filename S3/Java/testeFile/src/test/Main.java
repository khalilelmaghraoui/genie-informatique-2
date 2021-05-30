package test;

import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Map;

public class Main {
    public static void converter(String file_txt,String file_bin){

        File file= new File(file_txt);
        try
        {
        FileReader fileReader = new FileReader(file_txt);
        BufferedReader bu = new BufferedReader(fileReader);

        FileOutputStream fos = new FileOutputStream(file_bin);
        DataOutputStream ecrire = new DataOutputStream(fos);


        String line;
        line = bu.readLine();
        while (line!=null) {
            ecrire.writeBytes(line);
            line = bu.readLine();
        }
        ecrire.close();
        bu.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e){
            e.printStackTrace();

        }
    }
    public static void converter(String file){

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            DataInputStream readd = new DataInputStream(bufferedInputStream);
            int n = readd.available();


            byte[] bufer =new byte[n];

            readd.read(bufer);

for (int i = 0 ; i<n ;i++){
    System.out.print((char)bufer[i]);
}

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

	// write your code here
    }
}
