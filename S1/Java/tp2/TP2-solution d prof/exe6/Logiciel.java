package exe6;

import java.util.*;
public class Logiciel implements Produit{
	
	private String designation;
	private float prixUnitaire;
	private float quantite;
	private String editeur;
	private Date anneeEdition;
	
	public Logiciel (String des, float pu, float qte, String edi, Date ae) {
		designation=des;
		prixUnitaire=pu;
		quantite=qte;
		editeur=edi;
		anneeEdition=ae;
	}
	public String getDesignation() {
		return designation;
	}
	public float getPrixUnitaire () {
		return prixUnitaire;
	}
	public float getQuantité() {
		return quantite;
	}
	public char getNature() {
		return 'L';
	}

	
}