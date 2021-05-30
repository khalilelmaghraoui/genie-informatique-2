package com.Collection;

import java.io.*;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File file= new File("C:\\Users\\KURAPIKA.dll\\Desktop\\test.txt");
        Hashtable<String,Integer> occur = new Hashtable<String, Integer>();
        try{
            FileReader fd= new FileReader(file);
            BufferedReader bfd= new BufferedReader(fd);
            String line;
            while ((line=bfd.readLine())!=null){
                StringTokenizer st = new StringTokenizer(line,"./,!?");
                while(st.hasMoreTokens()){
                    String mot = st.nextToken();
                    if(occur.contains(mot)) occur.put(mot,occur.get(mot)+1);
                    else occur.put(mot,1);
                }


            }

            } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

    }

}

