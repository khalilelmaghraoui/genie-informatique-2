package exe1.q1;

import java.io.*;

public class ConversionTexteToBinaire {

	public static void convertirFichierText(String file_texte, String file_binaire ) {
		File file=new File(file_texte);

		try {
			//fichier texte
			FileReader fd=new FileReader(file);
			BufferedReader lecture=new BufferedReader(fd);

			//fichier d'eciture binaire
			FileOutputStream fos=new FileOutputStream(file_binaire);
			DataOutputStream ecrire=new DataOutputStream(fos);

			// la copie
			String line;
			line = lecture.readLine();
			while(line!=null) {
				ecrire.writeBytes(line);
				line=lecture.readLine();
			}

			System.out.println("le fichier est bien copi� en mode binaire");

			lecture.close();
			ecrire.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void lectureFichierBinaire(String file_binaire) {
		try {
			FileInputStream fis=new FileInputStream(file_binaire);
			BufferedInputStream bis=new BufferedInputStream(fis);
			DataInputStream lecture=new DataInputStream(bis);

			int n=lecture.available();
			byte [] buffer=new byte[n];
			lecture.read(buffer);
			for(int i=0;i<n;i++) {
				System.out.print((char)buffer[i]);

			}

			lecture.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		/*ConversionTexteToBinaire ctb=new ConversionTexteToBinaire();
		ctb.convertirFichierText("d:\\fichier.txt", "d:\\fichier.bin");*/
		//convertirFichierText("d:\\fichier.txt", "d:\\fichier.bin");

		lectureFichierBinaire("d:\\fichier.bin");


	}

}
