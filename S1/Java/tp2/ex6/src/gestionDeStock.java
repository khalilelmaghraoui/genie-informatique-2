import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

public class gestionDeStock {
    static LinkedList<Produits>list= new LinkedList<>();
    static public void ajouter(Produits produits){
        list.add(produits);

    }
    static public void affich(){
        for (Produits produits: list) {
            System.out.println("type " + produits);

        }

    }

    public static void main(String[] args) {
        Materiel m1 = new Materiel("m1",15.5f,18f);
        Materiel m2= new Materiel ("m2",10f,50f);
        Logiciel l1=new Logiciel ("L1",90,10,"win",new Date(10, Calendar.NOVEMBER,2020));
        ajouter(m1);
        ajouter(m2);
        ajouter(l1);
        affich();
    }
}
