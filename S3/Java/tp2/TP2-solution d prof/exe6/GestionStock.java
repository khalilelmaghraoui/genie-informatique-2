package exe6;

import java.util.*;
public class GestionStock {

	static LinkedList<Produit> liste=new LinkedList<Produit>();
	
	static public void ajouter(Produit p) {
		liste.add(p);
	}
	
	static public void afficher() {
		for(Produit p:liste) {
			System.out.println("Type:"+p.getNature());
		}
	}
	public static void main(String[] args) {
		
			
		//Produit p=new Materiel("m3",15.5f,10f);
		//Produit p2=new Logiciel("l2",20.0f,1000f,"edi1",new Date(10,10,2020));
				
				
				
			Materiel m1=new Materiel("m1",15.5f,10f);
			Materiel m2=new Materiel("m2",25.5f,150f);
			
			Logiciel l1=new Logiciel("l1",10.0f,100f,"edi1",new Date(10,10,2020));
			Logiciel l2=new Logiciel("l2",20.0f,1000f,"edi1",new Date(10,10,2020));
			
			ajouter(m1);
			ajouter(m2);
			ajouter(l1);
			ajouter(l2);
			
			afficher();					
	}

}
