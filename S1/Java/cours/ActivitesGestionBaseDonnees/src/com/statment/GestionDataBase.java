package com.statment;

import java.sql.*;

public class GestionDataBase {
	private static Connection con;
	private static Statement stm;
	private static ResultSet res;
	
	public static Connection connectionDataBase(String url,String user) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,user,"");
			
			System.out.println("connexion est reussite");
			return con;
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
			return null;		
		}
		
	}
	
	public static void afficherTous(String url,String user) {
		try {
			con=connectionDataBase(url,user);
			stm=con.createStatement();
			String req="select * from personne";
			res=stm.executeQuery(req);
			//parcours du resultatt obtenu
			while(res.next()) {
				int code=res.getInt(3);//int code=res.getInt("code")
				String nom=res.getString("nom");
				String prenom=res.getString("prenom");
				System.out.println(code+" "+nom+" "+prenom);
						
			}
			
			stm.close();
			con.close();
			
		}catch(Exception e) {System.err.println(e.getMessage());}
	}
	
	public static void insererPersonne(String url,String user, int code, String nom, String prenom) {
		try {
			con=connectionDataBase(url,user);
			stm=con.createStatement();
			String req="insert into personne values('"+nom+"','"+prenom+"',"+code+")";
			stm.executeUpdate(req);
			
			System.out.println("insertion reussite");
			
			stm.close();
			con.close();
			
		}catch(Exception e) {System.err.println(e.getMessage());}
	}
	
	public static void modifierPersonne(String url,String user, int code, String nom, String prenom) {
		try {
			con=connectionDataBase(url,user);
			stm=con.createStatement();
			String req="update personne set nom='"+nom+"',prenom='"+prenom+"' where code="+code;
			stm.executeUpdate(req);
			
			System.out.println("modification reussite");
			
			stm.close();
			con.close();
			
		}catch(Exception e) {System.err.println(e.getMessage());}
	}
	
	public static void supprimerPersonne(String url,String user, int code) {
		try {
			con=connectionDataBase(url,user);
			stm=con.createStatement();
			String req="delete from personne where code="+code;
			stm.executeUpdate(req);
			
			System.out.println("modification reussite");
			
			stm.close();
			con.close();
			
		}catch(Exception e) {System.err.println(e.getMessage());}
	}
	

	public static void main(String[] args) {
		//insererPersonne("jdbc:mysql://localhost:3306/testdb","root",52,"madani","ali");
		//modifierPersonne("jdbc:mysql://localhost:3306/testdb","root",51,"madani mod","ali mod");
		supprimerPersonne("jdbc:mysql://localhost:3306/testdb","root",51);
		
		afficherTous("jdbc:mysql://localhost:3306/testdb","root");

	}

}
