package com.list;

import java.util.*;

public class Personne  {
	private String nom;
	private String prenom;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	@Override
	public String toString() {
		return "["+nom + "," + prenom + "," + age + "]";
	}
	
	public static  Comparator<Personne> comparatorAge=new Comparator<Personne>() {
		@Override
		public int compare(Personne p1, Personne p2) {
			return (p1.getAge()-p2.getAge());
		}
	};
	
	public static  Comparator<Personne> comparatorNom=new Comparator<Personne>() {
		@Override
		public int compare(Personne p1, Personne p2) {
			return (p1.getNom().compareTo(p2.getNom()));
		}
	};
	
	/*@Override
	public int compareTo(Personne p) {		
		return age-p.getAge();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (age != other.age)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}*/

}
