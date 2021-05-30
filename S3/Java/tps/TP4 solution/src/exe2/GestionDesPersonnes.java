package exe2;

import java.io.*;
public class GestionDesPersonnes {

	// question 1
	public static void ecrirePersone(String file, Personne p) {

		try {
            FileOutputStream fos = new FileOutputStream(file);

		ObjectOutputStream ecrire=new ObjectOutputStream(fos);
		ecrire.writeObject(p);
		System.out.println("la creation est fait avec succes");
		ecrire.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//question 2
	public static void lireFichierBinaire(String file_binaire) {
		try {
			FileInputStream fis=new FileInputStream(file_binaire);
			ObjectInputStream lire=new ObjectInputStream(fis);

			Personne per=(Personne)lire.readObject();
			while(per!=null) {
				System.out.println(per.toString());
				per=(Personne)lire.readObject();
			}

		} catch(EOFException e) {
			System.out.println("c'est la fin du fichier");
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// question3

	public static void affichePersoneNomCommenceParCaractere(String file_binaire, char c) {
		try {
			FileInputStream fis=new FileInputStream(file_binaire);
			ObjectInputStream lire=new ObjectInputStream(fis);

			Personne per=(Personne)lire.readObject();
			String nom=per.getNom();
			char c1=nom.charAt(0);
			while(per!=null) {
				if(c1==c)System.out.println(per.toString());
				per=(Personne)lire.readObject();
				nom=per.getNom();
				c1=nom.charAt(0);

			}

		} catch(EOFException e) {
			System.out.println("c'est la fin du fichier");
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		/*Personne p=new Personne("madani","ali", "c12458");
		ecrirePersone("d:\\listePersonne.bin",p);*/
		//lireFichierBinaire("d:\\listePersonne.bin");
		affichePersoneNomCommenceParCaractere("d:\\listePersonne.bin",'m');

	}

}
