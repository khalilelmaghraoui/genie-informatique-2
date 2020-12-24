package com.preparedstatment;

import java.sql.*;

public class GestionBaseDonnees {
	private static Connection con;
	private static PreparedStatement pstm;
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
	public static void afficherParCodeNom(String url,String user, int code, String nom ) {
		try {
			con=connectionDataBase(url,user);
			String req="select * from personne where code=? and nom=?";
			pstm=con.prepareStatement(req);
			
			pstm.setInt(1, code);
			pstm.setString(2, nom);
			
			res=pstm.executeQuery();
			
			//parcours du resultatt obtenu
			while(res.next()) {
				int c=res.getInt(3);//int code=res.getInt("code")
				String n=res.getString("nom");
				String prenom=res.getString("prenom");
				System.out.println(c+" "+n+" "+prenom);
						
			}
			
			pstm.close();
			con.close();
			
		}catch(Exception e) {System.err.println(e.getMessage());}
	}
	
	public static void insererPlusieursPersonnes(String url,String user, int n ) {
		try {
			con=connectionDataBase(url,user);
			String req="insert into personne values(?,?,?)";
			pstm=con.prepareStatement(req);
					
			for(int i=1;i<5;i++) {
				pstm.setString(1, "nom"+100);
				pstm.setString(2, "prenom"+100);
				pstm.setInt(3, i*100);
				pstm.executeUpdate();
			}
			
			System.out.println("insertion reussite");
			
			pstm.close();
			con.close();
			
		}catch(Exception e) {System.err.println(e.getMessage());}
	}
	
	public static void main(String[] args) {
		//afficherParCodeNom("jdbc:mysql://localhost:3306/testdb","root", 40, "nom4");
		insererPlusieursPersonnes("jdbc:mysql://localhost:3306/testdb","root",5);

	}

}
