package exe2;

import java.io.*;
public class Personne implements Serializable {
	private String nom;
	private String prenom;
	transient private String cin;
	public Personne(String nom, String prenom, String cin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + "]";
	}
	
	
}
