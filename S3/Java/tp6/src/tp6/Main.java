package tp6;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    private static Connection con;
    private static PreparedStatement pstm;
    private static ResultSet res;

    public static Connection connectionDataBase(String url,String user) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,"");

            System.out.println("connexion est reussite");
            return con;

        }catch(Exception e) {
            System.err.println(e.getMessage());
            return null;
        }

    }
    public static ArrayList<String> afficherParM(String url, String user) {
        try {
            con=connectionDataBase(url,user);

            String req="SELECT matricul ,nom,prenom,niveau FROM etudiant WHERE nom LIKE 'k%'" ;
            pstm=con.prepareStatement(req);
            ResultSet resultSet = pstm.executeQuery();
            ArrayList<String> array = new ArrayList<String>();
            while (resultSet.next()){
              //  System.out.println(resultSet.getString("nom"));
                System.out.println(resultSet.getString("matricul"));
                System.out.println(" ");
                System.out.println(resultSet.getString("nom"));
                System.out.println(" ");
                System.out.println(resultSet.getString("prenom"));
                System.out.println(" ");
                System.out.println(resultSet.getString("niveau"));
                array.add(resultSet.getString("nom"));
            }
            System.out.println("done");
            return array;



        }catch(Exception e) {
            System.err.println(e.getMessage());}
        return null;
    }
    public static ArrayList<String> afficherParS(String url, String user) {
        try {
            con=connectionDataBase(url,user);

            String req="SELECT matricul ,nom,prenom,niveau FROM etudiant WHERE nom LIKE '%s'" ;
            pstm=con.prepareStatement(req);
            ResultSet resultSet = pstm.executeQuery();
            ArrayList<String> array = new ArrayList<String>();
            while (resultSet.next()){
              //  System.out.println(resultSet.getString("nom"));
                System.out.println(resultSet.getString("matricul"));
                System.out.println(" ");
                System.out.println(resultSet.getString("nom"));
                System.out.println(" ");
                System.out.println(resultSet.getString("prenom"));
                System.out.println(" ");
                System.out.println(resultSet.getString("niveau"));
                array.add(resultSet.getString("nom"));

            }
            System.out.println("done");
            return array;



        }catch(Exception e) {
            System.err.println(e.getMessage());}
        return null;
    }
    public static ArrayList<String> afficheGI2(String url, String user) {
        try {
            con=connectionDataBase(url,user);

            String req="SELECT * from etudiant " ;
            pstm=con.prepareStatement(req);
            ResultSet resultSet = pstm.executeQuery();
            ArrayList<String> array = new ArrayList<String>();
            while (resultSet.next()){
              //  System.out.println(resultSet.getString("nom"));
                System.out.print(resultSet.getString("matricul"));
                System.out.print(" ");
                System.out.print(resultSet.getString("nom"));
                System.out.print(" ");
                System.out.print(resultSet.getString("prenom"));
                System.out.print(" ");
                System.out.print(resultSet.getString("niveau"));
                System.out.print(" ");
                System.out.print(resultSet.getString("date"));
                System.out.println("////");
                array.add(resultSet.getString("nom"));
            }
            System.out.println("done");
            return array;



        }catch(Exception e) {
            System.err.println(e.getMessage());}
        return null;
    }
    public static ArrayList<String> afficheExamen(String url, String user) {
        try {
            con=connectionDataBase(url,user);

            String req="SELECT * from examen where note !='null' " ;
            pstm=con.prepareStatement(req);
            ResultSet resultSet = pstm.executeQuery();
            ArrayList<String> array = new ArrayList<String>();
            while (resultSet.next()){
              //  System.out.println(resultSet.getString("nom"));
                System.out.print(resultSet.getString("matricul"));
                System.out.print(" ");
                System.out.print(resultSet.getString("note"));
                System.out.println("////");
                array.add(resultSet.getString("note"));
            }
            System.out.println("done");
            return array;



        }catch(Exception e) {
            System.err.println(e.getMessage());}
        return null;
    }
    public static ArrayList<String> moyenne(String url, String user) {
        try {
            con=connectionDataBase(url,user);

            String req="SELECT AVG(note) FROM examen " ;
            pstm=con.prepareStatement(req);
            ResultSet resultSet = pstm.executeQuery();
            ArrayList<String> array = new ArrayList<String>();
            while (resultSet.next()){
                System.out.println(resultSet.getString("note"));
              //  System.out.println(resultSet.getString("nom"));
//                System.out.print(resultSet.getString("matricul"));
//                System.out.print(" ");
//                System.out.print(resultSet.getString("note"));
                System.out.println("////");
                array.add(resultSet.getString("note"));
            }
            System.out.println("done");
            return array;



        }catch(Exception e) {
            System.err.println(e.getMessage());}
        return null;
    }
    public static ArrayList<String> treeParDate(String url, String user) {
        try {
            con=connectionDataBase(url,user);

            String req="SELECT * FROM etudiant ORDER BY date DESC" ;
            pstm=con.prepareStatement(req);
            ResultSet resultSet = pstm.executeQuery();
            ArrayList<String> array = new ArrayList<String>();
            while (resultSet.next()){
              //  System.out.println(resultSet.getString("nom"));
                System.out.println(resultSet.getString("matricul"));
                System.out.println(" ");
                System.out.println(resultSet.getString("nom"));
                System.out.println(" ");
                System.out.println(resultSet.getString("prenom"));
                System.out.println(" ");
                System.out.println(resultSet.getString("niveau"));
                System.out.println(" ");
                System.out.println(resultSet.getString("date"));
                array.add(resultSet.getString("nom"));
            }
            System.out.println("done");
            return array;



        }catch(Exception e) {
            System.err.println(e.getMessage());}
        return null;
    }

    public static void insererEtudiant(String url, String user,String Matricul , String Nom , String Prenom ,Date date , String Niveau) {
        try {
            con=connectionDataBase(url,user);
            String req="insert into etudiant values(?,?,?,?,?)";
            pstm=con.prepareStatement(req);

            for(int i=0;i<5;i++) {
                pstm.setString(1,Matricul);
                pstm.setString(2, Nom);
                pstm.setString(3, Prenom);
                pstm.setDate(4, date);
                pstm.setString(5,Niveau);
                pstm.executeUpdate();
            }

            System.out.println("insertion reussite");

            pstm.close();
            con.close();

        }catch(Exception e) {System.err.println(e.getMessage());}
    }
    public static void insererExamen(String url, String user,String Matricul ,String code , float Note) {
        try {
            con=connectionDataBase(url,user);
            String req="insert into examen values(?,?,?)";
            pstm=con.prepareStatement(req);

            for(int i=0;i<3;i++) {
                pstm.setString(1,Matricul);
                pstm.setString(2, code);
                pstm.setFloat(3,Note);

                pstm.executeUpdate();
            }

            System.out.println("insertion reussite d'examen");

            pstm.close();
            con.close();

        }catch(Exception e) {System.err.println(e.getMessage());}
    }
    public static void insererCours(String url, String user,String code ,String nomCours , String enseignant) {
        try {
            con=connectionDataBase(url,user);
            String req="insert into cours values(?,?,?)";
            pstm=con.prepareStatement(req);

            for(int i=0;i<3;i++) {
                pstm.setString(1,code);
                pstm.setString(2, nomCours);
                pstm.setString(3,enseignant);

                pstm.executeUpdate();
            }

            System.out.println("insertion reussite d'cours");

            pstm.close();
            con.close();

        }catch(Exception e) {System.err.println(e.getMessage());}
    }

    public static void suprimer(String url ,String user , String Mat){
        try{
           // con=connectionDataBase(url,user);
           // String req="delete from etudiant where matricul="+Mat+"";
            Statement statement = con.createStatement();
            statement.execute("delete from etudiant where matricul='+Mat+'");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {


     //  insererEtudiant("jdbc:mysql://localhost:3306/sqql","root","A1","khalilooo","el maghraouioo", java.sql.Date.valueOf("1999-09-04"),"4 eme");
       insererEtudiant("jdbc:mysql://localhost:3306/sqql","root","A2","abir","el maghraoui", java.sql.Date.valueOf("2000-09-04"),"1 er");
      //  insererEtudiant("jdbc:mysql://localhost:3306/tp6","root","A3","manal","el maghraoui", java.sql.Date.valueOf("2018-09-04"),"3 eme");

   // insererExamen("jdbc:mysql://localhost:3306/tp6","root","A1","A11",19.5f);
     //   insererExamen("jdbc:mysql://localhost:3306/tp6","root","A2","A22",10f);
     //   insererExamen("jdbc:mysql://localhost:3306/tp6","root","A3","A33",17.5f);

   //  insererCours("jdbc:mysql://localhost:3306/tp6","root","A11","JAVA" ,"M.bahri");
    //    insererCours("jdbc:mysql://localhost:3306/tp6","root","A22","JAVA" ,"M.bahri");
     //   insererCours("jdbc:mysql://localhost:3306/tp6","root","A33","JAVA" ,"M.bahri");

     /// Statement statement = con.createStatement();
//      statement.execute("DELETE FROM etudiant WHERE matricul='A1'");
       // statement.execute("select etudiant FROM tp6 WHERE prenom Like '%m'");
       // afficherParM("jdbc:mysql://localhost:3306/tp6","root");

       // treeParDate("jdbc:mysql://localhost:3306/tp6","root");
       // afficheGI2("jdbc:mysql://localhost:3306/tp6","root");
       // afficheExamen("jdbc:mysql://localhost:3306/tp6","root");
       // moyenne("jdbc:mysql://localhost:3306/tp6","root");





    }

}
